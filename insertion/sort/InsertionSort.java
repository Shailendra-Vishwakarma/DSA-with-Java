package com.insertion.sort;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr= {78,-9,232,-278};
		insertionsort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	static void insertionsort(int[] arr)
	{
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=i+1; j>0; j--)
			{
				if(arr[j]<arr[j-1])
				{
					swap(arr,j,j-1);
//					int temp=arr[j];
//					arr[j]=arr[j-1];
//					arr[j-1]=temp;
				}
				else
				{
					break;
				}
			}
		}
	}
	static void swap(int[] arr, int first, int second)
	{
		int temp=arr[first];
		arr[first]=arr[second];
		arr[second]=temp;
	}

}