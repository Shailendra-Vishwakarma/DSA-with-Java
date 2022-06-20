package com.binary.search;

import java.util.Arrays;

public class BinarySearchin2DSortedArray {
	public static void main(String[] args) {
		int[][] matrix= {{1,2,3,4},
						 {5,6,7,8},
						 {9,10,11,12},
						 {13,14,15,16}};
		System.out.println(Arrays.toString(search(matrix, 2)));
		
	}
	static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target)
	{
		while(cStart<=cEnd)
		{
			int mid=cStart+(cEnd-cStart)/2;
			if(matrix[row][mid]==target)
			{
				return new int[] {row,mid};
			}
			if(matrix[row][mid]<target)
			{
				cStart=mid+1;
			}
			else
			{
				cEnd=mid-1;
			}
		}
		return new int[] {-1,-1};
		
		
	}


	static int[] search(int[][] matrix, int target)
	{
		int row=matrix.length;
		int col=matrix[0].length; //be cautious matix may be empty
		if(row==1)
		{
			return binarySearch(matrix, 0, 0, col-1, target);
		}
		
		int rStart=0;
		int rEnd=row-1;
		int cMid=col/2;
		
		//run the loop till 2 rows are remainning
		while(rStart<(rEnd-1)) //while this is true it will have more than 2
			
		{
			int mid=rStart+(rEnd-rStart)/2;
			if(matrix[mid][cMid]==target)
			{
				return new int[] {mid,cMid};
			}
			else if(matrix[mid][cMid]<target)
			{
				rStart=mid+1;
			}
			else
			{
				rEnd=mid-1;
			}
		}
		
		//now we have two rows
		//check the weather the target is the col of 2 rows
		
		if(matrix[rStart][cMid]==target)
		{
			return new int[] {rStart,cMid};
		}
		
		//Search in first half
		if(target<=matrix[rStart][cMid-1])
		{
			return binarySearch(matrix, rStart, 0, cMid-1, target);
		}
		//search in second half
		if(target>=matrix[rStart][cMid+1] && target<=matrix[rStart][col-1])
		{
			return binarySearch(matrix, rStart, cMid+1, col-1, target);
		}
		if(target<=matrix[rStart][cMid-1])
		{
			return binarySearch(matrix, rStart+1, 0, cMid-1, target);
		}
		else
		{
			return binarySearch(matrix, rStart+1, cMid-1, col-1, target);
		}
	}

}

