package com.binary.search;

import java.util.Arrays;
//Binary ssearch in sorted array row wise and column manner
public class SearchIn2DSortedArray {
	public static void main(String[] args) {
		int[][] matrix= {{10,20,30,40},
				         {15,25,35,45},
				         {28,29,37,49},
				         {33,34,38,50}};
		int target=29;
		
		System.out.println(Arrays.toString(search(matrix,target)));
		
	}
	static int[] search(int[][] matrix, int target)
	{
		int row=0;
		int col=matrix.length-1;
		while(row<matrix.length && col>=0)
		{
			if(matrix[row][col]==target)
			{
				return new int[] {row,col};
			}
			if(matrix[row][col]<target)
			{
				row++;
			}
			else
			{
				col--;
			}
		}
				
		return new int[]{-1,-1};
	}

}
