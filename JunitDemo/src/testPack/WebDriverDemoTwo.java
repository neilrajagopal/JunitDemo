package testPack;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;
import objRepository.ObjectRepository;
import reusablefunctions.TestSteps;
import testData.TestData;

public class WebDriverDemoTwo {
	WebDriver driver;
	TestSteps ts;
	ObjectRepository objr;
	TestData td;
	@Before
	public void demoBfr()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Neel\\Desktop\\SeleniumTraining\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(td.AppURL);
		ts=new TestSteps(driver);
	}

	@Test
	public void demoTest() throws InterruptedException
	{
		Assert.assertEquals(td.expPageTitle, driver.getTitle());
		ts.typeTextByName(objr.txtUserName,td.userName);
		ts.typeTextByXpath(objr.txtPassword,td.password);
		ts.clickByName(objr.btnLogin);
		ts.clickByLinkText(objr.lnkSignOff);
	}

	@After
	public void demoaft()
	{
		driver.close();
	}

}


/*
//Radio option handling
String tTestData="oneway";

List<WebElement> tripTypes=driver.findElements(By.name("tripType"));
for(WebElement tripType:tripTypes)
{
	if(tripType.getAttribute("value").trim().equals(tTestData))
	{
		tripType.click();
	}
}
*/