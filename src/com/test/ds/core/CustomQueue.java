package com.test.ds.core;

public class CustomQueue <Integer> {
	
	Node<Integer> queueFirst;
	Node<Integer> nextFirst;
	Node<Integer> queueLast;
	
	public void push (int i) {
	   if (queueFirst != null) {
		  queueLast.next = new Node <Integer> (i);
		  queueLast = queueLast.next;	
		  
	 } else {
		 queueLast = new Node<Integer>(i);
		 queueFirst = queueLast;
	 }
   }	
	
	public Object pop () {
		if (queueFirst != null) {
			int poppedVal = queueFirst.data;
			Node<Integer> nextQueueFirst = queueFirst.next;
			queueFirst = nextQueueFirst;	
			return poppedVal;
		}
		 return null;
	}
	
	
	public void populateValues (int[] inputList) {
		    for (int content : inputList) {
		    	 push(content);
		    }
	}
	
	public static void main(String[] args) {
		int[] inputList = new int [] {5,10,15,20, 25, 30,35, 40};
		CustomQueue cs = new CustomQueue();	
		cs.populateValues(inputList);
		for (int i = 0 ; i < inputList.length;i++) 
			System.out.println("The item poppped out is" +cs.pop());
	}
}
