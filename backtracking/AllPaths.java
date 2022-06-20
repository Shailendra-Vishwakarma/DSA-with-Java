package com.backtracking;

import java.util.Arrays;

public class AllPaths {
	public static void main(String[] args) {
		boolean[][] board= {
				{true,true,true},
				{true,true,true},
				{true,true,true},
		};
		//allpaths("", board, 0, 0);
		int[][] path=new int[board.length][board[0].length];
		allpathprint("", board, 0, 0, path, 1);
	}
	static void allpaths(String p, boolean[][] maze, int row, int col)
	{
		if(row==maze.length-1 && col==maze[0].length-1)
		{
			System.out.println(p);
			return;
		}
		if(!maze[row][col])
		{
			return;
		}
		maze[row][col]=false;
		if(row<maze.length-1)
		{
			allpaths(p+'D', maze, row+1, col);
		}
		if(col<maze[0].length-1)
		{
			allpaths(p+'R', maze, row, col+1);
		}
		if(row>0) {
			allpaths(p+'U',maze,row-1,col);
		}
		if(col>0)
		{
			allpaths(p+'L',maze,row,col-1);
		}
		maze[row][col]=true;
			
		}
	
	
	/* allpathprint*/
	
	static void allpathprint(String p, boolean[][] maze, int row, int col, int[][] path, int steps)
	{
		if(row==maze.length-1 && col==maze[0].length-1)
		{
			path[row][col]=steps;
			for(int[] arr:path)
			{
				System.out.println(Arrays.toString(arr));
			}
			System.out.println(p);
			System.out.println();
			return;
		}
		if(!maze[row][col])
		{
			return;
		}
		maze[row][col]=false;
		path[row][col]=steps;
		if(row<maze.length-1)
		{
			allpathprint(p+'D', maze, row+1, col, path, steps+1);
		}
		if(col<maze[0].length-1)
		{
			allpathprint(p+'R', maze, row, col+1, path, steps+1);
		}
		if(row>0) {
			allpathprint(p+'U',maze,row-1,col, path, steps+1);
		}
		if(col>0)
		{
			allpathprint(p+'L',maze,row,col-1, path, steps+1);
		}
		maze[row][col]=true;
	}	

}
