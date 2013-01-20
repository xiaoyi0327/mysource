package com.ds;

//Linked List Stack
public class LLStack<T> {
	private LLNode<T> headNode;
	private int size;
	public LLStack(){
		this.headNode = new LLNode<T>(null);
		size = 0;
	}
	public void Push(T data){
		if(headNode == null){
			headNode = new LLNode<T>(data);
		}else if(headNode.getData() == null){
			headNode.setData(data);
		}else{
			LLNode<T> llNode = new LLNode<T>(data);
			llNode.setNext(headNode);
			headNode = llNode;
		}
	}
	public T top(){
		if(headNode == null) 
			return null;
		else
			return headNode.getData();
	}
	public T Pop() throws Exception{
		if(headNode == null){
			throw new Exception("Empty Stack");
		}else{
			T data = headNode.getData();
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

}
