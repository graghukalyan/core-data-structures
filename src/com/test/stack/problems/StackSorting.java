package com.test.stack.problems;

import com.test.ds.core.CustomStack;

public class StackSorting {
	
	CustomStack <Integer> stackA = new CustomStack<>("stackA");
	CustomStack <Integer> stackB = new CustomStack<>("stackB");
	
	public static void main(String[] args) {
		StackSorting stackSortRef = new StackSorting();
		int[] inputList = new int[] { 15, 20, 5, 10, 2, 30, 40, 35 };
		stackSortRef.populateValues(inputList);
		stackSortRef.sortStack();
		
	}
	
	private CustomStack<Integer> sortStack() {
		while (!stackA.isEmpty()) {
			int temp = (Integer) stackA.pop();
			
			while (!stackB.isEmpty() && stackB.peek() !=null && (Integer)stackB.peek() > temp) {
				stackA.push((Integer)stackB.pop());
			}
			
			stackB.push(temp);
		}
		return stackB;
	}

	private void populateValues(int[] inputList) {
		stackA.populateValues(inputList);
	}
	
}
