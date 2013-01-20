package com.fuckrecursion;

public class Bunny {

	public static int countEars(int n){
		if(n == 0)
			return 0;
		if(n == 1)
			return 2;
		else
			return n*countEars(n);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
