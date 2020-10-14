package eg_testsuit_junit5_failed;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(JUnitPlatform.class)
@SelectClasses({Class1Test.class, Class2Test.class})
public class AllTests {

}