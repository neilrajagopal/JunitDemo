package reusablefunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

public class TestSteps {

	WebDriver driver;
	public TestSteps(WebDriver driver)
	{
		this.driver=driver;
	}
	public void typeTextByName(String objText, String tData)
	{
		if(driver.findElements(By.name(objText)).size()==1)
		{
			driver.findElement(By.name(objText)).sendKeys(tData);
			Assert.assertTrue(true);
		}else
		{
			Assert.assertTrue(false);
		}
	}
	
	
	public void clickByName(String objText)
	{
		if(driver.findElements(By.name(objText)).size()==1)
		{
			driver.findElement(By.name(objText)).click();
			Assert.assertTrue(true);
		}else
		{
			Assert.assertTrue(false);
		}
	}

	public void clickByLinkText(String objText)
	{
		if(driver.findElements(By.linkText(objText)).size()==1)
		{
			driver.findElement(By.linkText(objText)).click();
			Assert.assertTrue(true);
		}else
		{
			Assert.assertTrue(false);
		}
	}
	public void typeTextByXpath(String objText, String tData)
	{
		if(driver.findElements(By.xpath(objText)).size()==1)
		{
			driver.findElement(By.xpath(objText)).sendKeys(tData);
			Assert.assertTrue(true);
		}else
		{
			Assert.assertTrue(false);
		}
	}

}
