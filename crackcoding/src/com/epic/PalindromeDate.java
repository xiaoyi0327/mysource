package com.epic;

public class PalindromeDate {
	public static void printDates(int start, int end){
		int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
		for(int year = start; year <= end; year++){
			String yyyy = Integer.toString(year);
			String mm = Integer.toString(year%10)+Integer.toString((year/10)%10);
			String dd = Integer.toString((year/100)%10)+Integer.toString((year/1000)%10);
			int m = Integer.parseInt(mm);
			int d = Integer.parseInt(dd);
			if(m > 0 && m < 13){
				if(d>0 && d<=((m-1 != 2)? daysInMonth[m-1]: (year%4 != 0)?28:29)){
					System.out.println(mm+dd+yyyy);
				}
			}
		}
	}
	
	public static void printDates2(int start, int end){
		int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
		for(int year = start; year <= end; year++){
			String yyyy = Integer.toString(year);
			String mm = yyyy.substring(3, 4) + yyyy.substring(2, 3);
			String dd = yyyy.substring(1, 2) + yyyy.substring(0, 1);
			int m = Integer.parseInt(mm);
			int d = Integer.parseInt(dd);
			if(m > 0 && m < 13){
				if(d>0 && d<=((m-1 != 2)? daysInMonth[m-1]: (year%4 != 0)?28:29)){
					System.out.println(mm+dd+yyyy);
				}
			}

		}
	}
	
	public static void main(String args[]){
		printDates2(2011,3100);
	}
}
