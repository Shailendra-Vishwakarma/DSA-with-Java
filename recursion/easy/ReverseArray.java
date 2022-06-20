package com.recursion.easy;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		char[] s= {'h','e','l','l','o'};
		reverse(s);
		System.out.println(Arrays.toString(s));
		
	}
	  static void reverse(char[] s) {
	       
	       int i=0;
	        int j=s.length-1;
	        while(i<j)
	        {
	             char temp=s[i];
	               s[i]=s[j];
	               s[j]=temp;
	               i++;
	               j--;
	        }
	    }
}
