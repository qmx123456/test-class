package ch5;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class E00_JUnitLifeCycleTestJunit4 {	
	public E00_JUnitLifeCycleTestJunit4() {
		System.out.println("constructor");
	}
	@BeforeClass
	public static void beforeAll1() {
		System.out.println("BeforeAll 1");
	}
	@BeforeClass
	public static void beforeAll2() {
		System.out.println("BeforeAll 2");
	}
	@Before
	public void beforeEach1() {
		System.out.println("BeforeEach 1");
	}
	@Before
	public void beforeEach2() {
		System.out.println("BeforeEach 2");
	}
	@Test
	public void test1() {
		System.out.println("Test 1");		
	}
	@Test
	public void test2() {
		System.out.println("Test 2");		
	}
	@Before
	public void beforeEach3() {
		System.out.println("BeforeEach 3");
	}
	@BeforeClass
	public static void beforeAll3() {
		System.out.println("BeforeAll 3");
	}
	@AfterClass
	public static void AfterAll1() {
		System.out.println("AfterAll 1");
	}
	@AfterClass
	public static void AfterAll2() {
		System.out.println("AfterAll 2");
	}	
	@After
	public void AfterEach1() {
		System.out.println("AfterEach 1");
	}
	@After
	public void AfterEach2() {
		System.out.println("AfterEach 2");
	}
}
