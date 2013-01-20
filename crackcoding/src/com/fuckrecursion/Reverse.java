package com.fuckrecursion;

public class Reverse {
	static int index = 0;
	public static String reverseString(String str){
		String temp = "";
		if(str.length() == 1)
			return str;
		else{
			String lastChar = str.substring(str.length() - 1, str.length());
			String remainingString = str.substring(0, str.length() - 1);
			temp = lastChar + reverseString(remainingString);
			return temp;
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = ("abced");
		reverseString(a);
		System.out.println(reverseString(a));
	}

}
