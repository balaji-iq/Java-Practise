package com.balaji.methods;

/**
 * Provides implementation to swap two positions of an array.
 * 
 * @author Balaji Rayakota.
 *
 */
public class Swap {
	/**
	 * Swap input arrays with positions index1 and index2 swapped.
	 * 
	 * @param <T> the type of array
	 * @param input an array, can be null or empty.
	 * @param index1 first position.
	 * @param index2 second position.
	 * @return an array with positions swapped.
	 * @throws NullPointerException when input array is null.
	 * @throws ArrayIndexOutOfBoundsException when index1 or index2 lies outside
	 *             of input array.
	 */
	public static <T> T[] swap(T[] input, int index1, int index2)
			throws NullPointerException, ArrayIndexOutOfBoundsException {
		if (input == null) {
			throw new NullPointerException("input array is null");
		}

		if (index1 >= input.length || index2 >= input.length) {
			throw new ArrayIndexOutOfBoundsException(
					"one of the index to be swapped is greater than array size");
		}
		T temp = input[index1];
		input[index1] = input[index2];
		input[index2] = temp;

		return input;
	}

	/**
	 * Swap input arrays with positions index1 and index2 swapped.
	 * 
	 * @param input an array, can be null or empty.
	 * @param index1 first position.
	 * @param index2 second position.
	 * @return an array with positions swapped.
	 * @throws NullPointerException when input array is null.
	 * @throws ArrayIndexOutOfBoundsException when index1 or index2 lies outside
	 *             of input array.
	 */
	public static int[] swap(int[] input, int index1, int index2)
			throws NullPointerException, ArrayIndexOutOfBoundsException {
		if (input == null) {
			throw new NullPointerException("input array is null");
		}

		if (index1 >= input.length || index2 >= input.length) {
			throw new ArrayIndexOutOfBoundsException(
					"one of the index to be swapped is greater than array size");
		}
		int temp = input[index1];
		input[index1] = input[index2];
		input[index2] = temp;

		return input;
	}
}
