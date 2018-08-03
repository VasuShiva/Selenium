package com.vasu.java;

public class HowManyTimes 
{

	public static void main(String[] args) 
	{
		
//how many times a character appear in a String
		String msg="welcome to selenium";
		String temp="";
		
		char times='e';
		for (int i =msg.length()-1; i >=0; i--) 
		{
			char exp=msg.charAt(i);
			if(exp==times)
			{
				temp =temp+exp;
				
			}
		}
		System.out.println(temp.length());
	}

}
