package com.epic;

public class Fibonacci {

	public static int fibo(int n){
		if(n == 0){
			return 0;
		}
		else if(n == 1)
			return 1;
		else{
			return fibo(n - 1) + fibo(n - 2);
		}
	}
	
	public static int fibo2(int n){
		int x,y,z;
		if(n == 0)
			return 0;
		else{
			x = 0;
			y = 1;
			for(int i = 0; i < n ;i++){
				z = x + y;
				x = y;
				y = z;
			}
		}
		return y;
	}
	public static void print(int n){
		for(int i = 0; i < n ;i++){
			System.out.println(fibo2(i));
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(100);
	}

}
