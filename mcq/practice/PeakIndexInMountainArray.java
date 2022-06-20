package com.mcq.practice;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class PeakIndexInMountainArray {
	public static void main(String[] args) {
		int[] arr= {1,3,5,7,4,2,1,0};
		System.out.println(peakIndexInMountainArray(arr));

	}
	static int peakIndexInMountainArray(int[] arr) {
	       for(int i=0; i<arr.length; i++)
	       {
	    	   if(arr[i+1]<arr[i])
	    	   {
	    		   
	    		  return i;
	    	   }
	       }
	       return -1;
	    }
	

}
