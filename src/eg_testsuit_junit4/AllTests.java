package eg_testsuit_junit4;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ Class1Test.class, Class2Test.class })
public class AllTests {
	
	@Test
	public void test1() {
		fail("Not yet implemented");
	}
	
	@Test
	public void test2() {
		fail("Not yet implemented");
	}
	
	@Test
	public void test3() {
		fail("Not yet implemented");
	}
}
