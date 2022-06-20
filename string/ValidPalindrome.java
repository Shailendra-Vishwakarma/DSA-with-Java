package com.string;

public class ValidPalindrome {
	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		//s=s.replaceAll("\\s", "");
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s);
	}
	

}
