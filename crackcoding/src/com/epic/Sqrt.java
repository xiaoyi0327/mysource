package com.epic;

public class Sqrt {
	public static void isqrt(double num){
		short res = 0;
		short bit = 1;
		while(bit > num)
			bit >>= 2;
		while(bit != 0){
			if(num >= res + bit){
				num -= res + bit;
				res = (short) ((res >> 1) + bit);
			}
			else
				res >>= 1;
			bit >>= 2;
		}
		System.out.println(res);
	}
	
	public static void main(String args[]){
		isqrt(100);
	}
}
