package com.test.ds.core;

import java.io.ObjectInputStream.GetField;
import java.util.Arrays;
import java.util.Stack;

 public class LinkedListPalindrome {
	
	 public static void main(String[] args) {
			
		LinkedListNode<Integer> testList = null;
		LinkedListNode<Integer> testList2 = null;
		LinkedListNode<Integer> testNotPalList = null;
		testList = LinkedListSort.populateValuesinList(
					              Arrays.asList((new Integer[] { 2, 5, 7, 5 ,2})), testList);
		testList2 = LinkedListSort.populateValuesinList(
	              Arrays.asList((new Integer[] { 2, 5, 7, 7, 5 ,2})), testList);
		
		testNotPalList = LinkedListSort.populateValuesinList(
	              Arrays.asList((new Integer[] { 1,2, 5, 7, 5, 6,2})), testNotPalList);

		
		System.out.println("The Palindrome test for the the list "+testList + "returned :: "+isPalindrome(testList));
		System.out.println("The Palindrome test for the the list "+testList2 + "returned :: "+isPalindrome(testList2));
		System.out.println("The Palindrome test for the the list "+testNotPalList + "returned :: "+isPalindrome(testNotPalList));
			
	 
	 }

	private static boolean isPalindrome(LinkedListNode<Integer> head) {
		
		Stack<Integer> valueStack = new Stack<Integer>();
		int listSize = head.getListSize(head);
	
			for (int i=0; i < (listSize/2);i++) {
				valueStack.push(head.data);
				head = head.next;
			}
			if (listSize % 2 != 0) {
				//listSize is odd
				head = head.next;
			} 
			 while (!valueStack.isEmpty()){
				if (valueStack.pop() != head.data)
				  return false;
				else
					head = head.next;
					continue;
			}	

			 return true;
	}
 }
