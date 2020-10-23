package ch5;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;
import java.io.PrintStream;

import org.junit.Ignore;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


public class E03_ConsoleMainMockitoTest {
    @Test
    @Disabled
	public void testWithSpy() {
    	PrintStream console = System.out;
		PrintStream consoleSpy = Mockito.spy(console);
    	System.setOut(consoleSpy);
		E03_ConsoleMain.main(null);
		verify(consoleSpy).print("qmx");
		System.setOut(console);
	}	
    @Test
    public void testWithMock() {
    	PrintStream console = System.out;
    	PrintStream mockConsole = Mockito.mock(PrintStream.class);
    	Mockito.doNothing().when(mockConsole).print("qmx");
    	System.setOut(mockConsole);
    	E03_ConsoleMain.main(null);
    	verify(mockConsole).print("qmx");
    	System.setOut(console);
    }	

}
