package com.test.stack.problems;

import com.test.ds.core.CustomStack;

public class TowersOfHanoi {

	public static void main(String[] args) {
		
		TowersOfHanoi toh = new TowersOfHanoi();
		CustomStack<Integer> stackA = new CustomStack<Integer>("stackA");
		CustomStack<Integer> stackB = new CustomStack<Integer>("stackB");
		CustomStack<Integer> stackC = new CustomStack<Integer>("stackC");

		int[] inputList = new int [] {1,2,3};
		stackA.populateValues(inputList);	
		toh.TOH(3, stackA, stackB, stackC);

	}
	
	// TO-DO: Populate values in stackA -- Added
    // Use pop & push logic
	// TOH (countOfDisks, origin, buffer, destination)
	
	void TOH(int numberOfDisks, CustomStack stackA, CustomStack stackB, CustomStack stackC) {
		
		if ( numberOfDisks > 0 ) {
		
			TOH(numberOfDisks - 1, stackA, stackC, stackB);
			System.out.println("Moving an entry from "+stackA + " ----> " +stackC);
			stackC.push((Integer)stackA.pop());
			TOH(numberOfDisks - 1, stackB, stackA, stackC);
			
		}
		
	}
	

}
 