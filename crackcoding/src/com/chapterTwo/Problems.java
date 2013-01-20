package com.chapterTwo;

import java.util.ArrayList;

public class Problems {
	//P77 2.1
	public Node removeDuplicated(Node head){
		Node currentNode = head;
		if(head == null)
			return null;
		else{
			while(currentNode != null){
				Node runnerNode = currentNode;
				while(runnerNode.next != null){
					if(currentNode.charData == runnerNode.next.charData){
						runnerNode.next = runnerNode.next.next;
					}else{
						runnerNode = runnerNode.next;
					}
				}
				currentNode = currentNode.next;
			}
			return head;
		}
	}
	
	//P77 2.2
	public Node findKth(Node head, int k){
		Node p1 = head;
		Node p2 = head;
		for(int i = 0; i < k-1; i++){
			if(p1 == null) 
				return null;
			else
				p1 = p1.next;
		}
		if(p1 == null)
			return null;
		while(p1.next != null){
			p1 = p1.next;
			p2 = p2.next;
		}
		return p2;
	}
	
	//p77 2.3
	public boolean deleteMiddleNode(Node s){
		if(s == null || s.next == null)
			return false;
		while(s.next != null){
			s.charData = s.next.charData;
			s = s.next;
		}
		s = null;
		//System.out.println(s.charData);
		return true;
	}
	
	//p77 2.4
	public Node partitionList(Node head, int x){
		Node s = head;
		Node less = new Node(0);
		Node greater = new Node(0);
		while(s != null){
			if(s.intData < x){
				less.appendToTail(s.intData);
			}else{
				greater.appendToTail(s.intData);
			}
		}
		Node p = less;
		while(p.next != null){
			p = p.next;
		}
		p.next = greater;
		return less;
	}
	public void printAllNodes(Node head){
		Node n = head;
		while(n != null){
			System.out.print(n.charData);
			n = n.next;
		}
		System.out.println();
	}
	
	public void printAllIntegerNodes(Node head){
		Node n = head;
		while(n != null){
			System.out.print(n.intData+" ");
			n = n.next;
		}
		System.out.println();
	}
	
	public void test1_1(){
		Node head = new Node('F');
		char[] str = {'O','L','L','O','W',' ','U','P'};
		for(int i = 0; i < str.length; i++){
			head.appendToTail(str[i]);
		}
		printAllNodes(head);
//		head = removeDuplicated(head);
//		head = findKth(head,2);
		Node temp = head;
		for(int i = 0; i < 3; i++){
			temp = temp.next;
		}
		deleteMiddleNode(temp);
		printAllNodes(head);
	}
	
	public void test1_2(){
		Node head = new Node(6);
		int[] str = {8,2,1,0,11,4,13,3};
		for(int i = 0; i < str.length; i++){
			head.appendToTail(str[i]);
		}
		//printAllIntegerNodes(head);
		printAllIntegerNodes(partitionList(head, 4));

	}
	
	public static void main(String args[]){
		Problems problem = new Problems();
		problem.test1_2();
	}
} 
