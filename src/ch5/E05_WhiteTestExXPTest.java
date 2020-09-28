package ch5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class E05_WhiteTestExXPTest {

	@ParameterizedTest(name = "when Max is {0}")
	@ValueSource(ints = {0})
	void should_return_0_when_n_is_0(int max) {
		int n = 0;
		int res = E05_WhiteTestEx.sum(n, max);
		assertEquals(0, res);
	}
	
	@Test
	void should_return_ErrorMes_when_res_is_bigger_than_Max() {
		assertThrows(TooLargeException.class, ()->E05_WhiteTestEx.sum(0, -1));
	}
	
	@Test(expected= IndexOutOfBoundsException.class) 
	  public void empty() { 
	       new ArrayList<Object>().get(0);  
	}
	

    @Test

    @DisplayName("Junit5 built-in Assertions.assertThrows and Assertions.assertAll")

    @Tag("exception-testing")

    void verifiesTypeAndMessage() {

        Throwable throwable = assertThrows(MyRuntimeException.class, new Thrower()::throwsRuntime);

 

        assertAll(

            () -> assertEquals("My custom runtime exception", throwable.getMessage()),

            () -> assertNull(throwable.getCause())

        );

    }
    
    @Test
    public voidtestExceptionMessage() {
          try {
              new ArrayList<Object>().get(0);
              fail("Expected an IndexOutOfBoundsException to be thrown");
          } catch (IndexOutOfBoundsException anIndexOutOfBoundsException) {
              assertThat(anIndexOutOfBoundsException.getMessage(), is("Index: 0, Size: 0"));
          }  
    }
}
