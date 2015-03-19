package com.balaji.testing;

import java.util.Arrays;

import com.balaji.algorithms.sorting.BubbleSort;
import com.balaji.algorithms.sorting.InsertionSort;
import com.balaji.algorithms.sorting.MergeSort;

/**
 * Class for simple testing.
 * 
 * @author Balaji Rayakota.
 *
 */
public class Testing {
	/**
	 * @param args The command line arguments.
	 */
	public static void main(String[] args) {
		int[] a = null;
		System.out.println(Arrays.toString(BubbleSort.sort(a)));
		System.out.println(Arrays.toString(InsertionSort.sort(a)));

		int[] b = {7, 9,2, 14, 2, 4, 0, -18, -33, 14, -18, 11};
		MergeSort.sort(b);
		System.out.println(Arrays.toString(b));
	}
}
