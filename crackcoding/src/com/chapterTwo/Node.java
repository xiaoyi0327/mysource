package com.chapterTwo;

public class Node {
	Node next = null;
	int intData;
	char charData;
	String strData;
	
	public Node(int d){
		intData = d;
	}
	
	public Node(char d){
		charData = d;
	}
	
	public Node(String d){
		strData = d;
	}
	
	void appendToTail(int d){
		Node end = new Node(d);
		Node n = this;
		while(n.next != null){
			n = n.next;
		}
		n.next = end;
	}
	
	void appendToTail(char d){
		Node end = new Node(d);
		Node n = this;
		while(n.next != null){
			n = n.next;
		}
		n.next = end;
	}
	
	void appendToTail(String d){
		Node end = new Node(d);
		Node n = this;
		while(n.next != null){
			n = n.next;
		}
		n.next = end;
	}
	
	public Node deleteNode(Node head, int d){
		Node n = head;
		
		if(n.intData == d){
			return head.next;
		}
		
		while(n.next != null){
			if(n.next.intData == d){
				n.next = n.next.next;
				return head;
			}
			n = n.next;
		}
		
		return head;
	}
	
	public Node deleteNode(Node head, char d){
		Node n = head;
		
		if(n.charData == d){
			return head.next;
		}
		
		while(n.next != null){
			if(n.next.charData == d){
				n.next = n.next.next;
				return head;
			}
			n = n.next;
		}
		
		return head;
	}
	public Node deleteNode(Node head, String d){
		Node n = head;
		
		if(n.strData == d){
			return head.next;
		}
		
		while(n.next != null){
			if(n.next.strData == d){
				n.next = n.next.next;
				return head;
			}
			n = n.next;
		}
		
		return head;
	}
	
}
