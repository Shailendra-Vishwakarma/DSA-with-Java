package com.bitwise.math;

public class AlphabetPosition {
	public static void main(String[] args) {
		char ch='M';
				int pos=(ch & 31);
		System.out.println(pos);
	}

}
