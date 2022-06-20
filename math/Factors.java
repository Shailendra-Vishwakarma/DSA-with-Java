package com.math;

public class Factors {
	public static void main(String[] args) {
		int n=20;
		factors1(n);
	}
	static void factors1(int n)
	{
		for(int i=1; i<=n; i++)
		{
		 if(n%i==0)
		 {
			 System.out.print(i+" ");
		 }
		}
	}

}
