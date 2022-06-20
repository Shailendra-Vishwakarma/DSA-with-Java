package com.bitwise.math;

public class Addition {
	public static void main(String[] args) {
		System.out.println(add(-22,3));
	}
	static int add(int x, int y)
	{
	  if (y == 0)
	    return x;
	  else
	    return add(x ^ y, (x & y) << 1);
	}
	

}