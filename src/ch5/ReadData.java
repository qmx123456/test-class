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
            System.out.println("����Ϊ��λ��ȡ�ļ����ݣ�һ�ζ�һ���У�");
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1;
            // һ�ζ���һ�У�ֱ������nullΪ�ļ�����
            while ((tempString = reader.readLine()) != null) {
                // ��ʾ�к�
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



