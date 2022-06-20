package com.math;

public class GCD_LCM {
	public static void main(String[] args) {
		
		System.out.println("gcd ="+gcd(3,27));
		System.out.println("lcm ="+lcm(3, 27));
		
	}

	static int gcd(int a, int b)
	{
		if(a==0)
		{
			return b;
		}
		 return gcd(b%a,a);
	}
	static int lcm(int a,int b)
	{
		return a*b/gcd(a,b);
	}
}
