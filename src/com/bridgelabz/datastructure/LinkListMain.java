/*
 * UC 7 : Ability to search LinkedList to find Node with value 30.
 */
package com.bridgelabz.datastructure;

public class LinkListMain {
	public static void main(String[] args) {

		Linklist<Integer> list1 = new Linklist();
		list1.add(56);
		list1.add(30);
		list1.add(70);
		list1.search(30);
		list1.show();

		System.out.println();

	}
}