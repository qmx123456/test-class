package ch5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import java.util.LinkedList;
import java.util.List;

class E02_TestDoubleReadDataMockitoTest {
	@Test
	void test() {
		IStoreSystem mockStore = mock(IStoreSystem.class);
		IDataHandle mockHandle = mock(IDataHandle.class);
		String fileName = "fileName";
		String[] s = new String[] {"12"};
		Data data = new Data();
		
		when(mockStore.read(fileName)).thenReturn(s);
		when(mockHandle.deal(s)).thenReturn(data);
		
		Data res = E02_TestDoubleReadData.read(mockStore, mockHandle, fileName);		
		assertEquals(data, res);
		
		verify(mockStore).read(fileName);
		verify(mockHandle).deal(s);
	}
	//TODO spy, mock, dummy, fake, stub
}
