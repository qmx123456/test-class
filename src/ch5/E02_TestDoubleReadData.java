package ch5;

public class E02_TestDoubleReadData {
	public static Data read(IStoreSystem iDataSystem, IDataHandle dataHandle, String name ) {
		return dataHandle.deal(iDataSystem.read(name));
	}
}
class Data{
}
interface IStoreSystem{
	String[] read(String fileName);	
}
interface IDataHandle{
	Data deal(String[] s);
}


class FileSystem implements IStoreSystem{
    public String[] read(String fileName) {
        return null;
    }
}
class SingleData extends Data{
	public float[] data;
}
class SingleDataHandle implements IDataHandle{
	@Override
	public Data deal(String[] s) {
		if(s.length != 0) {
			String[] split = s[0].split(",");
			SingleData singleData = new SingleData();
			singleData.data = new float[split.length];
			for(int i=0; i<split.length; i++) {
				singleData.data[i] = Float.valueOf(split[i]);
			}
			return singleData;
		}
		return null;
	}
}



