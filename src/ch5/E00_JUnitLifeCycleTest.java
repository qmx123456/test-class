package ch5;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class E00_JUnitLifeCycleTest {
	
	public E00_JUnitLifeCycleTest() {
		System.out.println("constructor");
	}
	@BeforeAll
	static void beforeAll1() {
		System.out.println("BeforeAll 1");
	}
	@BeforeAll
	static void beforeAll2() {
		System.out.println("BeforeAll 2");
	}
	@BeforeEach
	void beforeEach1() {
		System.out.println("BeforeEach 1");
	}
	@BeforeEach
	void beforeEach2() {
		System.out.println("BeforeEach 2");
	}
	@Test
	void test1() {
		System.out.println("Test 1");		
	}
	@Test
	void test2() {
		System.out.println("Test 2");		
	}
	@BeforeEach
	void beforeEach3() {
		System.out.println("BeforeEach 3");
	}
	
	@BeforeAll
	static void beforeAll3() {
		System.out.println("BeforeAll 3");
	}
	
	@AfterAll
	static void AfterAll1() {
		System.out.println("AfterAll 1");
	}
	
	@AfterAll
	static void AfterAll2() {
		System.out.println("AfterAll 2");
	}
		
	@AfterEach
	void AfterEach1() {
		System.out.println("AfterEach 1");
	}
	
	@AfterEach
	void AfterEach2() {
		System.out.println("AfterEach 2");
	}
	
	
}
