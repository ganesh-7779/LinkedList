/******************************************************
 * Purpose: Implementation of Linked List Data Structure
 * @author Ganesh Gavhad
 * Version 1.0
 * @param <T>
 ******************************************************/
package com.bridgelabz.linkedlist;

public class Runner<T> {

	/**
	 * @param args This is main method.
	 */
	public static void main(String[] args) {
		LinkedList<Integer> obj = new LinkedList<Integer>();
		obj.add(56);
		obj.add(70);
		obj.addAtIndex(1, 30);
		obj.deleteFirst();
		obj.show();
	}
}
