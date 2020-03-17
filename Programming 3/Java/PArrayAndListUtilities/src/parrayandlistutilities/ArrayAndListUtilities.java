package pArrayAndListUtilities;

import java.util.ArrayList;

public class ArrayAndListUtilities {
	public static void checkNullInt(int[] numbers) {
		if (numbers == null) {
			throw new NullPointerException("array is empty");
		}
	}

	public static void checkNullList(ArrayList<Integer> numbers) {
		if (numbers == null) {
			throw new NullPointerException("array is empty");
		}
	}

	public static int findMax(int[] numbers) {
		checkNullInt(numbers);

		int largest = numbers[0];

		for (int item : numbers) {
			if (item > largest) {
				largest = item;
			}
		}

		return largest;
	}

	public static int findMax(ArrayList<Integer> numbers) {
		checkNullList(numbers);

		int largest = numbers.get(0);

		for (int item : numbers) {
			if (item > largest) {
				largest = item;
			}
		}

		return largest;
	}

	public static int findMin(int[] numbers) {
		checkNullInt(numbers);

		int smallest = numbers[0];

		for (int i : numbers) {
			if (i < smallest) {
				smallest = i;
			}
		}

		return smallest;
	}

	public static int findMin(ArrayList<Integer> numbers) {
		checkNullList(numbers);

		int smallest = numbers.get(0);

		for (int i : numbers) {
			if (i < smallest) {
				smallest = i;
			}
		}

		return smallest;
	}

	public static String findIt(int[] numbers, int wanted) {
		checkNullInt(numbers);

		Boolean numFound = false;
		StringBuilder sb = new StringBuilder();
		sb.append(wanted + " can be found in position(s): ");
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == wanted) {
				sb.append(i + " ");
				numFound = true;
			}
		}

		if (numFound == true) {
			return sb.toString();
		}

		else {
			return "number not found";
		}
	}

	public static String findIt(ArrayList<Integer> numbers, int wanted) {
		checkNullList(numbers);

		Boolean numFound = false;
		StringBuilder sb = new StringBuilder();
		sb.append(wanted + " can be found in position(s): ");
		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) == wanted) {
				sb.append(i + " ");
				numFound = true;
			}
		}

		if (numFound == true) {
			return sb.toString();
		}

		else {
			return "number not found";
		}
	}

	public static void bubbelV1(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[i] > numbers[j]) {
					int temp = numbers[j + 1];
					numbers[j + 1] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
	}

	public static void bubbelV2(int[] numbers) {
		
	}

	public static void bubbelV3(int[] numbers) {
		
	}

	public static void selectionSort(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			
		}
	}
}
