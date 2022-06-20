package com.cyclic.sort;

import java.util.Arrays;

public class CyclicSort {
	public static void main(String[] args) {
		// array should be 1 to n
		int[] arr= {8,7,9,10,6,5,4,3,2,1};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	
	}
	static void swap(int[] arr, int first, int second)
	{
		int temp=arr[first];
		arr[first]=arr[second];
		arr[second]=temp;
	}
	
	static void sort(int[] arr)
	{
		int i=0;
		while(i<arr.length)
		{
			int correct=arr[i]-1;
			if(arr[i]!=arr[correct])
			{
				swap(arr, i, correct);
			}
			else
			{
				i++;
			}
		}
	}

}
