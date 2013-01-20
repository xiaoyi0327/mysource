package com.epic;

public class Star {
	public static void print(int height){
		for(int i = 0; i < height ; i++){
			for(int j = 0; j <= i ;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}
	public static void main(String args[]){
		print(3);
	}
}
