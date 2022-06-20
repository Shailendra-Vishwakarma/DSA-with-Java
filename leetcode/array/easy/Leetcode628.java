package com.leetcode.array.easy;

public class Leetcode628 {
	public static void main(String[] args) {
		int[] nums= {-1,-2,-3,4};
		int m1=maximumProduct(nums);
		System.out.println(m1);
	    int m2=max2(nums, m1);
	    System.out.println(m2);
	}
	 static int maximumProduct(int[] nums) {
          int max1=nums[0];
          for(int n:nums)
          {
        	  if(max1<n)
        	  {
        		  max1=n;
        	  }
          }
          return max1;
	    }
	 static int max2(int[] nums, int m1) {
         int max1=nums[0];
         for(int n:nums)
         {
       	  if(max1<n && max1!=m1)
       	  {
       		  max1=n;
       	  }
         }
         return max1;
	    }

}
