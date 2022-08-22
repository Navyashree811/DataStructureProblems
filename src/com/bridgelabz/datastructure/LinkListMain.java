/*
 * UC 9 : Ability to delete 40 from the LinkedList sequence of 56 -> 30 -> 40 -> 70.
 */
package com.bridgelabz.datastructure;

public class LinkListMain {
	public static void main(String[] args) {

		Linklist<Integer> list1 = new Linklist();
		list1.add(56);
		list1.add(30);
		list1.add(70);
		
		list1.insertAtMid(40);
		System.out.println("List befor deletion");
		list1.show();
		list1.popDeleteData(2);
		System.out.println("List after deletion");
		list1.show();

		System.out.println("The size of list is : " + list1.size());
		System.out.println();

	}
}