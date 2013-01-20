package com.ds;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class TestCases {

	public TestCases(){}
	/*
	 *       1
	 *   2        3
	 *4     6
	 */
	public BinaryTreeNode<Integer> initTree(BinaryTreeNode<Integer> root){
		BinaryTreeNode<Integer> head = root;
		head.setData(1);
		BinaryTreeNode<Integer> left = new BinaryTreeNode<Integer>();
		BinaryTreeNode<Integer> right = new BinaryTreeNode<Integer>();
		left.setData(2);
		right.setData(3); 
		BinaryTreeNode<Integer> leftleft = new BinaryTreeNode<Integer>();
		BinaryTreeNode<Integer> rightright = new BinaryTreeNode<Integer>();
		leftleft.setData(4);
		rightright.setData(6); 
		left.setLeft(leftleft);
		left.setRight(rightright);
		head.setLeft(left);
		head.setRight(right);
		return root;
	}
	public void PreOrder(BinaryTreeNode<Integer> root){
		if(root != null){
			System.out.println(root.getData());
			PreOrder(root.getLeft());
			PreOrder(root.getRight());
		} 
	}
	public void PreOrderNonRecursive(BinaryTreeNode<Integer> root){
		if(root == null) return;
		LLStack<BinaryTreeNode<Integer>> S = new LLStack<BinaryTreeNode<Integer>>();
		while(true){
			while(root != null){
				System.out.println(root.getData());
				S.Push(root);
				root = root.getLeft();
			}
			if(S.isEmpty())
				break;
			try {
				root = (BinaryTreeNode<Integer>) S.Pop();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			root = root.getRight();
		}
	}
	public float computeAverage(BinaryTreeNode<Integer> root) throws Exception{
		if(root == null) throw new Exception("Empty Tree");
		int sum = 0;
		int count = 0;
		LLStack<BinaryTreeNode<Integer>> S = new LLStack<BinaryTreeNode<Integer>>();
		while(true){
			while(root != null){
				System.out.println(root.getData());
				sum = sum + root.getData();
				count++;
				S.Push(root);
				root = root.getLeft();
			}
			if(S.isEmpty())
				break;
			try {
				root = (BinaryTreeNode<Integer>) S.Pop();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			root = root.getRight();
		}
		return (float)sum/ (float)count;
	}
	public void InOrderNonRecursive(BinaryTreeNode<Integer> root){
		if(root == null) return;
		LLStack<BinaryTreeNode<Integer>> S = new LLStack<BinaryTreeNode<Integer>>();
		while(true){
			while(root != null){
				S.Push(root);
				root = root.getLeft();
			}
			if(S.isEmpty())
				break;
			try {
				root = (BinaryTreeNode<Integer>) S.Pop();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(root.getData());
			root = root.getRight();
		}
	}
	public void LevelOrderTraversal(BinaryTreeNode<Integer> root){
		BinaryTreeNode<Integer> temp = new BinaryTreeNode<Integer>();
		LLQueue<BinaryTreeNode<Integer>> Q = new LLQueue<BinaryTreeNode<Integer>>();
		if(root == null)
			return;
		Q.enQueue(root);
		while(!Q.isEmpty()){
			try {
				temp = Q.deQueue();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(temp.getData());
			if(temp.getLeft() != null)
				Q.enQueue(temp.getLeft());
			if(temp.getRight() != null)
				Q.enQueue(temp.getRight());
			
		}
		
	}
	public void DFS(BinaryTreeNode<Integer> root){
	}
	public int FindMax(BinaryTreeNode<Integer> root) throws Exception{
		if(root == null)
			throw new Exception("Empty Tree");
		LLStack<BinaryTreeNode<Integer>> S = new LLStack<BinaryTreeNode<Integer>>();
		int max = root.getData();
		
		while(true){
			while(root != null){
				S.Push(root);
				root = root.getLeft();
				if(root != null)
					max = root.getData() > max ? root.getData() : max;
			}
			if(S.isEmpty())
				break;
			root = S.Pop();
			if(root != null)
				max = root.getData() > max ? root.getData() : max;
			root = root.getRight();
		}
		return max;
	}
	public int FindMaxRecursion(BinaryTreeNode<Integer> root){
		int root_val, left, right, max = 0;
		if(root != null){
			root_val = root.getData();
			left = FindMaxRecursion(root.getLeft());
			right = FindMaxRecursion(root.getRight());
			if(left > right)
				max = left;
			else
				max = right;
			if(root_val > max)
				max = root_val;
		}
		return max;
	}
	public boolean FindElement(BinaryTreeNode<Integer> root, int data){
		if(root == null) return false;
		BinaryTreeNode<Integer> temp = new BinaryTreeNode<Integer>();
		LLQueue<BinaryTreeNode<Integer>> Q = new LLQueue<BinaryTreeNode<Integer>>();
		Q.enQueue(root);
		while(!Q.isEmpty()){
			try {
				temp=Q.deQueue();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(data == temp.getData())
				return true;
			if(temp.getLeft() != null)
				Q.enQueue(temp.getLeft());
			if(temp.getRight() != null)
				Q.enQueue(temp.getRight());
		}
		Q.deleteQueue();
		
		return false;
	}
	//Find Element Recursion Errors!!!
	public boolean FindElementRecursion(BinaryTreeNode<Integer> root, int data){
		boolean temp = false;
		if(root == null)
			return false;
		if(root.getData() == data)
			return true;
		else{
			temp = FindElementRecursion(root.getLeft(), data);
			if(temp != true){
				return false;
			}
			else
				return FindElementRecursion(root.getRight(), data);
		}
	}
	public void InsertBinaryTree(BinaryTreeNode<Integer> root, int data){
		LLQueue<BinaryTreeNode<Integer>> Q = new LLQueue<BinaryTreeNode<Integer>>();
		BinaryTreeNode<Integer> temp = new BinaryTreeNode<Integer>();
		BinaryTreeNode<Integer> newNode = new BinaryTreeNode<Integer>();
		newNode.setData(data);
		newNode.setLeft(null);
		newNode.setRight(null);
		if(root == null){
			root = newNode;
			return;
		}
		Q.enQueue(root);
		while(!Q.isEmpty()){
			try {
				temp = Q.deQueue();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(temp.getLeft() != null)
				Q.enQueue(temp.getLeft());
			else{
				temp.setLeft(newNode);
				Q.deleteQueue();
				return;
			}
			if(temp.getRight() != null)
				Q.enQueue(temp.getRight());
			else{
				temp.setRight(newNode);
				Q.deleteQueue();
				return;
			}
			
		}
		Q.deleteQueue();
	}
	public int GetSizeOfBinaryTree(BinaryTreeNode<Integer> root){
		if(root == null)
			return 0;
		else
			return (GetSizeOfBinaryTree(root.getLeft()) + 1 + GetSizeOfBinaryTree(root.getRight()));
	}
	public BinaryTreeNode<Integer> DeleteBinaryTree(BinaryTreeNode<Integer> root){
		if(root == null)
			return root;
		else{
			DeleteBinaryTree(root.getLeft());
			DeleteBinaryTree(root.getRight());
			root = null;
		}
		return root;
	}
	public void ReverseLevelOrderTraversal(BinaryTreeNode<Integer> root){
		LLQueue<BinaryTreeNode<Integer>> Q = new LLQueue<BinaryTreeNode<Integer>>();
		LLStack<BinaryTreeNode<Integer>> S = new LLStack<BinaryTreeNode<Integer>>();
		BinaryTreeNode<Integer> temp = null;
		if(root == null)
			return;
		Q.enQueue(root);
		while(!Q.isEmpty()){
			try {
				temp = Q.deQueue();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(temp.getRight() != null)
				Q.enQueue(temp.getRight());
			if(temp.getLeft() != null)
				Q.enQueue(temp.getLeft());
			S.Push(temp);
		}
		while(!S.isEmpty()){
			try {
				System.out.println(S.Pop().getData());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public int GetHeightOfBinaryTreeRecursion(BinaryTreeNode<Integer> root){
		int leftHeight, rightHeight;
		if(root == null)
			return 0;
		else{
			leftHeight = GetHeightOfBinaryTreeRecursion(root.getLeft());
			rightHeight = GetHeightOfBinaryTreeRecursion(root.getRight());
			if(leftHeight > rightHeight)
				return leftHeight+1;
			else
				return rightHeight+1;
		}
	}
	public int GetHeightOfBinaryTree(BinaryTreeNode<Integer> root){
		int level = 0;
		if(root == null)
			return 0;
		LLQueue<BinaryTreeNode<Integer>> Q = new LLQueue<BinaryTreeNode<Integer>>();
		Q.enQueue(root);
		Q.enQueue(null);
		while(!Q.isEmpty()){
			try {
				root = Q.deQueue();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(root == null){
				if(!Q.isEmpty())
					Q.enQueue(null);
				level++;
			}
			else{
				if(root.getLeft() != null)
					Q.enQueue(root.getLeft());
				if(root.getRight() != null)
					Q.enQueue(root.getRight());
			}
		}
		return level;
	}
	public BinaryTreeNode<Integer> FindDeepestNode(BinaryTreeNode<Integer> root){
		BinaryTreeNode<Integer> temp = null;
		LLQueue<BinaryTreeNode<Integer>> Q = new LLQueue<BinaryTreeNode<Integer>>();
		if(root == null)
			return null;
		Q.enQueue(root);
		while(!Q.isEmpty()){
			try {
				temp = Q.deQueue();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(temp.getLeft() != null){
				Q.enQueue(temp.getLeft());
			}
			if(temp.getRight() != null){
				Q.enQueue(temp.getRight());
			}
		}
		Q.deleteQueue();
		return temp;
	}
	public void DeleteNode(BinaryTreeNode<Integer> root, int data){
		//Get the Data from the Node we want to delete
		//Find the deepest node, get the data
		//replace the data in the node we want to delete
		//delete deepest node
		
	}
	public void ArrayTopK(int[] input){
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		LLQueue<Integer> top = new LLQueue<Integer>();
		for(int i = 0; i < input.length ; i++){
			map.put(input[i], 1);
		}
		for(int i = 0; i < input.length ; i++){
			if(map.get(input[i]) >= 1)
				map.put(input[i], map.get(input[i])+1);
		}
		for(int i = 0; i < 5;i++){
			System.out.println(FindMaxInMap(map));
		}
		/*Iterator<Integer> key = map.keySet().iterator();
		while(key.hasNext()){
			System.out.println(map.get(key.next()));
		}*/
		
	}
	public int FindMaxInMap(HashMap<Integer, Integer> map){
		int max,keyNum;
		Iterator<Integer> key = map.keySet().iterator();
		keyNum = key.next();
		max = map.get(keyNum);
		while(key.hasNext()){
			int next = map.get(key.next());
			if(next > max){
				max = map.get(next);
				keyNum = next;
			}
		}
		map.remove(keyNum);
		return keyNum;
	}
	public BinaryTreeNode<Integer> FindLCA(BinaryTreeNode<Integer> root, BinaryTreeNode<Integer> a, BinaryTreeNode<Integer> b){
		if(root == null)
			return root;
		BinaryTreeNode<Integer> left, right;
		if(root.equals(a) || root.equals(b)){
			return root;
		}
		left = FindLCA(root.getLeft(), a, b);
		right = FindLCA(root.getRight(), a, b);
		if((left != null) && (right != null))
			return root;
		if(left != null)
			return left;
		if(right != null)
			return right;
		return null;
	}
	public void test_stackqueue(){
		StackQueue<Integer> sq = new StackQueue<Integer>();
		sq.enQueue(1);
		sq.enQueue(2);
		sq.enQueue(3);
		try {
			System.out.print(sq.deQueue());
			System.out.print(sq.deQueue());
			System.out.print(sq.deQueue()); 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public void test_case(){
		BinaryTreeNode<Integer> tree = new BinaryTreeNode<Integer>();
		tree = initTree(tree);
		//PreOrder(tree);
		//InOrderNonRecursive(tree);
		//PreOrderNonRecursive(tree);
		/*try {
			System.out.println(computeAverage(tree));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		//LevelOrderTraversal(tree);
		/*try {
			System.out.println(FindMax(tree));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		//System.out.println(FindMaxRecursion(tree));
		/*if(FindElement(tree, 6))
			System.out.println("YES");
		else
			System.out.println("NO");*/
		/*if(FindElementRecursion(tree, 6))
			System.out.println("YES");
		else
			System.out.println("NO");*/
		/*InsertBinaryTree(tree, 10);
		PreOrder(tree);
		System.out.println(GetSizeOfBinaryTree(tree));
		tree = DeleteBinaryTree(tree);
		System.out.println(GetSizeOfBinaryTree(tree));*/
		//ReverseLevelOrderTraversal(tree);
		//System.out.println(GetHeightOfBinaryTree(tree));
		//System.out.println(GetHeightOfBinaryTreeRecursion(tree));
		/*BinaryTreeNode<Integer> node = null;
		node = FindDeepestNode(tree);
		System.out.println(node.getData());*/
		/*int[] a = new int[10];
		a[0] = 4;a[1] = 4;a[2] = 5;a[3] = 10;a[4] = 1;a[5] = 14;a[6] = 3;a[7] = 6;a[8] = 3;a[9] = 3;
		ArrayTopK(a);*/
		BinaryTreeNode<Integer> lca = FindLCA(tree, tree.getLeft().getLeft(), tree.getLeft().getRight());
		System.out.println(lca.getData());
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestCases testcase = new TestCases();
		testcase.test_case();
		//testcase.test_stackqueue();
	}

}
