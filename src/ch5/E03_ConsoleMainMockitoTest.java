package ch5;

import static org.mockito.Mockito.verify;
import java.io.PrintStream;

import org.junit.Ignore;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


public class E03_ConsoleMainMockitoTest {
    @Test
	public void testWithSpy() {
    	PrintStream console = System.out;
		PrintStream mock = Mockito.spy(console);
    	System.setOut(mock);
		E03_ConsoleMain.main(null);
		verify(mock).print("qmx");
		System.setOut(console);
	}	
    @Test
    @Disabled
    public void testWithMock() {
    	PrintStream console = System.out;
    	PrintStream mockConsole = Mockito.mock(PrintStream.class);
    	System.setOut(mockConsole);
    	E03_ConsoleMain.main(null);
    	verify(mockConsole).print("qmx");
    	System.setOut(console);
    }	

}
