package ch5;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;
public class E07_MockVsSpyTest {
	@Test
	public void mockTest() {
		SubClass mockClass = mock(SubClass.class);
		String s = "mock";
		E07_MockVsSpy.method(mockClass, s);
		verify(mockClass, times(2)).method(s);
	}
	@Test
	public void spyTest() {
		SubClass spyClass = spy(SubClass.class);
		String s = "spy";
		E07_MockVsSpy.method(spyClass,s);
		verify(spyClass, times(2)).method(s);
	}
}







