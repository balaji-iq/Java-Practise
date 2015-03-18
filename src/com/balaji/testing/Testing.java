package com.balaji.testing;

import java.util.Arrays;

import com.balaji.algorithms.sorting.BubbleSort;
import com.balaji.algorithms.sorting.InsertionSort;

/**
 * Class for simple testing.
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
	}
}
