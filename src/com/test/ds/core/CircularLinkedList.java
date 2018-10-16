package com.test.ds.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CircularLinkedList {
	
	
	    public static void main(String[] args) {
	    	
	    	CircularLinkedList clist = new CircularLinkedList();
//	    	LinkedListNode<Integer> head  =	clist.createCircularList();
	    	LinkedListNode<Integer> cirularHead  =	clist.createCustomCircularList();
//	    	printListContents(head);
//	    	printListContents(cirularHead);
	    	printCircularPoint(cirularHead);
	    }

		private static void printCircularPoint(
				LinkedListNode<Integer> head) {
			
			Map <Integer, LinkedListNode<Integer>> nodeMap = new HashMap<Integer, LinkedListNode<Integer>>();
			while (head != null) {
			  if (!nodeMap.containsKey(head.hashCode())){
				nodeMap.put(head.hashCode(), head);
				head = head.next;
			  } else 
			  break;
			}
	    	System.out.println("The linkedlist becomes circular at :" +head.data);
	    }
		
		
		private LinkedListNode<Integer> createCustomCircularList() {
			int [] inputs =   new int [] { 2, 5, 7, 9 , 11, 13,15 };
		    LinkedListNode<Integer> head = null;
		    LinkedListNode<Integer> headRef = null;
		    LinkedListNode<Integer> circleRef = null;

		    int circlePoint = (inputs.length/2) + 1;	
			System.out.println("The linkedlist becomes circular at  : "+circlePoint+"'th index which has a"
					+ "value of :"+inputs[circlePoint - 1]);
			
			for (int i = 0 ; i < inputs.length;) {
			 do {
				 if (i == 0) {
					head = new LinkedListNode<Integer>(inputs[i]);
					headRef = head;
					System.out.println("head.hashCode() for ::: "+head.data +"<-->"+ head.hashCode());
				 } else {
					 if (i != circlePoint - 1) {
					 head.appendToTail(inputs[i]);
					 head = head.next;
					 System.out.println("head.hashCode() for ::: "+head.data +"<-->"+ head.hashCode());
					 } else {
						 head.appendToTail(inputs[i]);
					     circleRef = head.next; 
					     head = head.next;
					     System.out.println("head.hashCode() for ::: "+head.data +"<-->"+ head.hashCode());
					 }
				 }
			 } while (++i < inputs.length);
			 	 head.next = circleRef;
			}
			return headRef;
		}

		private LinkedListNode<Integer> createCircularList() {
			 int [] inputs =   new int [] { 2, 5, 7, 9 };
		     LinkedListNode<Integer> head = null;
		    
			LinkedListNode<Integer> temp = null;
			for (int i = 0 ; i < inputs.length;) {
					do {
					   if (i == 0) {
							head = new LinkedListNode<Integer>(inputs[i]);
							temp = head;
					   }else {
					     head.appendToTail(inputs[i]);
					     head = head.next;
					   }
					} while (++i < inputs.length);
				 
					head.next = temp;
					
				}
		
			return temp;
		}
		
		public static void printListContents(LinkedListNode <Integer> head) {
			List contents = new ArrayList<String>();
			while (head != null) {
				contents.add(head.data+ "-->");
				head = head.next;
	    	}
	    	System.out.println("The contents of the list are "+contents);
	    }
}
