package com.selfway;

public class CountZero {
	public static void main(String[] args) {
	 System.out.println(zero(3040004));
	}
	static int zero(int n)
	{
		int count=0;
		while(n>0)
		{
			int rem=n%10;
			if(rem==0)
			{
				count++;
			}
			n/=10;
		}
		
		
		return count;
	}

}
