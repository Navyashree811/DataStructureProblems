/*
 * UC 1 : Lets create a simple Linked List of 56, 30, and 70.
 */
package com.bridgelabz.datastructure;

public class LinkListMain {
	public static void main(String[] args) {

		Linklist<Integer> list1 = new Linklist();
		list1.push(70);
		list1.push(30);
		list1.push(56);
		list1.show();

		System.out.println();

	}
}