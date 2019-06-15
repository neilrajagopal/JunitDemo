package testPack;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses(
		{
			WebDriverDemoTwo.class,
			WebDriverDemoOne.class
		})

public class RunnerClass {

}
