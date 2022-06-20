package com.bitwise.math;

public class Detectiftwointegershaveoppositesignsornot {
	public static void main(String[] args) {
		int n=-20;
		int m=9;
		System.out.println(Integer.toBinaryString(n));
		System.out.println(Integer.toBinaryString(m));
		
		if((n^m)<0)
		{
			System.out.println("have opposite sign.");
		}
		else
			System.out.println("Do not have opposite sign.");
		
		
		
 }

}
