package com.collection;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargestElementInArray {
	public static void main(String[] args) {
		int[] arr= {4,7,3,9,26,6};
		System.out.println(kthLargest(arr, 2));
		
		
	}
	static int kthLargest(int[] arr, int k)
	{
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		for(int i=0; i<arr.length; i++)
		{
			pq.add(arr[i]);
		}
		for(int i=k; i<arr.length; i++)
		{
			if(pq.peek()<arr[i])
			{
				pq.poll();
				pq.add(arr[i]);
				
			}
			
		}
		return pq.peek();
		
	}

}
