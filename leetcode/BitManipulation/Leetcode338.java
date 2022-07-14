package com.leetcode.practice;

import java.util.Arrays;

public class leetcode338{
	public static void main(String[] args) {
		int[] ans=countBits(5);
		System.out.println(Arrays.toString(ans));
		
	}
	public static int[] countBits(int n) {
	    int[] arr=new int[n+1];
	       for(int i=0; i<=n; i++)
	       {
	           
	           arr[i]=Scount(i);
	       }
	       return arr;
	   }
	static int Scount(int i) {
		int count=0;
        while(i>0)
        {  
            count++;
            i=i&(i-1);
            
        }
        return count;
	}
}
