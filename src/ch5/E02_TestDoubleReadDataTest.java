package ch5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class E02_TestDoubleReadDataTest {
	@Test
	void testStub() {
		String fileName = "fileName";
		StubDataHandle stubDataHandle = new StubDataHandle();
		DummyData dummyData = new DummyData();
		stubDataHandle.setResult(dummyData);
		
		StubStoreSystem stubStoreSystem = new StubStoreSystem();
		String[] resFromStorySystem = new String[0];
		stubStoreSystem.setResult(resFromStorySystem);
		
		Data res = E02_TestDoubleReadData.read(stubStoreSystem, stubDataHandle, fileName);
		assertEquals(fileName, stubStoreSystem.getCallWithPara());
		assertEquals(1, stubStoreSystem.getCallCount());
		
		assertEquals(resFromStorySystem, stubDataHandle.getCallWithPara());
		assertEquals(1, stubDataHandle.getCallCount());
		
		assertEquals(dummyData.d, ((DummyData)res).d);
	}
	
	@Test
	void testDrive() {
		String fileName = "fileName";
		SingleDataHandle stubDataHandle = new SingleDataHandle();
		
		StubStoreSystem stubStoreSystem = new StubStoreSystem();
		String[] resFromStorySystem = new String[] {"0,1,2,3"};
		stubStoreSystem.setResult(resFromStorySystem);
		
		Data res = E02_TestDoubleReadData.read(stubStoreSystem, stubDataHandle, fileName);
		assertEquals(fileName, stubStoreSystem.getCallWithPara());
		assertEquals(1, stubStoreSystem.getCallCount());
		
		float[] data = ((SingleData)res).data;
		assertEquals(4, data.length);
		assertEquals(0f, data[0]);
		assertEquals(1f, data[1]);
		assertEquals(2f, data[2]);
		assertEquals(3f, data[3]);
	}
}

class DriveReadData extends E02_TestDoubleReadData{
	public static Data read(IStoreSystem iDataSystem, IDataHandle dataHandle, String name ) {
		return dataHandle.deal(iDataSystem.read(name));
	}
}


class DummyData extends Data{
	public int d = 0;
}
class StubStoreSystem extends TestBase implements IStoreSystem{
	@Override
	public String[] read(String fileName) {
		callWith = fileName;
		count ++;
		return (String[])result;
	}
}
class StubDataHandle extends TestBase implements IDataHandle{
	@Override
	public Data deal(String[] readFileByLines) {
		count ++;
		this.callWith = readFileByLines;
		return (Data)result;
	}
}

class TestBase{
	Object callWith;
	int count = 0;
	Object result;
	
	public Object getCallWithPara() {
		return callWith;
	}
	void setResult(Object data) {
		this.result = data;
	}
	int getCallCount() {
		return count;
	}
}