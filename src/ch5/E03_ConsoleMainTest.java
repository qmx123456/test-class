package ch5;

import static org.junit.Assert.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class E03_ConsoleMainTest {
	static PrintStream console = null;
	static ByteArrayOutputStream bytes = null;
	
	@BeforeAll
	public static void setUp() {
		console = System.out;
		bytes = new ByteArrayOutputStream();
		System.setOut(new PrintStream(bytes));
	}
	
	@AfterAll
	public static void tearDown() throws Exception {
		System.setOut(console);
	}
	
    @Test
	public void test() {
		E03_ConsoleMain.main(null);
		assertEquals("qmx", bytes.toString());
	}	

}
