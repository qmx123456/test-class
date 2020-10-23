package eg_testsuit_junit4;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ Class1Test.class, Class2Test.class })
public class AllTests {

}
