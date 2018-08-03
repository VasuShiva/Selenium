package com.vasu.java;

public class SplitWordsTest {

	public static void main(String[] args) 
	{
		String text="My Name Is Vasu Deva Yadav";
		
		String [] splitText=text.split(" ", 5); // represent limited words 
		for (String string : splitText)
		{
			System.out.println(string);
		}

	}

}
