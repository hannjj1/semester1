package parrayandlistutilities;

import java.util.ArrayList;

public class ArrayAndListUtilities {

	public static int findMax(int[] numbers) {
		int max = numbers[0];
		for (int item : numbers) {
			if (item > max) {
				max = item;
			}
		}
		return max;
	}

	public static int findMax(ArrayList<Integer> numbers) {
		int max = numbers.get(0);
		for (int item : numbers) {
			if (item > max) {
				max = item;
			}
		}
		return max;
	}

	public static int findMin(int[] numbers) {
		int min = numbers[0];
		for (int item : numbers) {
			if (item < min) {
				min = item;
			}
		}
		return min;
	}

	public static int findMin(ArrayList<Integer> numbers) {
		int min = numbers.get(0);
		for (int item : numbers) {
			if (item > min) {
				min = item;
			}
		}
		return min;
	}

	public static String findIt(int[] numbers, int wanted) {
		return "";
	}

	public static String findIt(ArrayList<Integer> numbers, int wanted) {
		return "";
	}
}