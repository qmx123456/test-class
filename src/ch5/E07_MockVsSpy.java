package ch5;

public class E07_MockVsSpy {
	public static void method(SubClass c, String s) {
		c.method(s);
		c.method(s);
	}
}

class SubClass{
	public void method(String s) {
		System.out.println(s);		
	}
}



