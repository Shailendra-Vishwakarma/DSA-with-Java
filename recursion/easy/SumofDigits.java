package com.recursion.easy;

public class SumofDigits {
	public static void main(String[] args) {
		System.out.println(sumofdigit(89));
	}

	static int sumofdigit(int n)
	{
		if(n==0)
		{
			return 0; 
		}
		int rem=n%10;
		n/=10;
		return rem+sumofdigit(n);
	}
}
