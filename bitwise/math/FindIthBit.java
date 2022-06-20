package com.bitwise.math;

public class FindIthBit {
	public static void main(String args[])
	{
		int n=235;
		
		
		
		
		int i=1;
		System.out.println(Integer.toBinaryString(n));
		
		System.out.println("++++++++++finding ith Bit+++++++++");
		System.out.println(findingIthBit(n, i));
		System.out.println("++++++++Set ith bit++++++++++");
		System.out.println(setIthBit(n,i));
		System.out.println("+++++++++clear i th bit+++++++");
		System.out.println(clearIthBit(n, i));
		
	} 
	private static int findingIthBit(int n, int i)
	{
		if((n&(1<<i-1))!=0)
		{
			return 1;
		}
		
		return 0;
	}
	private static int setIthBit(int n, int i)
	{
		int set=(n|(1<<i-1));
		System.out.println(Integer.toBinaryString(set));
		return set;
		
		
		
		
	}
	
	private static int clearIthBit(int n, int i)
	{
		int clr=n&(~(1<<i-1));
		
		System.out.println(Integer.toBinaryString(clr));
		return clr;
	}
	
	

}
