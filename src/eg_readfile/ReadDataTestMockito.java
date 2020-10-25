package eg_readfile;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;
public class ReadDataTestMockito {

	@Test
	public void test() {
		String name = "filepath";

		IStoreSystem mockStoreSystem = Mockito.mock(IStoreSystem.class);
		String[] resForStoreSystem = new String[] {};
		Mockito.when(mockStoreSystem.read(name)).thenReturn(resForStoreSystem);
		
		IDataHandle mockDataHandle = Mockito.mock(IDataHandle.class);
		Data res = new Data();
		Mockito.when(mockDataHandle.deal(resForStoreSystem)).thenReturn(res);
		
		Data data = ReadData.read(mockStoreSystem, mockDataHandle, name);
		
		Mockito.verify(mockStoreSystem).read(name);
		Mockito.verify(mockDataHandle).deal(resForStoreSystem);
		assertEquals(res, data);
	}

}
