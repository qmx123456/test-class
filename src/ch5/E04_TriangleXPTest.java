package ch5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class E04_TriangleXPTest {
	@ParameterizedTest
	@DisplayName("不能构成三角形")
	@CsvSource({
	    "2,3,5","2,5,3","5,2,3"
	})
	void testNotTriangle(ArgumentsAccessor arguments) {
		Double edgeA = arguments.getDouble(0);
		Double edgeB = arguments.getDouble(1);
		Double edgeC = arguments.getDouble(2);
		E04_TriangleStyle ts = E04_TriangleXP.tellStyle(edgeA,edgeB,edgeC);
		assertEquals(E04_TriangleStyle.NotTriangle, ts);
	}
	
	@ParameterizedTest(name = "Edge: {0}、{1}、{2} should build a triangle")
	@CsvSource({
	    "2,3,4"
	})
	void isIrregularTriangle(double edgeA, double edgeB, double edgeC) {
		E04_TriangleStyle ts = E04_TriangleXP.tellStyle(edgeA,edgeB,edgeC);
		assertEquals(E04_TriangleStyle.Irregular, ts);	
	}
	
	@ParameterizedTest(name = "data: \"{0}\" should not be a positive double")
	@DisplayName("verify positive double")
	@ValueSource(strings = { "as", "-1","0" })
	public void isNotPositiveDouble(String s) {
		assertThrows(NumberFormatException.class, ()->E04_TriangleXP.verifyPositiveDouble(s));
	}
}

