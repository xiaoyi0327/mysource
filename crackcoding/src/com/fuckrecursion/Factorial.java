package com.fuckrecursion;

public class Factorial {
	public static int fac(int i){
		if(i > 0)
		  return i*fac(i-1);
		else
		  return 1;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fac(4));
	}

}
