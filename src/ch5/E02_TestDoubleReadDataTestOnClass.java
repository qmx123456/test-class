package ch5;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.objenesis.instantiator.basic.NewInstanceInstantiator;

class E02_TestDoubleReadDataTestOnClass {
	@Test
	void testStub() {
		String fileName = "fileName";
		
		StoreSystemStub stubStoreSystem = new StoreSystemStub();
		String[] resFromStorySystem = new String[0];
		stubStoreSystem.setResult(resFromStorySystem);
		
		DataHandleStub stubDataHandle = new DataHandleStub();
		Data res = new Data();
		stubDataHandle.setResult(res);
		
		Data d = E02_TestDoubleReadData.read(stubStoreSystem, stubDataHandle, fileName);
		assertEquals(fileName, stubStoreSystem.getPara());		
		assertEquals(resFromStorySystem, stubDataHandle.getPara());
		assertEquals(res, d);
	}
}

class StoreSystemStub implements IStoreSystem{
	String para;
	String[] result;

	public String[] read(String fileName) {
		para = fileName;
		return result;
	}
	public Object getPara() {
		return para;
	}
	void setResult(String[] data) {
		this.result = data;
	}
}
class DataHandleStub implements IDataHandle{
	String[] para;
	Data result;

	public Data deal(String[] readFileByLines) {
		this.para = readFileByLines;
		return result;
	}
	public String[] getPara() {
		return para;
	}
	void setResult(Data data) {
		this.result = data;
	}
}