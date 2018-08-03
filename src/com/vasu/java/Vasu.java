package com.vasu.java;

public class Vasu
{
	static int z=30; //static variable
	int k=10;//instance variable
	
	public void add()
	{
		int a=10;//local variable
		int b=20;
	int	sum=a+b;
	System.out.println(sum);
	System.out.println(k);
	}
	
	public void sub()
	{
		//System.out.println(a);
		System.out.println(k);
	}
	public static void main(String[] args) 
	{
		Vasu v=new Vasu();
		v.add();
		v.sub();
		System.out.println(z);

	}

}
