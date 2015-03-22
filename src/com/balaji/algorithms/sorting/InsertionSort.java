package com.balaji.algorithms.sorting;

import java.util.Arrays;

import com.balaji.methods.Swap;

/**
 * Class to implement insertion sort.
 * 
 * @author Balaji Rayakota.
 *
 */
public class InsertionSort {

	/**
	 * sorts input[0..input.length-1].
	 * @param input an integer array, may be null or empty.
	 */
	public static void sort(int[] input) {
		if (input != null && input.length > 1)
			sort(input, 0, input.length - 1);
	}

	/**
	 * Sorts input[lo..hi].
	 * 
	 * @param input an integer array, can be null or empty.
	 * @param lo the lower index, must lie inside input.
	 * @param hi the higher index, must lie inside input.
	 */
	public static void sort(int[] input, int lo, int hi) {
		if (lo < 0 || lo >= input.length || hi < 0 || hi >= input.length)
			throw new IllegalArgumentException(
					"lo or hi lies outside input array");

		if (input == null || hi <= lo)
			return;

		// Invariant: 1. input[lo..i] is sorted.
		for (int i = lo; i < hi; i++) {
			// Invariant: 1. input[lo..j] is sorted. 2. input[j..i] is sorted.
			for (int j = i; j > lo; j--) {
				if (input[j] < input[j - 1]) {
					Swap.swap(input, j, j - 1);
				} else {
					break;
				}
			}
		}
	}
	
	/**
	 * Testing.
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {
		int[] a = null;
		sort(a);
		System.out.println(Arrays.toString(a));
		
		int[] b = {};
		sort(b);
		System.out.println(Arrays.toString(b));
		
		int[] c = {3,88, -1, 0, -1, 8, 54, 4, 54, 0, 11, 88, 3, 11};
		sort(c);
		System.out.println(Arrays.toString(c));
	}
}
