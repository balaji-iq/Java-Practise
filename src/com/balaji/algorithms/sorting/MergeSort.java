package com.balaji.algorithms.sorting;

/**
 * Implementation of Merge Sort.
 * @author Balaji Rayakota.
 *
 */
public class MergeSort {
	/**
	 * Sorts input int array in non-descending order.
	 * @param input the int array which has to be sorted.
	 */
	public static void sort(int[] input) {
		if (input == null || input.length < 2) 
			return;
		
		int[] aux = new int[input.length];
		sort(input, aux, 0, input.length-1);
	}
	
	/**
	 * Sorts input[lo..hi].
	 * @param input an input array.
	 * @param aux an input array, len[input] = len[aux].
	 * @param lo starting index.
	 * @param hi ending index.
	 */
	private static void sort(int[] input, int[] aux, int lo, int hi) {
		if (hi <= lo)
			return;
		
		int mid = (lo + hi)/2;
		sort(input, aux, lo, mid);
		sort(input, aux, mid+1, hi);
		
		merge(input, aux, lo, mid, hi);
	}
	
	/**Sorts input[lo..hi].
	 * @param input an integer array, should be sorted in input[lo..mid] and input[mid+1..hi].
	 * @param aux an integer array, len[input] = len[aux].
	 * @param lo starting index.
	 * @param mid middle index, lo <= mid < hi.
	 * @param hi ending index.
	 */
	private static void merge( int[] input, int[] aux, int lo, int mid, int hi) {
		// copy input[lo..hi] into aux[lo..hi].
		for (int index = lo; index <= hi; index++)
			aux[index] = input[index];
		
		int i = lo, j = mid+1;
		for(int k = lo; k <= hi; k++) {
			if (i > mid)
				input[k] = aux[j++];
			else if (j > hi)
				input[k] = aux[i++];
			else if(aux[i] < aux[j]) 
				input[k] = aux[i++];
			else
				input[k] = aux[j++];
		}
	}
}
