package ch5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class E05_WhiteTestExXPTest {
	@ParameterizedTest(name = "when N is {0}, Max is {1}, expect res is {2}")
	@CsvSource({
	    "0,10,0", "4, 10,6"
	})
	void should_return_sum_when_sum_is_smaller_than_max(int n, int max, int expRes) throws TooLargeException {
		int res = E05_WhiteTestEx.sum(n, max);
		assertEquals(expRes, res);
	}

	@Test
	void should_return_ErrorMes_when_res_is_bigger_than_Max() {
		assertThrows(TooLargeException.class, () -> E05_WhiteTestEx.sum(0, -1));
	}
	
	@Test
	void should_throw_ErrorMes_when_res_is_bigger_than_Max_version2() {
		Throwable throwable = assertThrows(TooLargeException.class, ()->E05_WhiteTestEx.sum(0, -1));
		assertAll(() -> assertEquals("Error: too large", throwable.getMessage()));
	}
    
    @Test
    public void should_return_ErrorMes_when_res_is_bigger_than_Max_version3() {
          try {
        	  E05_WhiteTestEx.sum(0, -1);
          } catch (TooLargeException e) {
              assertEquals("Error: too large", e.getMessage());
          }  
    }
}
