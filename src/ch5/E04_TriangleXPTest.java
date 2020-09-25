package ch5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class E04_TriangleXPTest {

	@ParameterizedTest
	@CsvSource({
	    "2,3,5","2,5,3","5,2,3"
	})
	//a+b, a+c, b+c
	void test1(ArgumentsAccessor arguments) {
		Double edgeA = arguments.getDouble(0);
		Double edgeB = arguments.getDouble(1);
		Double edgeC = arguments.getDouble(2);
		E04_TriangleStyle ts = E04_TriangleXP.tellStyle(edgeA,edgeB,edgeC);
		assertEquals(E04_TriangleStyle.NotTriangle, ts);
	}
	
	@ParameterizedTest
	@ValueSource(ints = {2,3,5})
	//a+b, a+c, b+c
	void test1(int edgeA, int edgeB, int edgeC) {
		System.out.println(edgeA);
		System.out.println(edgeB);
		System.out.println(edgeC);//TODO 解决组合的问题
//		Double edgeA = arguments.getDouble(0);
//		Double edgeB = arguments.getDouble(1);
//		Double edgeC = arguments.getDouble(2);
//		E04_TriangleStyle ts = E04_TriangleXP.tellStyle(edgeA,edgeB,edgeC);
//		assertEquals(E04_TriangleStyle.NotTriangle, ts);
	}
	
	
	@ParameterizedTest
	@CsvSource({
	    "2,3,4"
	})
	void isIrregularTriangle(double edgeA, double edgeB, double edgeC) {
		E04_TriangleStyle ts = E04_TriangleXP.tellStyle(edgeA,edgeB,edgeC);
		assertEquals(E04_TriangleStyle.Irregular, ts);	
	}
	@ParameterizedTest
	@CsvSource({
		"2,3,4"
	})
	void isSameEdgeTriangle(ArgumentsAccessor arguments) {
		Double edgeA = arguments.getDouble(0);
		Double edgeB = arguments.getDouble(1);
		Double edgeC = arguments.getDouble(2);
		E04_TriangleStyle ts = E04_TriangleXP.tellStyle(edgeA,edgeB,edgeC);
		assertEquals(E04_TriangleStyle.Irregular, ts);	
	}
}
