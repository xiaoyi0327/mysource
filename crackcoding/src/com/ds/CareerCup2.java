package com.ds;

public class CareerCup2 {
	
	//P2.5 (1)
	public static void linkedlistExpr(LLNode<Integer> L1, LLNode<Integer> L2){
		int num1 = 0, num2 = 0, count = 0;
		while(L1 != null){
			num1 = num1 + L1.getData()*(int) Math.pow(10, count);
			count++;
			L1 = L1.getNext();
		}
		count = 0;
		while(L2 != null){
			num2 = num2 + L2.getData()*(int) Math.pow(10, count);
			count++;
			L2 = L2.getNext();
		}
		System.out.println(num1+"+"+num2+"="+(num1+num2));
	}
	
	//P2.5 (2)
	
	public static void linkedlistExpr2(LLNode<Integer> L1, LLNode<Integer> L2){
		int num1 = 0, num2 = 0, countl1 = 0, countl2 = 0;
		LLNode<Integer> temp1 = L1;
		LLNode<Integer> temp2 = L2;
		while(temp1.getNext() != null){
			countl1++;
			temp1 = temp1.getNext();
		}
		while(temp2.getNext() != null){
			countl2++;
			temp2 = temp2.getNext();
		}
		while(L1 != null){
			num1 = num1 + L1.getData()*(int) Math.pow(10, countl1);
			countl1--;
			L1 = L1.getNext();
		}
		while(L2 != null){
			num2 = num2 + L2.getData()*(int) Math.pow(10, countl2);
			countl2--;
			L2 = L2.getNext();
		}
		System.out.println(num1+"+"+num2+"="+(num1+num2));
	}
	
	//P2.6
	public static void findBeginingOfLoop(LLNode<Integer> L){
		LLNode<Integer> slow = L;
		LLNode<Integer> fast = L;
		while(slow != null && fast.getNext() != null){
			slow = slow.getNext();
			fast = fast.getNext().getNext();
			if(slow.equals(fast))
				break;
		}
		if(fast == null || fast.getNext() == null)
			return;
		slow = L;
		while(!slow.equals(fast)){
			slow = slow.getNext();
			fast = fast.getNext();
		}
		
		System.out.println(fast.getData());
		
	}
	
	public static void main(String args[]){
		LLNode<Integer> L1 = new LLNode<Integer>(1);
		L1.setNext(new LLNode<Integer>(2));
		L1.getNext().setNext(new LLNode<Integer>(3));
		L1.getNext().getNext().setNext(new LLNode<Integer>(4));
		L1.getNext().getNext().getNext().setNext(L1.getNext().getNext());
	//	System.out.println(L1.getNext().getNext().getData());
/*		LLNode<Integer> L2 = new LLNode<Integer>(3);
		L2.setNext(new LLNode<Integer>(2));
		L2.getNext().setNext(new LLNode<Integer>(3));
		linkedlistExpr2(L1,L2);*/
		findBeginingOfLoop(L1);
	}
}
