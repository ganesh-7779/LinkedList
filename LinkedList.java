package com.bridgelabz.linkedlist;

/**
 * Purpose: Implementation of Linked List Data Structure
 * 
 * @author Ganesh Gavhad Version 1.0
 * @param <T>
 */
public class LinkedList<T> {

	MyNode<T> head;

	/**
	 * Adding Node to the linkedList
	 * 
	 * @param data is generic type 
	 */
	public void add(T data) {
		MyNode<T> newNode = new MyNode<>();
		newNode.data = data;
		if (head == null) {
			head = newNode;

		} else {
			MyNode<T> node = head;
			while (node.next != null) {
				node = node.next;
			}
			node.next = newNode;
		}
	}
	
	/**
	 * @param Node data added at Start
	 * @return 
	 */
	public  void addAtStart (T data) {
		MyNode<T> node =new MyNode<>();
		node.data=data;
		node.next=head;
		head=node;
	}
	
	/**
	 * @show is a method for Printing The Data Of Node till next equal to null
	 */
	public void show() {
		MyNode<T> node = head;
		while (node.next != null) {
			System.out.println(node.data);
			node=node.next;;
		}
		System.out.print(node.data);
	}
	
}
