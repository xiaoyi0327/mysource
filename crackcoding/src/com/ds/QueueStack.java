package com.ds;

public class QueueStack<T> {
	T data;
	LLQueue<T> Q1 = new LLQueue<T>();
	LLQueue<T> Q2 = new LLQueue<T>();
	public void Push(T t){
		if(Q1.isEmpty())
			Q2.enQueue(t);
		else
			Q1.enQueue(t);
	}
	public T Pop(){
		int i = 0, size = 0;
		if(!Q1.isEmpty()){
			size = Q1.getSize();
			while(i < size - 1){
				try {
					Q2.enQueue(Q1.deQueue());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				i++;
			}
			try {
				return Q1.deQueue();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		}else{
			size = Q2.getSize();
			while(i < size - 1){
				try {
					Q1.enQueue(Q2.deQueue());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				i++;
			}
			try {
				return Q2.deQueue();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		}
	}

}
