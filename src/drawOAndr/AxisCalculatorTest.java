package drawOAndr;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class AxisCalculatorTest {
	@ParameterizedTest
	@CsvSource({
	    "1, 0", "0.9, -1", "10, 1","-0.5, -1", "-2.3, 0","-200, 2"
	})
	void testPowCal(float value, int exp) {
		int res = AxisCalculator.calPow(value);
		assertEquals(exp, res);
	}
	
	@ParameterizedTest
	@CsvSource({
		"1, 1", "2.1, 2", "9.9, 5"
	})
	void testPickIntervalBase(float value, float exp) {
		float res = AxisCalculator.pickBaseIntervalFrom(value);
		assertEquals(exp, res);
	}
	
	@ParameterizedTest
	@CsvSource({
		"1, 1", "0.24, 0.2", "0.0056, 0.005","101, 100","99, 50"
	})
	void testPickInterval(float value, float exp) {
		float res = AxisCalculator.pickInterval(value);
		assertEquals(true, isEqual(exp, res));
	}

	private boolean isEqual(float exp, float res) {
		return Math.abs(res-exp) <0.000001f;
	}
	
	@ParameterizedTest
	@CsvSource({
		"2.3, 1, 3", "2.3, 5, 5","-2.3, 1,-2","-0.1,1,0"
	})
	void testFixMax(float max, float interval, float exp) {
		float res = AxisCalculator.fixMaxWith(max, interval);
		assertEquals(true, isEqual(exp, res));
	}

}
