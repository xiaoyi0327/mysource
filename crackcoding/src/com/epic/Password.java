package com.epic;

public class Password {
	public static int diffByOne(String password, String input){
		int count = 0,index = -1;
		if(password.length() == input.length()){
			for(int i = 0 ; i < password.length() ; i++){
				if((password.charAt(i) != input.charAt(i))){
					count++;
					index = i;
				}
			}
			if(count == 1)
				return index;
			else
				return -1;
		}
		else
		    return -1;
	}
	
	public static boolean check(String password, String input){
		int[][] pad = {{2,4},{1,3,5},{2,6},{1,5,7},{2,4,6,8},{3,5,9},{4,8},{5,7,9},{6,8}};
		int index;
		if(password.equals(input))
			return true;
		else if(diffByOne(password, input) > 0){
			index = diffByOne(password,input);
			
			for(int i = 0; i < pad[index].length ; i++){
				if(Integer.parseInt(input.substring(index, index+1)) == pad[index][i]){
					return true;
				}
					
			}
			return false;
		}else
			return false;
	}
	public static void main(String args[]){
		if(check("123","125"))
			System.out.println("Valid");
	}
}
