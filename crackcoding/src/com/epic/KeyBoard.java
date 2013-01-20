package com.epic;

import java.util.ArrayList;

public class KeyBoard {
	public static char[][] key = {{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};
	public static ArrayList<String> list = new ArrayList<String  >();
	public static void print(String prefix, String str, int startIndex){
		int len = str.length() - startIndex;
		if(len == 0){
			System.out.println(prefix);
			return;
		}
		int value = (str.charAt(startIndex) - 48);
		int stringLen = list.get(value).length();
		if(stringLen == 0)
			print(prefix, str, startIndex++);
		else{
			for(int i = 0; i < stringLen; i++){
				prefix += list.get(value).charAt(i);
				print(prefix,str,startIndex++);
				prefix = prefix.substring(0, prefix.length()-1);
			}
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print("","2810",0);
	}

}
