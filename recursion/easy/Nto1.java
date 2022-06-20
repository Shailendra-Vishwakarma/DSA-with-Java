package com.recursion.easy;

public class Nto1 {
	public static void main(String[] args) {
		System.out.println("++++ 1 to n ++++");
		numrev(5);
		System.out.println("++++ n to 1 ++++");
		num(5);
		System.out.println("Print both ");
		numboth(5);
	}
	static void num(int n)
	{
		if(n==1)
		{
			System.out.println(1);
			return;
		}
		System.out.println(n);
		num(n-1);
	}
	
	// print 1 to n
	static void numrev(int n)
	{
		if(n==1)
		{
			System.out.println(1);
			return;
		}
		numrev(n-1);
		System.out.println(n);
		
	}
	
	//print n to 1 and 1 to n both
	static void numboth(int n)
	{
		if(n==0)
		{
			System.out.println(1);
			return;
		}
		System.out.println(n);
		numboth(n-1);
		System.out.println(n);
		
	}


}
