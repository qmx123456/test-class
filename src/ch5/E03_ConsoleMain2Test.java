package ch5;
import static org.junit.Assert.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Test;
public class E03_ConsoleMain2Test {
	@Test
	public void test_qmx() {
    	PrintStream console = System.out;
    	
    	ByteArrayOutputStream bytes = new ByteArrayOutputStream();
    	System.setOut(new PrintStream(bytes));

    	E03_ConsoleMain2.main(null);
		assertEquals("qmx", bytes.toString());

		System.setOut(console);
	}
	@Test
	public void test_xmq() {
		PrintStream console = System.out;
		
		ByteArrayOutputStream bytes = new ByteArrayOutputStream();
		System.setOut(new PrintStream(bytes));
		
		E03_ConsoleMain2.main(new String[] {});
		assertEquals("xmq", bytes.toString());
		
		System.setOut(console);
	}
}



