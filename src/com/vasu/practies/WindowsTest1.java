package com.vasu.practies;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowsTest1 
{
	public static void main(String[] args)
	{
	
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		Set<String> windows=driver.getWindowHandles();
		
		List<String> tabs=new ArrayList<>(windows);
		
		driver.switchTo().window(tabs.get(1));
		driver.close();
		
	}

}
