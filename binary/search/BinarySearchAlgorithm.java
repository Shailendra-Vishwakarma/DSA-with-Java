package com.binary.search;

public class BinarySearchAlgorithm {
	public static void main(String[] args) {
		int[] arr= {-9,-2,1,5,8,9,12,16,67,99};
		int target=1;
		int ans=binarySearch(arr, target);
		System.out.println(ans);
	}
	static int binarySearch(int[] arr, int target)
	{
		int start=0;
		int end=arr.length-1;
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(target<arr[mid])
			{
				end=mid-1;
			}
			else if(target>arr[mid])
			{
				start=mid+1;
			}
			else
				return mid;
		}
		
		return -1;
	}

}
