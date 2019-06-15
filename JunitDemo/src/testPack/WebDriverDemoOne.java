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

public class WebDriverDemoOne {
	WebDriver driver;
	@Before
	public void demoBfr()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Neel\\Desktop\\SeleniumTraining\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
	}
	
	@Test
	public void demoTest() throws InterruptedException
	{
		String expTitle="Welcome: Mercury Tours";
		String actTitle=driver.getTitle();
		Assert.assertEquals(expTitle, actTitle);
		Assert.assertTrue(driver.findElement(By.name("userName")).isDisplayed());
		driver.findElement(By.name("userName")).sendKeys("mercury");
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys("mercury");
		driver.findElement(By.name("login")).click();
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
		
		driver.findElement(By.linkText("SIGN-OFF")).click();	}

	@After
	public void demoaft()
	{
		driver.close();
	}
}
