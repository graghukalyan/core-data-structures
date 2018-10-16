package com.test.stack.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.test.ds.core.CustomStack;

  public class SetOfStacks {
	// Stack 1, Stack 2, Stack 3
	// Each with capacity 5
	int stackSize = 5;
	int [] buffer = new int[stackSize * 3];
	int [] stackPointer = { -1, -1, -1 };
    List<CustomStack<Integer>> stackList = new ArrayList <CustomStack<Integer>>();
    static Random randomInt;
    
	public static void main(String[] args) {
		randomInt = new Random();  
		SetOfStacks stackSet = new SetOfStacks();
		  try {
			stackSet.push();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void push() throws Exception {
   
		CustomStack <Integer> cStack = new CustomStack <Integer>("cStack");
		if (stackPointer[stackList.size()] >= stackSize -1) {
			cStack.push(randomInt.nextInt(100)); 
		}
	}
  }
