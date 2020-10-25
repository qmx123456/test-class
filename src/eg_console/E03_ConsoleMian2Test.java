package eg_console;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class E03_ConsoleMian2Test {

	@Test
	public void should_print_qmx_when_null() {
		PrintStream console = System.out;
		ByteArrayOutputStream bytes = new ByteArrayOutputStream();
		PrintStream printStream = new PrintStream(bytes);
		System.setOut(printStream);
		
		E03_ConsoleMain2.main(null);
		assertEquals("qmx", bytes.toString());
		
		System.setOut(console);
	}
		
	@Test
	public void should_print_xmq_when_not_null() {
		PrintStream console = System.out;
		ByteArrayOutputStream bytes = new ByteArrayOutputStream();
		PrintStream printStream = new PrintStream(bytes);
		System.setOut(printStream);
		
		E03_ConsoleMain2.main(new String[] {});
		assertEquals("xmq", bytes.toString());
		
		System.setOut(console);
	}
	
	

}
