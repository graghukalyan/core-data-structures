
package com.test.ds.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class LinkedListMerge {
	

	public static void main(String[] args) {
	
		LinkedListNode<Integer> list1 = null;
		LinkedListNode<Integer> list2 = null;

		list1 = LinkedListSort.populateValuesinList(
				Arrays.asList((new Integer[] { 2, 5, 7, 13})), list1);
		list2 = LinkedListSort.populateValuesinList(
				Arrays.asList((new Integer[] { 3, 6, 11})), list2);

		System.out.println("linkedlists size ::list 1 "
											+ list1.getListSize(list1) + "list 2 :: "
																					+ list2.getListSize(list2));
		
		LinkedListNode<Integer> merged = mergeLists(list1, list2);
		System.out.println("Merged ListSize  :: "+getListSize(merged));
		printListContents(merged);
	}

	
	public static LinkedListNode<Integer> mergeLists(LinkedListNode<Integer> l1, LinkedListNode<Integer> l2) {
	/*
		int l1Size = getListSize(l1);
		int l2Size = getListSize(l2);
		for (int i = 0; i < l2Size  ; i++) {
			int val =l2.data;
			Map <Integer,Integer> mapL = new HashMap<Integer, Integer>();
			for (int j = 0; j < l1Size; j++) {
					mapL.put(j, val-l1.data);
					if (l1.next != null)
					   l1 = l1.next;
				} 
			  System.out.println("The unsortedMap is" +mapL);
			  TreeMap <Integer,Integer> sortedMapL = new TreeMap<Integer, Integer>(new ValueComparator(mapL));
			  sortedMapL.putAll(mapL);
			  System.out.println("The sortedMap is" +sortedMapL);   
			  
			  if (l2.next != null)
				  l2 = l2.next;
		}
		return l1;
	    /*
		 
		
		/*LinkedListNode<Integer> head;
		  if (l1.data < l2.data) {
		    head = l1;
		  } else {
		    head = l2;
		    l2 = l1;
		    l1 = head;
		  }
		  while(l1.next != null && l2 != null) {
		    if (l1.next.data > l2.data) {
		    	LinkedListNode<Integer> tmp = l1.next;
		      l1.next = l2;
		      l2 = tmp;
		    }
		    l1 = l1.next;
		  } 
		  if (l1.next == null) l1.next = l2;
		  return head;
		*/
		  if (l1 == null) return l2;
		  if (l2 == null) return l1;

		  if (l1.data < l2.data) {
		    l1.next = mergeLists(l1.next, l2);
		    return l1;
		  } else {
		    l2.next = mergeLists(l2.next, l1);
		    return l2;
		  }
	}
	
	public static int getListSize(LinkedListNode <Integer> head) {
    	int sizeCount = 0;
    	while (head != null) {
    		head = head.next;
    		sizeCount++;
    	}
    	return sizeCount;
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