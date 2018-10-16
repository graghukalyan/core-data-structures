package com.test.stack.problems;

import com.test.ds.core.CustomStack; 

public class QueueWithStacks {
	
	CustomStack <Integer> stackA = new CustomStack<>("stackA");
	CustomStack <Integer> stackB = new CustomStack<>("stackB");
		 
	public static void main(String[] args) {
	  QueueWithStacks myQueue = new QueueWithStacks();
	  int[] inputList = new int [] {5,10,15,20, 25, 30,35, 40};
	  myQueue.populateValues(inputList);
	  myQueue.fetchValues(inputList);
	 }

	
	private void fetchValues(int[] inputList) {
		for (int values : inputList){
			stackB.push((Integer)stackA.pop());
		}
		for (int values : inputList){
			System.out.println("The values popping out are ::"+stackB.pop());
		}
	}


	private void populateValues (int[] inputList) {
		for (int values : inputList){
			push(values);
		}
	}

	private void push(int values) {
		stackA.push(values);
	}
}
