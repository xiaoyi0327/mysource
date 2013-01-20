package com.epic;

public class ReplaceString {
	public static void split(String str){
		String[] list = str.split(" ");
		String newStr = "";
		for(int i = 0; i < list.length; i++){
			if(list[i].length() < 4){
				newStr += list[i];
				if(i != list.length-1)
				    newStr += " ";
			}
			else{
				newStr += list[i].substring(0, list[i].length()/2);
				newStr += " ";
				newStr += list[i].substring(list[i].length()/2, list[i].length());
				if(i != list.length-1)
				    newStr += " ";
			}
		}
		System.out.println(newStr);
	}
	
	public static void main(String args[]){
		split("A boy is a good boy");
	}
}
