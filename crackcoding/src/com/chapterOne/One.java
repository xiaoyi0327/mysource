package com.chapterOne;

public class One {
	
	private Log log = new Log();
		//Problem 1.5
	public String stringCompression(String str){
		String compressedString = "";
		int[] sum = new int[256];
		for(int i = 0; i < str.length() ; i++){
			char tempChar = str.charAt(i);
			sum[tempChar]++;
		}
		for(int i = 0; i < 256 ; i++){
			if(sum[i] != 0){
				char tempChar = (char) i;
				compressedString = compressedString + String.valueOf(tempChar) + Integer.toString(sum[i]);
			}
		}
		if(compressedString.length() >= str.length())
			return str;
		else
			return compressedString;
	}
	
	    //Problem 1.6
	public int[][] rotateMatrixBy90Degree(int[][] matrix){
		for(int i = 0 ; i < matrix.length/2 ; i++){
			int firstIndex = i;
			int lastIndex = matrix.length-1-i;
			for(int j = firstIndex; j < lastIndex ; j++){
				int temp;
				int offset = j -firstIndex;
				temp = matrix[firstIndex][j];
				//left -> top
				matrix[firstIndex][j] = matrix[lastIndex-offset][firstIndex];
				//bottom -> left
				matrix[lastIndex-offset][firstIndex] = matrix[lastIndex][lastIndex-offset];
				//right -> bottom
				matrix[lastIndex][lastIndex-offset] = matrix[j][lastIndex];
				//top -> right
				matrix[j][lastIndex] = temp;
			}
			
		}
		return matrix;
	}
	//Problem 1.7
	public int[][] findZero(int[][] matrix){
		boolean[] row = new boolean[matrix.length];
		boolean[] column = new boolean[matrix[0].length];
		for(int i = 0; i < matrix.length ; i++){
			for(int j = 0; j < matrix.length ; j++){
				if(matrix[i][j] == 0){
					row[i] = true;
					column[j] = true;
				}
			}
		}
		for(int i = 0; i < matrix.length ; i++){
			for(int j = 0; j < matrix.length ; j++){
				if(row[i] || column[j]){
					matrix[i][j] = 0;
				}
			}
		}
		return matrix;
	}
	public void test1_5(){
		log.info(stringCompression("aaaaaaaaaaaaaabbcc"));
		
		
	}
	
	public void test1_6_1_7(){
		int[][] mtx = new int[3][3];
		for(int i = 0; i < mtx.length ;i++){
			for(int j = 0; j < mtx.length; j++){
				mtx[i][j] = i+j;
			}
		}
		
		for(int i = 0; i < mtx.length ;i++){
			for(int j = 0; j < mtx.length; j++){
				System.out.print(mtx[i][j]);
			}
			System.out.print("\n");
		}
		
		mtx = rotateMatrixBy90Degree(mtx);
		mtx = findZero(mtx);
		System.out.println("\n");
		
		for(int i = 0; i < mtx.length ;i++){
			for(int j = 0; j < mtx.length; j++){
				System.out.print(mtx[i][j]);
			}
			System.out.print("\n");
		}
		
	}
	
	public static void main(String args[]){
		One chapterOne = new One();
		chapterOne.test1_6_1_7();
		boolean[] a = new boolean[3];
		System.out.println(a[0]);
	}

}
