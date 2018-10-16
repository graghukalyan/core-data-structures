
package com.test.ds.core;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class LinkedListSort {
	

	public static void main(String[] args) {
	
	  LinkedList<Integer> l1 = new LinkedList<Integer>();
	  LinkedList<Integer> l2 = new LinkedList<Integer>();
	  
	  
	  
	  LinkedListNode <Integer> list1 = null;
	  LinkedListNode <Integer> list2 = null;
		
	  list1 = populateValuesinList(Arrays.asList((new Integer []{5,10,15,20, 25, 30,35, 40})), list1);
	 //populateValuesinList(Arrays.asList((new Integer []{3,6,9,12,15,20})), list2);
	  
	  System.out.println("linkedlists size :: "+list1.getListSize(list1));
	  System.out.println("linkedlists size :: "+ fetchSubList(3,list1));

	}
	
	private static boolean findIntersection(LinkedList<Integer> l1,
										LinkedList<Integer> l2) {
		boolean intersect = false;
		for (Iterator<Integer> i = l1.listIterator(); i.hasNext();) {
			int t = i.next();
			for (Iterator<Integer> j = l2.listIterator(); j.hasNext();) {
				if (t == j.next()) {
					System.out.println("They intersect for value :"+t);
					intersect = true;
			}
		}
		}
		return intersect;
	}

	public static LinkedListNode<Integer> populateValuesinList(List<Integer> integers, LinkedListNode<Integer> list) {
		
		Iterator<Integer> i = integers.listIterator();
		list = new LinkedListNode<Integer>(i.next());
		do {
			list.appendToTail(i.next());
		} while (i.hasNext());
		return list;	
   }
	
	  /**
     * 
     * @param i
     * @return
     */
	public static List<Object> fetchSubList(int i, LinkedListNode<Integer> list) {
		
		if (i == list.getListSize(list) - 1) {
			return (list.returnValues(list));
		}
//	   for (int s = i -1; s < list.getListSize(list); s++) {
	   for (int s = 0; s < i-1; s++) {
		   if (list != null) {
			   list = list.next;
		   }
	   }
	   return list.returnValues(list);
	}
    
}
