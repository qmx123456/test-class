package ch5;

import static org.junit.Assert.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class E03_ConsoleMain2TestRefactor {
	PrintStream console;
	ByteArrayOutputStream bytes;
	@Before
	public void setup() {
		console = System.out;		
		bytes = new ByteArrayOutputStream();
		System.setOut(new PrintStream(bytes));
	}
    @After
    public void clear() {
    	System.setOut(console);    	
    }
	@Test
	public void test_qmx() {
    	E03_ConsoleMain2.main(null);
		assertEquals("qmx", bytes.toString());
	}	
	@Test
	public void test_xmq() {
		E03_ConsoleMain2.main(new String[] {});
		assertEquals("xmq", bytes.toString());
	}
}
