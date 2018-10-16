package com.test.ds.core;

import java.util.ArrayList;
import java.util.List;
import java.lang.Integer;

public class Node<Integer> {
	  
		int data;
        Node <Integer> next;
        Node<Integer> prev;

        public Node(int d) {
            this.data = d;
        }
        
        public int getSize(Node <Integer> head) {
        	int sizeCount = 0;
        	while (head != null) {
        		head = head.next;
        		sizeCount++;
        	}
        	return sizeCount;
        }
        
        public List <Object> returnValues (Node<Integer> headNode) {
        	List<Object> retVals = new ArrayList <Object>();
        	while (headNode != null) {
        		retVals.add((headNode.data));
        		headNode = headNode.next;
        	}
        	return retVals;
        }

        public void appendToTail (int d) {
        	Node<Integer> end = new Node<Integer> (d);
        	Node <Integer> curr = this;
        	
        	while (curr.next != null) {
        		curr = curr.next;
        	}
        	curr.next = end;
        }
}
