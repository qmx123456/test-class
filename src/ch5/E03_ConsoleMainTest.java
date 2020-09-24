package ch5;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class E03_ConsoleMainTest {
	PrintStream console = null;          // ������Ϊnull��������� (�ַ��豸) console
	ByteArrayOutputStream bytes = null;  // ������Ϊnull����bytes ���ڻ���console �ض���������ַ���
	E03_ConsoleMain cm; 
	
	@BeforeAll
	void setUp() {
		cm = new E03_ConsoleMain();
		console = System.out;                   // ��ȡSystem.out ������ľ��
		bytes = new ByteArrayOutputStream();
		System.setOut(new PrintStream(bytes));  // ��ԭ�����������̨Console���ַ��� �ض��� �� bytes
	}
	
	@AfterAll
	public void tearDown() throws Exception {
		System.setOut(console);
	}
	
    @Test
	void test() {
		E03_ConsoleMain.main(null);
		String s = new String("qmx");    // ע�⣺����̨�Ļ��У������� '\n' ��ʾ
		assertEquals(s, bytes.toString());          // bytes.toString() �����ǽ� bytes���� ת��Ϊ�ַ���
	}	
	
	@Test
	void test1() {
		String s = new String("qmx");    // ע�⣺����̨�Ļ��У������� '\n' ��ʾ
		assertNull(cm);
		cm.t(s);
		assertEquals(s, bytes.toString());          // bytes.toString() �����ǽ� bytes���� ת��Ϊ�ַ���
	}

}
