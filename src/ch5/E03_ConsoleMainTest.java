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
	PrintStream console = null;          // 声明（为null）：输出流 (字符设备) console
	ByteArrayOutputStream bytes = null;  // 声明（为null）：bytes 用于缓存console 重定向过来的字符流
	E03_ConsoleMain cm = new E03_ConsoleMain(); 
	@Before
	void before() {
		console = System.out;                   // 获取System.out 输出流的句柄
		bytes = new ByteArrayOutputStream();
		System.setOut(new PrintStream(bytes));  // 将原本输出到控制台Console的字符流 重定向 到 bytes
	}
	
    @Test
    @Disabled("skip run")
	void test() {
		E03_ConsoleMain.main(null);
		String s = new String("qmx");    // 注意：控制台的换行，这里用 '\n' 表示
		assertEquals(s, bytes.toString());          // bytes.toString() 作用是将 bytes内容 转换为字符流
	}	
	
	@Test
	void test1() {
		String s = new String("qmx");    // 注意：控制台的换行，这里用 '\n' 表示
		cm.t(s);
		assertNull(bytes);
//		assertEquals(s, bytes.toString());          // bytes.toString() 作用是将 bytes内容 转换为字符流
	}
	
	@After
	public void tearDown() throws Exception {
		System.setOut(console);
	}
}
