package com.epic;

import java.util.HashMap;

import com.ds.TestCases;

public class Test {
	public void returnChange(double paid, double real_payment){
		int total_change = (int) ((paid-real_payment)*100);
		int change_10_dollar = total_change/1000;
		total_change%=1000;
		int change_5_dollar = total_change/500;
		total_change%=500;
		int change_1_dollar = total_change/100;
		total_change%=100;
		int change_25_cent  = total_change/25;
		total_change%=25;
		int change_10_cent = total_change/10;
		total_change%=10;
		int change_5_cent = total_change/5;
		total_change%=5;
		int change_1_cent = total_change/1;
		total_change%=1;
		System.out.println("Total Paid:"+paid);
		System.out.println("Real Payment:"+real_payment);
		System.out.println("Change 10 Dollar:"+change_10_dollar);
		System.out.println("Change 5 Dollar:"+change_5_dollar);
		System.out.println("Change 1 Dollar:"+change_1_dollar);
		System.out.println("Change 25 Cent:"+change_25_cent);
		System.out.println("Change 10 Cent:"+change_10_cent);
		System.out.println("Change 5 Cent:"+change_5_cent);
		System.out.println("Change 1 Cent:"+change_1_cent);
	}
	public void printCalender(int year){
		int lastDay[] = new int[12];
		if((year%4 == 0) && (year%100 != 0) || (year%400 == 0)){
			lastDay[1] = 31;lastDay[2] = 29;lastDay[3] = 31;
			lastDay[4] = 30;lastDay[5] = 31;lastDay[6] = 30;
			lastDay[7] = 31;lastDay[8] = 29;lastDay[9] = 30;
			lastDay[10] = 31;lastDay[11] = 30;lastDay[12] = 31;
		}else{
			lastDay[1] = 31;lastDay[2] = 28;lastDay[3] = 31;
			lastDay[4] = 30;lastDay[5] = 31;lastDay[6] = 30;
			lastDay[7] = 31;lastDay[8] = 29;lastDay[9] = 30;
			lastDay[10] = 31;lastDay[11] = 30;lastDay[12] = 31;
		}
	}
	public static void main(String[] args) {
		Test test = new Test();
		//test.returnChange(100, 25.50);
		 int[] batteryType = new int[] { 20, 9, 6 };
		 int total = 63;
	}
}
