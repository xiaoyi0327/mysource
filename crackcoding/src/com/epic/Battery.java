package com.epic;

import java.util.ArrayList;
import java.util.Set;

import com.ds.LLQueue;
import com.ds.LLStack;

public class Battery {
	int batteryType[] = {6, 9, 20};
	LLStack<Integer> pack = new LLStack<Integer>();
	Set<Integer> set;
	public void search(int total){
		if(total < 0)
			return;
		if(total == 0 && !pack.isEmpty()){
			for(int i = 0; i < pack.size(); i++){
				try {
					System.out.println("Situation"+pack.Pop());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return;
		}
		System.out.println("SS");
		for(int i = 0; i < batteryType.length ;i++){
			int remain = total - batteryType[i];
			pack.Push(batteryType[i]);
			search(remain);
			try {
				//pack.Pop();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String args[]){
		Battery b = new Battery();
		b.search(20);
	}
}
