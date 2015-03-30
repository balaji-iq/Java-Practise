package com.balaji.datastructure.heap;

/**
 * Heap data structure consisting of integers with max heap property, i.e.
 * Heap[parent[i]] >= Heap[i].
 * 
 * @author Balaji Rayakota.
 *
 */
public class HeapMaxInt {
	private int[] heap;
	private static final int sizeIndex = 0;
	
	public HeapMaxInt() {
		heap = new int[11];
		heap[sizeIndex] = 0;
	}
	
	public HeapMaxInt(int size){
		heap = new int[size+1];
		heap[sizeIndex] = 0;
	}
	
	private void heapify(int position) {
		
	}
	
	private int left(int position) {
		return 2*position;
	}
	
	private int right(int position) {
		return 2*position + 1;
	}
	
	private int paretn(int position) {
		return position/2;
	}
}
