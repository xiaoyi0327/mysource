package com.epic;

public class Prime {
	public static void generate(int endNum){
		for(int i = 1; i < endNum ; i++){
			boolean isPrime = true;
			for(int j = 2; j < i; j++){
				if(i%j == 0){
					isPrime = false;
					break;
				}
			}
			if(isPrime)
				System.out.print(i + " ");
		}
	}
	
	public static void main(String args[]){
		generate(1000);
	}
}
