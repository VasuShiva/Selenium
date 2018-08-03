package com.vasu.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeTestAftertest
{
	public FirefoxDriver driver;
@BeforeTest
public void applaunch()
{
	 driver=new FirefoxDriver();
	driver.get("Http://Amazon.in");
	driver.manage().window().maximize();
}
@Test
public void mouse()
{
	WebElement sign=driver.findElement(By.id("nav-link-yourAccount"));
	WebElement wish=driver.findElement(By.xpath(".//*[@id='nav-flyout-yourAccount']/div[3]/a[3]/span"));
	
	Actions mouse=new Actions(driver);
	mouse.moveToElement(sign).moveToElement(wish).click().build().perform();
}
@AfterTest
public void appClose()
{
	driver.close();
}
}
