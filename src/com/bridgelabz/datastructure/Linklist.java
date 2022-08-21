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

	public void insertAtMid(T data) {
		if (head == null)
			head = new Node(data);
		else {
			Node newNode = new Node(data);
			Node temp = head;
			int length = 0;

			while (temp != null) {
				length++;
				temp = temp.next;
			}
			int count = ((length % 2) == 0) ? (length / 2) : (length + 1) / 2;
			temp = head;

			while (count-- > 1)
				temp = temp.next;
			newNode.next = temp.next;
			temp.next = newNode;
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
