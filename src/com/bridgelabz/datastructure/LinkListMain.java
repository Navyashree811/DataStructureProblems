/*
 * UC 2 : Ability to create Linked List by appending 30 and 70 to 56.
 */
package com.bridgelabz.datastructure;

public class LinkListMain {
	public static void main(String[] args) {

		Linklist<Integer> list1 = new Linklist();
		list1.append(56);
		list1.append(30);
		list1.append(70);
		list1.show();

		System.out.println();

	}
}