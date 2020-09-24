package ch5;

public class ReadData {
	public static Data read(IStoreSystem iDataSystem, IDataHandle dataHandle, String name ) {
		return dataHandle.deal(iDataSystem.read(name));
	}
}
interface IStoreSystem{
	String[] read(String fileName);
	
}
class FileSystem implements IStoreSystem{
    public String[] read(String fileName) {
    	//TODO read file
        return null;
    }
}

class Data{
	
}

class SingleData extends Data{
	float[] data;
}

interface IDataHandle{
	Data deal(String[] s);
}

class SingleDataHandle implements IDataHandle{
	@Override
	public Data deal(String[] s) {
		return null;
	}

}



