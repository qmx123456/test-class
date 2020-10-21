package ch5;

import static org.junit.Assert.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;

public class E03_ConsoleMainTestOnClass {
    @Test
	public void test() {
    	PrintStream console = System.out;
    	
    	ByteArrayOutputStream bytes = new ByteArrayOutputStream();
    	System.setOut(new PrintStream(bytes));

    	E03_ConsoleMain.main(null);
		assertEquals("qmx", bytes.toString());

		System.setOut(console);
	}	

}






