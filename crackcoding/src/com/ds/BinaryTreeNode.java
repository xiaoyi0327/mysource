package com.ds;

public class BinaryTreeNode<T> {
	private boolean visited = false;
	private T data;
	private BinaryTreeNode<T> left;
	private BinaryTreeNode<T> right;
	public BinaryTreeNode(){
	}
	public T getData(){
		return data;
	}
	public void setData(T t){
		this.data = t;
	}
	public BinaryTreeNode<T> getLeft(){
		return left;
	}
	public BinaryTreeNode<T> getRight(){
		return right;
	}
	public void setLeft(BinaryTreeNode<T> left){
		this.left = left;
	}
	public void setRight(BinaryTreeNode<T> right){
		this.right = right;
	}
	public boolean isVisited(){
		return visited;
	}
	public void visit(){
		this.visited = true;
	}
}
