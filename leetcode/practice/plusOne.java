package com.leetcode.practice;

import java.util.Arrays;

public class plusOne {
	public static void main(String[] args) {
		int[] digits= {4,3,2,1};
		
		System.out.println(plusOne(digits));
	}
	
	static int plusOne(int[] digits) {
       int num=digits[0];
      for(int i=0; i<digits.length-1; i++)
      {
          int temp=num*10;
          num=temp+digits[i+1];
      }
      return num+1;
    }

}
