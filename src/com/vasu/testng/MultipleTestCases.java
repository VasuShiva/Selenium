package com.vasu.testng;

import org.testng.annotations.Test;

public class MultipleTestCases 
{
@Test()
public void appLaunch()
{
	System.out.println("AppLaunch");
}
@Test(priority=2)
public void appLogin()
{
	System.out.println("AppLogin");
}
@Test()
public void appClose()
{
	System.out.println("AppClose");
}

}
