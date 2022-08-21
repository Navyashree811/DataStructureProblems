/*
 * UC 8 : Ability to insert 40 after 30 to the Linked List sequence of 56 -> 30-> 70.
 */
package com.bridgelabz.datastructure;

public class LinkListMain {
	public static void main(String[] args) {

		Linklist<Integer> list1 = new Linklist();
		list1.add(56);
		list1.add(30);
		list1.add(70);
		list1.insertAtMid(40);
		list1.show();

		System.out.println();

	}
}