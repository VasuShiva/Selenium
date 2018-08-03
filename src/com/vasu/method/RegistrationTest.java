package com.vasu.method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationTest 
{
public String res;
	public String reg(String fName,String lName,String userName,String password,String cpassword) throws Exception
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		driver.manage().window().maximize();
		driver.findElement(By.name("firstName")).sendKeys(fName);
		driver.findElement(By.name("lastName")).sendKeys(lName);
		Thread.sleep(3000);
		Select country=new Select(driver.findElement(By.name("country")));
		country.selectByVisibleText("INDIA");
		driver.findElement(By.id("email")).sendKeys(userName);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("confirmPassword")).sendKeys(cpassword);
		driver.findElement(By.name("register")).click();
		WebElement name=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[1]/font/b"));
		if (name.isDisplayed()) 
		{
			res="pass";
		}else
		{
			res="Fail";
		}
	return res;	
			
	}
	public static void main(String[] args) throws Exception
	{
		RegistrationTest v=new RegistrationTest();
		String results=v.reg("vasu", "vasu", "vasu", "vasu", "vasu");
		System.out.println(results);
	}

}
