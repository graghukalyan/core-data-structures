package com.test.ds.core;

import java.util.ArrayList;
import java.util.List;
import java.lang.Integer;

public class LinkedListNode<Integer> {
	    int data;
        LinkedListNode <Integer> next;
        LinkedListNode<Integer> prev;

        public LinkedListNode(int d) {
            this.data = d;
        }
        
        public void appendToTail (int d) {
        	LinkedListNode<Integer> end = new LinkedListNode<Integer> (d);
        	LinkedListNode <Integer> curr = this;
        	
        	while (curr.next != null) {
        		curr = curr.next;
        	}
        	curr.next = end;
        }
        
        
        public int getListSize(LinkedListNode <Integer> head) {
        	int sizeCount = 0;
        	while (head != null) {
        		head = head.next;
        		sizeCount++;
        	}
        	return sizeCount;
        }
        
        public List <Object> returnValues (LinkedListNode<Integer> headNode) {
        	List<Object> retVals = new ArrayList <Object>();
        	while (headNode != null) {
        		retVals.add((headNode.data));
        		headNode = headNode.next;
        	}
        	return retVals;
        }

      
        
}
