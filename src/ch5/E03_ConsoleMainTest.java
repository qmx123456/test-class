package ch5;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class E03_ConsoleMainTest {
	PrintStream console = null;          // 声明（为null）：输出流 (字符设备) console
	ByteArrayOutputStream bytes = null;  // 声明（为null）：bytes 用于缓存console 重定向过来的字符流
	E03_ConsoleMain cm; 
	
	@BeforeAll
	void setUp() {
		cm = new E03_ConsoleMain();
		console = System.out;                   // 获取System.out 输出流的句柄
		bytes = new ByteArrayOutputStream();
		System.setOut(new PrintStream(bytes));  // 将原本输出到控制台Console的字符流 重定向 到 bytes
	}
	
	@AfterAll
	public void tearDown() throws Exception {
		System.setOut(console);
	}
	
    @Test
	void test() {
		E03_ConsoleMain.main(null);
		String s = new String("qmx");    // 注意：控制台的换行，这里用 '\n' 表示
		assertEquals(s, bytes.toString());          // bytes.toString() 作用是将 bytes内容 转换为字符流
	}	
	
	@Test
	void test1() {
		String s = new String("qmx");    // 注意：控制台的换行，这里用 '\n' 表示
		assertNull(cm);
		cm.t(s);
		assertEquals(s, bytes.toString());          // bytes.toString() 作用是将 bytes内容 转换为字符流
	}

}
