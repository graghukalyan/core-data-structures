
package com.test.stack.problems;

import com.test.ds.core.CustomStack;

public class SingleArray_3Stacks {
	
	int stackSize = 10; //0-9: stack1, 10-19: stack2, 20-29: stack3 
	int [] buffer = new int[stackSize * 3];
	int [] stackPointer = { -1, -1, -1 };
	
	void push (int stackNum , int value) throws Exception {
		if (stackPointer[stackNum] + 1 >= stackSize) {
			throw new Exception("Stack Overflowing Exception");
		}
		stackPointer[stackNum -1]++;
		buffer[ ((stackNum-1)*stackSize) + stackPointer[stackNum-1]] = value;
	}
	
	 int pop (int stackNum) throws Exception {
		 if (stackPointer[stackNum -1]  == -1) {
			 throw new Exception ("Stack is Empty");
		 } 
		 int poppedVal = buffer [ ((stackNum-1)*stackSize) + stackPointer[stackNum-1]];  
		 buffer [ ((stackNum-1)*stackSize) + stackPointer[stackNum-1]] = 0;
		 stackPointer[stackNum -1]--;
		 
		 return poppedVal;
	 }
	
	int peek (int stackNum) throws Exception {
		 if (stackPointer[stackNum -1]  == -1) {
			 throw new Exception ("Stack is Empty");
		 } 
	 return buffer [((stackNum-1) * stackSize) + stackPointer[stackNum-1]];
	}
	
	

}
