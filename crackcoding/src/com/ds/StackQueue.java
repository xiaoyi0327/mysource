package com.ds;

public class StackQueue<T> {
	LLStack<T> S = new LLStack<T>();
	LLStack<T> reversedOrder = new LLStack<T>();
	public StackQueue(){
	}
	public boolean isEmpty(){
			return true;
	}
	
	public void enQueue(T t){
		S.Push(t);
		reversedOrder.deleteStack();
	}
	
	public T deQueue() throws Exception{
		LLStack<T> originalOrder = S;
		//Errors
		while(!S.isEmpty()){
			try {
				reversedOrder.Push(originalOrder.Pop());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("aaa");
				e.printStackTrace();
			}
		}
		try {
			return reversedOrder.Pop();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("bbb");
			e.printStackTrace();
			return null;
		}
	}
}
