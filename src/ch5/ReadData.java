package ch5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadData {
	SingleData data;
	void read(IDataHandle dataHandle, String name ) {
		
		dataHandle.deal(data);
	}
	
    public static void readFileByLines(String fileName) {
        File file = new File(fileName);
        BufferedReader reader = null;
        try {
            System.out.println("以行为单位读取文件内容，一次读一整行：");
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1;
            // 一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {
                // 显示行号
                System.out.println("line " + line + ": " + tempString);
                line++;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
    }
}

class Data{
	
}

class SingleData extends Data{
	float[] data;
}

interface IDataHandle{
	void deal(Data d);
}

class SingleDataHandle implements IDataHandle{

	@Override
	public void deal(Data arg0) {
		// TODO Auto-generated method stub		
	}
}



