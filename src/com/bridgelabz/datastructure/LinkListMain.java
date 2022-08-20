/*
 * UC 4 : Ability to insert 30 between 56 and 70.
 */
package com.bridgelabz.datastructure;

public class LinkListMain {
	public static void main(String[] args) {

		Linklist<Integer> list1 = new Linklist();
		list1.add(56);
		list1.add(70);
		
		list1.insertAtMid(30);
		list1.show();

		System.out.println();

	}
}