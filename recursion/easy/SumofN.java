package com.recursion.easy;

public class SumofN {
	public static void main(String[] args) {
		System.out.println(sum(9));
	}
	static int sum(int n)
	{
		if(n==0)
		{
			return 0;
		}
		return n+sum(n-1);
	}

}
