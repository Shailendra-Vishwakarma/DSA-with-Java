package com.dsa.leetcode;

class Solution {
	public static void main(String[] args) {
		int[] nums= {1,2,4,5,6,1};
		System.out.println(containsDuplicate(nums));
	}

    static boolean containsDuplicate(int[] nums) {
		/*
		 * int size=nums.length; for(int i=0; i<size; i++) { for(int j=i+1; j<size; j++)
		 * { if(nums[i]==nums[j]) { return true; } } } return false;
		 */
    	int n=0;
    	for(int num:nums)
    		
    	{
    		n^=num;
    		for(int i=0; i<nums.length; i++)
    		{
    			if(nums[i]==0)
    				return true;
    		}
    		
    	}
    	return false;
}
}
