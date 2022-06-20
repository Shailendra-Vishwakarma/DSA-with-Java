package com.string.substring.recursion;

import java.util.ArrayList;
import java.util.List;

public class Leetcode17 {
	public static void main(String[] args) {
		System.out.println(letterCombinations("23"))
		;
		
	}
//	static ArrayList<String> letterCombinations(String p, String up)
//	{
//		if(up.isEmpty())
//		{
//			ArrayList<String> list=new ArrayList<>();
//			list.add(p);
//			return list;
//		}
//		int digit=up.charAt(0)-'1';
//		ArrayList<String> list=new ArrayList<>();
//		for(int i=(digit-1)*3; i<(digit*3); i++)
//		{
//			char ch=(char)('a'+i);
//			list.addAll(letterCombinations(p+ch, up.substring(1)));
//		}
//		return list;
//		
//	}
	
	static List<String> letterCombinations(String digits)
	{    
		String p="";
		if(digits.isEmpty())
		{
			List<String> list=new ArrayList<>();
			list.add(p);
			return list;
		}
		int digit=digits.charAt(0)-'1';
		List<String> list=new ArrayList<>();
		for(int i=(digit-1)*3; i<(digit*3); i++)
		{
			char ch=(char)('a'+i);
			letterCombinations(digits.substring(1));
			list.addAll(letterCombinations(p+ch));
			
		}
		return list;
		
	}


}
