package com.ds;

public class LLNode<T> {
	private T data;
	private LLNode<T> next;
	public LLNode(T t){
		this.data = t;
	}
	public void setData(T t){
		this.data = t;
	}
	public T getData(){
		return data;
	}
	public void setNext(LLNode<T> next){
		this.next = next;
	}
	public LLNode<T> getNext(){
		return this.next;
	}


}
