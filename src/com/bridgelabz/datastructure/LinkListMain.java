/*
 * UC 2 : Ability to create Linked List by adding 30 and 56 to 70.
 */
package com.bridgelabz.datastructure;

public class LinkListMain {
	public static void main(String[] args) {

		Linklist<Integer> list1 = new Linklist();
		list1.add(70);
		list1.add(30);
		list1.add(56);
		list1.show();

		System.out.println();

	}
}