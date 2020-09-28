package ch5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class E06_WhiteTestArtExXPTest {

	@ParameterizedTest
	@CsvSource({
		"3,0,10,101"
	})
	//语句覆盖 not equal 分支覆盖，修改未覆盖分支，测试无法感知变化、正确性，所以不能保护
	void codeTest(int a, int b, int x, int exp) {
		int res = E06_WhiteTestArtEx.cal(a,b,x);
		assertEquals(exp, res);
	}

	@ParameterizedTest
	@CsvSource({
	    "-1,1,-10,-10", "2,0,10,101"
	})
	//分支覆盖 not equal 条件覆盖，修改条件，测试无法感知，所以不能保护
	void branchTest(int a, int b, int x, int exp) {
		int res = E06_WhiteTestArtEx.cal(a,b,x);
		assertEquals(exp, res);
	}

	@ParameterizedTest
	@CsvSource({
		"2,1,10, 11", "0,0,-1,-1"
	})
	//条件覆盖 not equal 分支覆盖， not equal 语句覆盖 
	void conditionTest(int a, int b, int x, int exp) {
		int res = E06_WhiteTestArtEx.cal(a,b,x);
		assertEquals(exp, res);
	}

}
