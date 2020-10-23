package ch5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;


class E02_TestDoubleReadDataMockitoTest {
	@Test
	void test() {
		IStoreSystem mockStore = mock(IStoreSystem.class);
		IDataHandle mockHandle = mock(IDataHandle.class);
		String fileName = "fileName";
		String[] setRes = new String[] {"12"};
		Data data = new Data();
		
		when(mockStore.read(fileName)).thenReturn(setRes);
		when(mockHandle.deal(setRes)).thenReturn(data);
		
		Data res = E02_TestDoubleReadData.read(mockStore, mockHandle, fileName);		
		assertEquals(data, res);
		
		verify(mockStore).read(fileName);
		verify(mockHandle).deal(setRes);
	}
	
	@Test
	void testSyp() {
		String fileName = "fileName";
		String[] setRes = new String[] {"12"};
		Data data = new Data();
		
		FileSystem storeSystem = new FileSystem();
		FileSystem spyStore = Mockito.spy(storeSystem);//浅复制，会多记录调用次数等调用信息
		doReturn(setRes).when(spyStore).read(fileName);
		
		SingleDataHandle spyHandle = Mockito.spy(SingleDataHandle.class);
		doReturn(data).when(spyHandle).deal(setRes);
		
		Data res = E02_TestDoubleReadData.read(spyStore, spyHandle, fileName);		
		assertEquals(data, res);
		verify(spyStore).read(fileName);
		verify(spyHandle).deal(setRes);
		
		verify(spyHandle,times(1)).deal(setRes);
	}
}
