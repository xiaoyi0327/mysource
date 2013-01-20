package com.epic;

public class Replace {
	
	public static void replaceString(String str){
		String temp = "";
		for(int i = 0; i < str.length(); ++i){
			if(str.charAt(i) == 'a'){
				temp = temp + "the";
			}else{
				temp = temp + str.charAt(i);
			}
		}
		System.out.println(temp);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		replaceString("this a child");
	}

}
