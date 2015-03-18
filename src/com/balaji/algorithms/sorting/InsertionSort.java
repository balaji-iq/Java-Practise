package com.balaji.algorithms.sorting;

import com.balaji.methods.Swap;

/**
 * Class to implement insertion sort.
 * 
 * @author Balaji Rayakota.
 *
 */
public class InsertionSort {

	/**
	 * Method to sort an int array in non-descending order.
	 * 
	 * @param input the int array that has to be sorted, can be null or empty.
	 * @return a possibly null array which is a permutation of the input such
	 *         that it is in non-descending order.
	 */
	public static int[] sort(int[] input) {
		if (input == null)
			return null;

		for (int i = 1; i < input.length; i++) {
			for (int j = i; j > 0; j--) {
				if (input[j] < input[j - 1]) {
					Swap.swap(input, j, j - 1);
				} else {
					break;
				}
			}
		}
		return input;
	}
}
