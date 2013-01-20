package com.epic;

public class FindEquation {
	public static int count = 0;
	
	public static int check(int n1, int n2, int n3){
		if(n1 + n2 == n3){
			System.out.println(n1+"+"+n2+"="+n3);
			return 1;
		}
		else if(n2 + n3 == n1){
			System.out.println(n2+"+"+n3+"="+n1);
			return 1;
		}
		else if(n1 + n3 == n2){
			System.out.println(n1+"+"+n3+"="+n2);
			return 1;
		}else
			return 0;
	}
	
	public static void find(String str){
		int n = str.length()/2;
		for(int i = 0; i < n; i++){
			for(int j = i + 1; j < n+i+1; j++){
				int num1 = Integer.parseInt(str.substring(0,i+1));
				int num2 = Integer.parseInt(str.substring(i+1,j+1));
				int num3 = Integer.parseInt(str.substring(j+1,str.length()));
				int temp = check(num1, num2, num3);
				if(temp == 0)
					continue;
				else
					break;
			}
		}
	}
	
	public static void main(String args[]){
		find("1234235");
	}
}
