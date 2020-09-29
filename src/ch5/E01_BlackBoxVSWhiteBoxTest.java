package ch5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

class E01_BlackBoxVSWhiteBoxTest {
	@Test
	void testBlackBox() {
		E01_BlackBoxVSWhiteBox bb = new E01_BlackBoxVSWhiteBox();
		assertEquals(10, bb.cal(5.0f));
		assertEquals(10, bb.cal(5.2f));
		assertEquals(10, bb.cal(5.5f));
		assertEquals(10, bb.cal(5.6f));
	}

	@Test
	void testWhiteBox() {
		E01_BlackBoxVSWhiteBox bb = new E01_BlackBoxVSWhiteBox();
		assertEquals(10, bb.cal(5.2f));
	}
	
	@Test
	void testBlackBoxEccentric() {
		BlackBoxVSWhiteBoxEccentricA bb = new BlackBoxVSWhiteBoxEccentricA();
		assertEquals(10, bb.cal(5.0f));
		assertEquals(10, bb.cal(5.2f));
		assertEquals(10, bb.cal(5.5f));
		assertEquals(10, bb.cal(5.6f));
	}
	@Test
	void testWhiteBoxEccentric() {
		BlackBoxVSWhiteBoxEccentricA bb = new BlackBoxVSWhiteBoxEccentricA();
		assertEquals(10, bb.cal(5.0f));
		assertEquals(10, bb.cal(5.2f));
	}
	@Test
	void testBlackBoxEccentricB() {
		BlackBoxVSWhiteBoxEccentricB bb = new BlackBoxVSWhiteBoxEccentricB();
		assertEquals(10, bb.cal(5.0f));
		assertEquals(10, bb.cal(5.2f));
		assertEquals(10, bb.cal(5.5f));
		assertEquals(10, bb.cal(5.6f));
	}
	@Test
	void testWhiteBoxEccentricB() {
		BlackBoxVSWhiteBoxEccentricB bb = new BlackBoxVSWhiteBoxEccentricB();
		assertEquals(10, bb.cal(5.0f));//assertEquals(10, bb.cal(5.2f));
		assertEquals(10, bb.cal(5.6f));
	}
}
