package ch5;

import java.io.PrintStream;

public class E03_ConsoleMain {
	public static void main(String[] args) {
		PrintStream out = System.out;
		out.print("qmx");
	}
	
	String t(String s) {
		System.out.print(s);
		return s;
	}
}
