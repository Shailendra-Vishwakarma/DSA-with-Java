package com.binary.search;

public class OrderAgnosticBS {
	public static void main(String[] args) {
		//int[] arr= {-2,0,1,3,4,6,8,9,20,30,40};
		int[] arr= {99,88,67,45,20,18,5,-9,-13};
		int target=-13;
		int ans=binarySearch(arr,target);
		System.out.println(ans);
	}
	static int binarySearch(int[] arr, int target)
	{
		
		int start=0;
		int end=arr.length-1;
		boolean isAsc=arr[start]<arr[end];
		while(start<=end)
		{
			int mid=start+(end-start)/2;
			if(target==arr[mid])
			{
				return mid;
			}
			if(isAsc)
			{
				if(target<arr[mid])
				{
					end=mid-1;
				}
				else
				{
					start=mid+1;
				}
			}
			else 
			{
				if(target<arr[mid])
				{
					start=mid+1;
				}
				else
				{
					end=mid-1;
				}
			}
			
		}
		
		return -1;
	}

}
