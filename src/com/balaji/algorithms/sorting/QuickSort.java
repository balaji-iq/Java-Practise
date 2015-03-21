package com.balaji.algorithms.sorting;

import java.util.Arrays;
import java.util.Random;

import com.balaji.methods.Swap;

/**
 * Implementation of quick sort.
 * 
 * @author Balaji Rayakota
 *
 */
public class QuickSort {
	private static Random rand = new Random();

	public static void sort(int[] input) {
		if (input != null)
			sort(input, 0, input.length - 1);
	}

	/**
	 * Sort input[lo..hi]
	 * 
	 * @param input an integer array can be null or empty.
	 * @param lo the lower index.
	 * @param hi the higher index.
	 */
	public static void sort(int[] input, int lo, int hi) {
		if (input == null || input.length < 2 || hi <= lo)
			return;

		if (lo < 0 || lo > input.length || hi < 0 || hi > input.length)
			throw new IllegalArgumentException(
					"arguments lo and hi lie outside input array");

		int randomPivot = lo + rand.nextInt(hi-lo);
		Swap.swap(input, lo, randomPivot);
		
		int index = partition(input, lo, hi);
		sort(input, lo, index - 1);
		sort(input, index + 1, hi);
	}

	/**
	 * Partitions input[lo..hi] and places input[lo] = key in input[index] such
	 * that for all x E [lo, index-1] input[x] <= key, and for all x E (index+1,
	 * hi) input[x] > key.
	 * 
	 * hi >= lo.
	 * 
	 * @param input an integer array, cannot be null may be empty.
	 * @param lo the lower index.
	 * @param hi the higher index.
	 * @return the position of input[lo] where it will be finally placed in the
	 *         sorted array.
	 */
	public static int partition(int[] input, int lo, int hi) {
		if (input == null)
			throw new IllegalArgumentException("input was null.");

		if (hi < lo)
			throw new IllegalArgumentException("hi was less than lo");

		if (hi < 0 || hi >= input.length || lo < 0 || lo >= input.length)
			throw new ArrayIndexOutOfBoundsException(
					"arguments hi and lo are not present in array input");

		int left = lo;
		int right = hi + 1;
		int key = input[lo];

		/**
		 * Loop invariants: 1. input[lo..left] <= key. 2. input[right..hi] >key.
		 */
		while (true) {
			// Invariant: input[lo..left] <= key
			while (left < hi && input[left + 1] <= key) {
				left++;
			}

			// Invariant: input[right..hi] > key
			while (input[right - 1] > key) {
				right--;
			}

			if (left + 1 > right - 1)
				break;
			Swap.swap(input, left + 1, right - 1);
		}

		Swap.swap(input, right - 1, lo);

		return right - 1;
	}

	/**
	 * Testing for {@link QuickSort} methods.
	 * 
	 * @param args the command line arguments.
	 */
	public static void main(String[] args) {
		int[] a = { 3, 5, 2, 1, 1, 4, 0, -99, 888, 16, 45, 22, 22, 11, 22 };
		sort(a);

		System.out.println(Arrays.toString(a));

		int[] b = null;
		sort(b);
		System.out.println(Arrays.toString(b));

		int[] c = {};
		sort(c);
		System.out.println(Arrays.toString(c));

		int[] d = { 41, 9 };
		sort(d);
		System.out.println(Arrays.toString(d));
	}

}
