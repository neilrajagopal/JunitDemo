package testPack;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DemoClass {
	
	@BeforeClass
	public static void demoBfrClass()
	{
		System.out.println("*********************Notification Email to Start*****************");
	}
	
	@Before
	public void demoBfr()
	{
		System.out.println("Launch Application");
	}
	
	@Test
	public void demoTest()
	{
		System.out.println("Validate Test Case One");
	}
	
	@Test
	public void demoTest1()
	{
		System.out.println("Validate Test Case Two");
	}
	
	@After
	public void demoaft()
	{
		System.out.println("Close Application");
	}
	
	@AfterClass
	public static void demoAftClass()
	{
		System.out.println("******************Notification to stop testing*************");
	}
	
}
