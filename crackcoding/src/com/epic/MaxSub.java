package com.epic;

public class MaxSub {
	public static void maxSub(int[] array){
		int max_so_far = 0, max_ending_here = 0;
		for(int i = 0; i < array.length ; i++){
			max_ending_here = max(array[i], max_ending_here+array[i]);
			max_so_far = max(max_so_far, max_ending_here);
		}
		System.out.println(max_so_far);
	}
	public static int max(int x, int y){
		return ((x >= y) ? x : y);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,-6,7,2,4,6,7,-100};
		maxSub(array);
		char ch = 'a';
		String as = "";
		System.out.println((char)(ch-32));
	}

}
