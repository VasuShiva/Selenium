package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMethodsTest
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://amazon.in");
		driver.manage().window().maximize();
		//WebElement drop=driver.findElement(By.id("searchDropdownBox"));
		
		Select slt=new Select(driver.findElement(By.id("searchDropdownBox")));
		slt.selectByIndex(23);
		//slt.selectByValue("search-alias=beauty");
		//slt.selectByVisibleText("Baby");
		//System.out.println(slt.getFirstSelectedOption().getText());
		//System.out.println(slt.isMultiple());
	/*List<WebElement>   list=slt.getAllSelectedOptions();
	for (int i = 0; i < list.size(); i++) 
	{
	System.out.println(list.get(i).getText());	
	}*/
	List<WebElement> dropList=	slt.getOptions();
		for (WebElement webElement : dropList) 
		{
			System.out.println(webElement.getText());
		}
		
	}

}
