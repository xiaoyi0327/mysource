package com.ds;

//Linked List Stack
public class LLStackMin {
	private LLNode<Integer> headNode;
	private int size = 0;
	private int min;
	public LLStackMin(){
		this.headNode = new LLNode<Integer>(null);
		size = 0;
	}
	public void Push(int data){
		if(size == 0)
			min = data;
		else{
			if(data < min)
				min = data;
		}
		if(headNode == null){
			headNode = new LLNode<Integer>(data);
		}else if(headNode.getData() == null){
			headNode.setData(data);
		}else{
			LLNode<Integer> llNode = new LLNode<Integer>(data);
			llNode.setNext(headNode);
			headNode = llNode;
		}
		size++;
	}
	public int top(){
		if(headNode == null) 
			return 0;
		else
			return headNode.getData();
	}
	public int Pop() throws Exception{
		if(headNode == null){
			throw new Exception("Empty Stack");
		}else{
			int data = headNode.getData();
			headNode = headNode.getNext();
			size--;
			return data;
		}
	}
	public int size(){
		return size;
	}
	public boolean isEmpty(){
		if(headNode == null)
			return true;
		else
			return false;
	}
	public void deleteStack(){
		headNode = null;
		size = 0;
	}
	public int min(){
		return min;
	}
	
	public static void main(String args[]){
		LLStackMin L = new LLStackMin();
		L.Push(4);L.Push(2);L.Push(6);
		System.out.print(L.min());
	}
}
