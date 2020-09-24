package ch5;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class E03_ConsoleMainTest {
	PrintStream console = null;          // ������Ϊnull��������� (�ַ��豸) console
	ByteArrayOutputStream bytes = null;  // ������Ϊnull����bytes ���ڻ���console �ض���������ַ���
	E03_ConsoleMain cm = new E03_ConsoleMain(); 
	@Before
	void before() {
		console = System.out;                   // ��ȡSystem.out ������ľ��
		bytes = new ByteArrayOutputStream();
		System.setOut(new PrintStream(bytes));  // ��ԭ�����������̨Console���ַ��� �ض��� �� bytes
	}
	
    @Test
    @Disabled("skip run")
	void test() {
		E03_ConsoleMain.main(null);
		String s = new String("qmx");    // ע�⣺����̨�Ļ��У������� '\n' ��ʾ
		assertEquals(s, bytes.toString());          // bytes.toString() �����ǽ� bytes���� ת��Ϊ�ַ���
	}	
	
	@Test
	void test1() {
		String s = new String("qmx");    // ע�⣺����̨�Ļ��У������� '\n' ��ʾ
		cm.t(s);
		assertNull(bytes);
//		assertEquals(s, bytes.toString());          // bytes.toString() �����ǽ� bytes���� ת��Ϊ�ַ���
	}
	
	@After
	public void tearDown() throws Exception {
		System.setOut(console);
	}
}
