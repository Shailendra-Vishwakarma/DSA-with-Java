package com.bitwise.math;

public class EvenOdd {
	public static void main(String args[])
	{
		int n=13;
		if((n&1)==0)  //bit masking with 1
		{
			System.out.println("Even");
		}
		else
			System.out.println("Odd");
	}

}
