package com.vasu.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class NewToursTest
{
	public FirefoxDriver driver;
@BeforeSuite
public void appLaunch()
{
	 driver=new FirefoxDriver();
	driver.get("Http://newtours.demoaut.com");
	driver.manage().window().maximize();
	
}
@BeforeTest
public void appLogin()
{
	driver.findElement(By.name("userName")).sendKeys("vasudeva");
	driver.findElement(By.name("password")).sendKeys("vasudeva");
	driver.findElement(By.name("login")).click();
	
}
@AfterTest
public void appLogout()
{
	driver.findElement(By.linkText("SIGN-OFF")).click();
}
@AfterSuite
public void appClose()
{
	driver.close();
}
}
