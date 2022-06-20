package com.linear.search;

public class LinearSearchIn2DArray {
	public static void main(String[] args) {
		int[][] arr= {{3,6,7},{5,0,21},{45,67,56}};
		int target=0;
		for(int row=0; row<arr.length; row++)
		{
			for(int col=0; col<arr[row].length; col++)
			{
				if(arr[row][col]==target) {
					System.out.print(row+","+col);
				}
				
				
			}
		}
	}

}
