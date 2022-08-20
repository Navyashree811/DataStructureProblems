package com.bridgelabz.datastructure;

public class Linklist<T> {
	Node<T> head;
	Node<T> tail;

	public void add(T data) {
		Node<T> newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	public void popBack() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		} else {
			if (head != tail) {
				Node current = head;

				while (current.next != tail) {
					current = current.next;
				}
				tail = current;
				tail.next = null;
			} else {
				head = tail = null;
			}
		}
	}

	public void show() {
		if (head == null) {
			System.out.println("Linked list is Empty");
		} else {
			Node<T> temp = head;
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			System.out.println();
		}

	}
}
