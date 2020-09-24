package ch5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReadDataTest {
	@Test
	void test() {
		String fileName = "fileName";
		StubDataHandle stubDataHandle = new StubDataHandle();
		DummyData dummyData = new DummyData();
		stubDataHandle.setResult(dummyData);
		
		StubStoreSystem stubStoreSystem = new StubStoreSystem();
		String[] resFromStorySystem = new String[0];
		stubStoreSystem.setResult(resFromStorySystem);
		
		Data res = ReadData.read(stubStoreSystem, stubDataHandle, fileName);
		assertEquals(fileName, stubStoreSystem.getCallWithPara());
		assertEquals(1, stubStoreSystem.getCallCount());
		
		assertEquals(resFromStorySystem, stubDataHandle.getCallWithPara());
		assertEquals(1, stubDataHandle.getCallCount());
		
		assertEquals(dummyData.d, ((DummyData)res).d);
	}
}
class DummyData extends Data{
	public int d = 0;
}
class StubStoreSystem extends SpyBase implements IStoreSystem{
	@Override
	public String[] read(String fileName) {
		callWith = fileName;
		count ++;
		// TODO Auto-generated method stub
		return (String[])result;
	}
}
class StubDataHandle extends SpyBase implements IDataHandle{
	@Override
	public Data deal(String[] readFileByLines) {
		count ++;
		this.callWith = readFileByLines;
		return (Data)result;
	}
}

class SpyBase{
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

