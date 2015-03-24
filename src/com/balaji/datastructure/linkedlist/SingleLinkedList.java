package com.balaji.datastructure.linkedlist;

public class SingleLinkedList {
	public class Node{
		private int data;
		private Node next;
		
		public int getData(){
			return this.data;
		}
		
		public void setData(int data) {
			this.data = data;
		}
		
		public Node getNext() {
			return this.next;
		}
		
		public void setNext(Node next) {
			this.next = next;
		}
	}
}
