
package com.binary.search;

public class leetcode35 {
	public static void main(String[] args) {
		int[] nums= {3,4,6,53,244,435};
		int target=6;
		System.out.println(searchInsert(nums,target));
	}

	 static int searchInsert(int[] nums, int target) {
	    
	     if(binarySearch(nums,target)==-1){
	         for(int i=0; i<nums.length; i++)
	         {
	             if(target<nums[i])
	             {
	                 return i-1;
	             }
	             else
	                 return i+1;
	         }
	     }
	     
	     
	        else
	        {
	            return binarySearch(nums,target);
	        }
		return target;
	        
	    }
	    static int binarySearch(int[] nums, int target)
	    {
	         int start=0;
	        int end=nums.length-1;
	        while(start<end)
	        {
	            int mid=start+(end-start)/2;
	            if(nums[mid]==target)
	            {
	                return mid;
	            }
	            else if(target<nums[mid])
	            {
	                end=mid-1;
	            }
	            else
	                start=mid+1;
	        }
	        return -1;
	    }
	}
