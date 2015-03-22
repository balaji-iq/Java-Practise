package com.balaji.algorithms.sorting;

import java.util.Arrays;

import com.balaji.methods.Swap;

/**
 * Class to implement insertion sort.
 * 
 * @author Balaji Rayakota.
 */
public class BubbleSort {
	
	/**
	 * Sorts input array.
	 * @param input an integer array, can be null or empty.
	 */
	public static void sort(int[] input) {
		if (input == null || input.length < 2) 
			return;
		sort(input, 0, input.length-1);
	}
	/**
	 * Sorts input[lo..hi].
	 * 
	 * @param input an integer array, can be null or empty.
	 * @param lo the lower index, must be inside the array.
	 * @param hi the higher index, must be inside the array.
	 */
	public static void sort(int[] input, int lo, int hi) {
		if (lo < 0 || lo >= input.length || hi < 0 || hi >= input.length)
			throw new IllegalArgumentException(
					"argument lo or hi lies outside input array");

		if (input == null || input.length < 2)
			return;

		// Invariant 1. input[lo..i] is sorted 2. max(input[lo..i]) <=
		// min(input[i+1..hi])
		for (int i = lo; i <= hi; i++) {
			// find the minimum element in input[i, hi]
			int minIndex = i;

			// Invariant: min(input[i..j-1]) = input[minIndex].
			for (int j = i + 1; j <= hi; j++) {
				if (input[minIndex] > input[j]) {
					minIndex = j;
				}
			}

			Swap.swap(input, minIndex, i);
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
