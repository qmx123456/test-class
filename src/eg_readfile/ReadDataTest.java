package eg_readfile;

import static org.junit.Assert.*;

import java.awt.Stroke;

import org.junit.Test;

public class ReadDataTest {

	@Test
	public void test() {
		StoreSystemStub storeSystemStub = new StoreSystemStub();
		String[] resForDataSystem = new String[]{};
		storeSystemStub.setResult(resForDataSystem);
		
		DataHandleStub dataHandleStub = new DataHandleStub();
		Data res = new Data();
		dataHandleStub.setResult(res);
		
		String name = "filepath";
		Data data = ReadData.read(storeSystemStub, dataHandleStub, name);
		
		assertEquals(name, storeSystemStub.getPara());
		assertEquals(resForDataSystem, dataHandleStub.getPara());
		assertEquals(res, data);
	}
}

class StoreSystemStub implements IStoreSystem{
	String para;
	String[] res;
	@Override
	public String[] read(String fileName) {
		para = fileName;
		return res;
	}
	public String getPara() {
		return para;
	}
	public void setResult(String[] res) {
		this.res = res;
	}
}

class DataHandleStub implements IDataHandle{
	String[] para;
	Data data;
	@Override
	public Data deal(String[] s) {
		para=s;
		return data;
	}
	public String[] getPara() {
		return para;
	}
	
	public void setResult(Data data) {
		this.data = data;
	}
	
}
