package com.string;

import java.util.LinkedList;
import java.util.List;

public class MyStringLinkedList {
	Node header;

	MyStringLinkedList() {
		header = new Node(null, null, null);
	}

	public void addFirst(String item) {
		Node n = new Node(header.next, header, item);
		if (header.next != null) {
			header.next.previous = n;
		}
		header.next = n;

	}

	public int size() {
		if (header.next == null)
			return 0;
		int count = 0;
		Node temp = header.next;
		while (temp != null) {
			count++;
			temp = temp.next;

		}
		return count;
	}

	public void insert(String data, int pos) {

		int size = size();
		if (pos < 0 || pos > size) {
			throw new IllegalArgumentException("Illegal position for new node");
		}
		if (pos == size)
			addLast(data);
		else if (pos == 0)
			addFirst(data);
		else {
			Node newnode = new Node(null, header, data);
			if (header.next == null)
				header.next = newnode;
			Node temp = header;
			int count = 0;
			while (count < pos) {
				count++;
				temp = temp.next;
			}
			newnode.next = temp.next;
			temp.next = newnode;
			newnode.previous = temp;
			newnode.next.previous = newnode;
		}
	}

	private void addLast(String data) {
		Node newnode = new Node(null, null, data);
		if (header.next == null)
			header.next = newnode;
		else {
			Node temp = header.next;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newnode;
			newnode.previous = temp;
		}
	}

	////////// Attempt remove
	boolean remove(String data) {
		if (header.next == null)
			return false;
		Node ahead = header.next;
		Node temp = header.next.next;
		while (temp.next != null) {
			String s = temp.value;
			if (ahead.value.compareTo(data) == 0) {
				ahead.previous.next = temp;
				temp.previous = ahead.previous;

				return true;
			} else
				ahead = temp;
			temp = temp.next;
		}

		return false;
	}

	////// recursively search
	boolean recurSearch(String data) {
		if (header.next == null)
			return false;
		Node temp = header.next;
		while (temp.next != null) {
			if (temp.value.compareTo(data) == 0) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}

	void printNodes() {
		Node next = header.next;
		if (next == null)
			System.out.println("");
		else {
			String s = next.toString();
			System.out.println(s);
		}
	}

	public void sort() {

		if (isEmpty())
			return;

		Node curr = header.next;
		while (curr != null) {
			Node mNode = minNode(curr);
			swap(curr, mNode);
			curr = curr.next;
		}

	}

	void swap(Node n1, Node n2) {

		String temp = n1.value;
		n1.value = n2.value;
		n2.value = temp;

	}

	public boolean isEmpty() {
		return header.next == null;
	}

	private LinkedList<String> removeZ(LinkedList<String> strings) {
		LinkedList<String> result = new LinkedList<>();
		for (String st : strings) {
			if (!st.contains("Z")) {
				result.add(st);
			}
		}
		return result;
	}

	/**
	 * A student could be rewarded if his attendance record doesn't contain more
	 * than one 'A' (absent) or more than two continuous 'L' (late).
	 * 
	 * @param s - The record of the student that has the list of presence.
	 * @return
	 */
	public boolean checkRecord(String s) {
		int countA = 0;
		if (s.contains("LLL")) {
			return false;
		} else {
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == 'A') {
					countA++;
				}
				if (countA > 1)
					return false;
			}
		}

		return true;
	}

	public Node minNode(Node node) {
		Node temp = node;
		Node nextNode = temp.next;
		while (nextNode != null) {
			if (temp.value.compareTo(nextNode.value) > 0) {
				temp = nextNode;
			} else {
				nextNode = nextNode.next;
			}
		}
		return temp;

//		for (Node i = temp.next; i != null; i = i.next) {
//			if (temp.value.compareTo(i.value) > 0) {
//				temp = i;
//			}
//		}
//
//		return temp;
	}

	public Node getNode(int pos) {

		if (pos < 0 || pos >= size())
			throw new IndexOutOfBoundsException();
		Node curr = header.next;
		for (int i = 1; i <= pos; i++) {
			curr = curr.next;
		}
		return curr;
	}

	class Node {
		String value;
		Node next;
		Node previous;

		Node(Node next, Node previous, String value) {
			this.next = next;
			this.previous = previous;
			this.value = value;
		}

		@Override
		public String toString() {
			if (value == null)
				return "";
			StringBuilder sb = new StringBuilder(value + " ");
			sb = toString(sb, next);
			return sb.toString();
		}

		private StringBuilder toString(StringBuilder sb, Node n) {
			if (n == null)
				return sb;
			sb.append(n.value + " ");
			return toString(sb, n.next);
		}

	}

	public static void main(String[] args) {
		MyStringLinkedList list = new MyStringLinkedList();

		list.addLast("big");
		list.addLast("small");
		list.addLast("tall");
		list.addLast("short");
		list.addLast("round");
		list.addLast("square");
		list.addLast("enormous");
		list.addLast("tiny");
		list.addLast("gargantuan");
		list.addLast("lilliputian");
		list.addLast("numberless");
		list.addLast("none");
		list.addLast("vast");
		list.addLast("miniscule");
		list.sort();
		list.printNodes();

		LinkedList<String> strings = new LinkedList<String>();
		strings.add("book");
		strings.add("Zebra");
		strings.add("apple");
		strings.add("Total");
		strings.add("AtoZ");

		System.out.println(strings);

		System.out.println(list.removeZ(strings));
	}
}
