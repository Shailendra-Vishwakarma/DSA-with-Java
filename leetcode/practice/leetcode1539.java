package com.leetcode.practice;

import java.util.ArrayList;
import java.util.List;

public class leetcode1539 {
	public static void main(String[] args) {
		int[] arr= {2,3,4,7,11};
		int k=5;
		System.out.println(findKthPositive(arr,k));
	}

	
	static int findKthPositive(int[] arr, int k) {
		int val=k;
        if(arr[0]>k)
        {
            return k;
        }
    for(int n:arr)
    {
        if(n<=val)
        {
            val++;
        }
        else
        {
            break;
        }
        
    }
        return val;
    }
}


