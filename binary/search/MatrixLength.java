package com.binary.search;

import java.util.Arrays;

public class MatrixLength {
	public static void main(String[] args) {
		int[][] arr= {{9,2,4,8},{0,6,7,0}};
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr.length*arr[0].length);
	    printingArray(arr);
	    int[] ans=converting2dto1d(arr);
	    System.out.println(Arrays.toString(ans));
	    
	    
	}
	static void printingArray(int[][] arr)
	{
		for(int row=0; row<arr.length; row++)
		{
			for(int col=0; col<arr[row].length; col++)
			{
				System.out.print(arr[row][col]+" ");
			}
		}
	}
	static int[] converting2dto1d(int[][] arr)
	{
		int[] array = new int[arr.length * arr[0].length];
	    int num = 0;

	    for (int i = 0; i < arr.length; i++) {
	        for (int j = 0; j < arr[0].length; j++) {
	            array[num++] = arr[i][j];
	        }
	    }
	    return array;
	}

}
