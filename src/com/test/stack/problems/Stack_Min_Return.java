package com.test.stack.problems;

import com.test.ds.core.CustomStack;


public class Stack_Min_Return {
	
	static int minValue; 
	public Stack_Min_Return() {
	}
	
	public static void main(String[] args) {
		int[] inputList = new int [] {15,10,5,20, 2,10,35, 40};
		CustomStack cs = new CustomStack("cs");
		Stack_Min_Return stackReturn = new Stack_Min_Return();
		stackReturn.populateValues(inputList,cs);
		System.out.println("The minimum value in the stack which is returned is ::"+stackReturn.fetchStackMinimum());
	}

	private void populateValues(int[] inputList,CustomStack _cStack) {
		minValue = inputList[0];
		for (int content : inputList) {
			minValue = minValue < content ?  minValue: content;
			_cStack.push(content);
		}
	}

	public int fetchStackMinimum () {
		return Stack_Min_Return.minValue; 
	 }
	 
	

}
