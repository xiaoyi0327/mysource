package com.ds;

public class LLQueue<T> {
	private LLNode<T> frontNode;
	private LLNode<T> rearNode;
	private int size;
	public LLQueue(){
		this.frontNode = null;
		this.rearNode = null;
	}
 
	public boolean isEmpty(){
		return (frontNode == null);
	}
	public void enQueue(T t){
		LLNode<T> newNode = new LLNode<T>(t);
		if(rearNode != null){
			rearNode.setNext(newNode);
		}
		rearNode = newNode;
		if(frontNode == null)
			frontNode = rearNode;
		this.size++;
	}
	public T deQueue() throws Exception{
		T data = null;
		if(isEmpty()){
			throw new Exception("Empty Queue");
		}else{
			data = frontNode.getData();
			frontNode = frontNode.getNext();
		}
		this.size--;
		return data;
	}
	public void deleteQueue(){
		this.frontNode = null;
	}
	public int getSize(){
		return this.size;
	}
}
