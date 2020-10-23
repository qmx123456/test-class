package ch5;

import static org.junit.Assert.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

public class E03_ConsoleMainTestOnClassRefactor {
	static PrintStream console;
	static ByteArrayOutputStream bytes;
	@BeforeClass
	public static void setup() {
		console = System.out;		
		bytes = new ByteArrayOutputStream();
		System.setOut(new PrintStream(bytes));
	}
    @Test
	public void test() {
    	E03_ConsoleMain.main(null);
		assertEquals("qmx", bytes.toString());

	}
    @AfterClass
    public static void clear() {
    	System.setOut(console);    	
    }
}

