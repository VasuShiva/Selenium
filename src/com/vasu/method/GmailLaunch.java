package com.vasu.method;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLaunch 
{
	public FirefoxDriver driver;
public String res;
	//appLaunch
	public  String  applaunch(String url)
	{
	  driver=new FirefoxDriver();
		driver.get(url);
		
		if (driver.findElement(By.id("identifierId")).isDisplayed()) 
		{
			res="Pass";
		}else
		{
			res="Fail";
		}
		return res;
	}
	//appLogin
	public String appLogin(String userName,String password) throws Exception
	{
		driver.findElement(By.id("identifierId")).sendKeys(userName);
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("sadgddsdgsg")).sendKeys(password);
		driver.findElement(By.id("")).click();
		if(driver.findElement(By.className("")).isDisplayed())
		{
			res="Pass";
		}else
		{
			res="Fail";
		}
		return res;
	}
	//appLogout
	//appClose
	
	public static void main(String[] args) throws Exception 
	{
		GmailLaunch app=new GmailLaunch();
		app.applaunch("http://Gmail.com");
		/*String results=app.applaunch("http://Gmail.com");
		System.out.println(results);*/
		app.appLogin("sai", "sel");
	}
	
}
