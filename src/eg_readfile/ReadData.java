package eg_readfile;

public class ReadData {
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