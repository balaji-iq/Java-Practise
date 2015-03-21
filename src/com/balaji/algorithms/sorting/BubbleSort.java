package com.balaji.algorithms.sorting;

import com.balaji.methods.Swap;

/**
 * Class to implement insertion sort.
 * @author Balaji Rayakota.
 */
public class BubbleSort {
	/**
	 * Sort the input array of integers in ascending order.
	 * @param input an integer array which is supposed to be sorted, can be null or empty.
	 * @return an array of integers output such that output[i] <= output[i+1] for all i E [0, output.length), output can be null.
	 */
	public static int[] insertionSort(int[] input) {
		// If input is null return null.
		if (input == null) {
			return null;
		}
		
		for(int i = 0; i < input.length; i++) {
			//find the minimum element in input[i, input.length-1]
			int minIndex = i;
			for(int j = i+1; j < input.length; j++){
				if(input[minIndex] > input[j]) {
					minIndex = j;
				}
			}
			
			// min(input[i, input.length-1]) = input[minIndex], swap input[minIndex] and input[i].
			Swap.swap(input, minIndex, i);
		}
		
		return input;
	}
}
