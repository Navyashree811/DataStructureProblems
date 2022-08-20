/*
 * UC 6 : Ability to delete the last element in the LinkedList of sequence 56 -> 30 -> 70. 
 */
package com.bridgelabz.datastructure;

public class LinkListMain {
	public static void main(String[] args) {

		Linklist<Integer> list1 = new Linklist();
		list1.add(56);
		list1.add(30);
		list1.add(70);
		list1.popBack();
		list1.show();

		System.out.println();

	}
}