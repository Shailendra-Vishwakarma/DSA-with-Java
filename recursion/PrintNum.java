package com.recursion;

public class PrintNum {
	public static void main(String[] args) {
		print(1);
	}
	static void print(int n)
	{
		System.out.println(1);
		print2(2);
		
	}
	private static void print2(int i) {
		
		System.out.println(2);
		print3(3);
		
	}
	private static void print3(int i) {
		System.out.println(3);
		print4(4);
		
		
	}
	private static void print4(int i) {
		System.out.println(4);
		
	}

}
