package com.string.substring;

public class SubString {

	public static void main(String[] args) {
		String str="shailendra kumar vishwakarma";
		String substring1=str.substring(4);     //[ is inclusive & ) is exclusive
		String substring2=str.substring(11, 16);
		String substring3=(String) str.subSequence(2, 10);
		
		System.out.println(substring1+"\n"+substring2 +"\n"+ substring3);
	}
}
