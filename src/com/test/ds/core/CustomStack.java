package com.test.ds.core;



public class CustomStack <Integer> {
	
	private static final Object data = null;
	Node<Integer> stackTop;
	private String name;
	int size = 0;
	
	public void push(int i) {
		
	 if (stackTop != null) {
		 Node<Integer> nextStackTop = new Node<Integer>(i);
		 nextStackTop.next = stackTop;
		 stackTop = nextStackTop;
		 size++;	 
	 } else {
		 stackTop = new Node<Integer>(i);
		 size++;
	 }
 }	
	
	public Object pop () {
		if (stackTop != null) {
			int poppedVal = stackTop.data;
			Node<Integer> newStackTop = stackTop.next;
			stackTop = newStackTop;
			size--;
			return poppedVal;
		}
		 return null;
	}
	
	public void populateValues (int[] inputList) {
		    for (int content : inputList) {
		    	 push(content);
		    }
	}
	
	public Object peek() {
		if (stackTop != null) {
		   return stackTop.data;
		} 
		return null;
	}
	
    
	public static void main(String[] args) {
		int[] inputList = new int [] {5,10,15,20, 25, 30,35, 40};
		CustomStack cs = new CustomStack("cs");	
		cs.populateValues(inputList);
		for (int i = 0 ; i < inputList.length;i++) 
		System.out.println("The item poppped out is" +cs.pop());
	}
	
	public CustomStack (String name) {
		this.name = name;
	}
	
	public String toString(){
	 	return this.name;
	}
	
	public boolean isEmpty() {
		return (size == 0 ? true : false); 
		
	}

//	public String printValues() {
//		StringBuilder stackContent = new StringBuilder();
//		
//		
//	}
}
