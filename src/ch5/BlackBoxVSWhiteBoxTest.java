package ch5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BlackBoxVSWhiteBoxTest {
	BlackBoxVSWhiteBox bb = new BlackBoxVSWhiteBox();

	@Test
	void testBlackBox() {
		assertEquals(10, bb.cal(5.0f));
		assertEquals(10, bb.cal(5.2f));
		assertEquals(10, bb.cal(5.5f));
		assertEquals(10, bb.cal(5.6f));
	}

	@Test
	void testWhiteBox() {
		assertEquals(10, bb.cal(5.2f));
	}
}
