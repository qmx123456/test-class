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
	//��串�� not equal ��֧���ǣ��޸�δ���Ƿ�֧�������޷���֪�仯����ȷ�ԣ����Բ��ܱ���
	void codeTest(int a, int b, int x, int exp) {
		int res = E06_WhiteTestArtEx.cal(a,b,x);
		assertEquals(exp, res);
	}

	@ParameterizedTest
	@CsvSource({
	    "-1,1,-10,-10", "2,0,10,101"
	})
	//��֧���� not equal �������ǣ��޸������������޷���֪�����Բ��ܱ���
	void branchTest(int a, int b, int x, int exp) {
		int res = E06_WhiteTestArtEx.cal(a,b,x);
		assertEquals(exp, res);
	}

	@ParameterizedTest
	@CsvSource({
		"2,1,10, 11", "0,0,-1,-1"
	})
	//�������� not equal ��֧���ǣ� not equal ��串�� 
	void conditionTest(int a, int b, int x, int exp) {
		int res = E06_WhiteTestArtEx.cal(a,b,x);
		assertEquals(exp, res);
	}

}
