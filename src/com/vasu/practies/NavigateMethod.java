package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateMethod {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("Http://Google.co.in");
		driver.manage().window().maximize();
		
		//driver.findElement(By.className("gb_P")).click();
		driver.findElement(By.linkText("Gmail")).click();
		
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		

	}

}
