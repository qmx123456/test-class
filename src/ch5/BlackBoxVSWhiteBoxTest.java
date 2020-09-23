package ch5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BlackBoxVSWhiteBoxTest {

	@Test
	void testBlackBox() {
		BlackBoxVSWhiteBox bb = new BlackBoxVSWhiteBox();
		assertEquals(10, bb.cal(5.0f));
		assertEquals(10, bb.cal(5.2f));
		assertEquals(10, bb.cal(5.5f));
		assertEquals(10, bb.cal(5.6f));
	}

	@Test
	void testWhiteBox() {
		BlackBoxVSWhiteBox bb = new BlackBoxVSWhiteBox();
		assertEquals(10, bb.cal(5.2f));
	}
}
