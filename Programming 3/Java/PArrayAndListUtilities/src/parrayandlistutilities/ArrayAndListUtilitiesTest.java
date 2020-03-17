package pArrayAndListUtilities;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArrayAndListUtilitiesTest {

	int[] numbers = { 1, 4, 6, 7, 31, 77, 84, 1, 5, 8, 3, 4, 7, 0, 11, 462, 7, 44, 21, 11, 67 };
	int[] numbers2;
	ArrayList<Integer> numbers3 = new ArrayList<Integer>();
	ArrayList<Integer> numbers4;
	ArrayAndListUtilities worker = new ArrayAndListUtilities();

	@BeforeEach
	void setUp() throws Exception {
		numbers3.add(1111);
		numbers3.add(13);
		numbers3.add(4);
		numbers3.add(15);
		numbers3.add(71);
		numbers3.add(471);
		numbers3.add(14);
		numbers3.add(21);
		numbers3.add(1421);
		numbers3.add(4);
		numbers3.add(15);
		numbers3.add(1364);
		numbers3.add(13);
		numbers3.add(15);
		numbers3.add(2);
		numbers3.add(543);
		numbers3.add(6);
		numbers3.add(4);
	}

	@Test
	void testBubbelV1() {
		int[] arr = {5,8,2,3,1};
		int[] expected = {1,2,3,5,8};
		ArrayAndListUtilities.bubbelV1(arr);
		assertArrayEquals(expected, arr);
	}

	@Test
	void testBubbelV2() {
		int[] arr = {5,8,2,3,1};
		int[] expected = {1,2,3,5,8};
		ArrayAndListUtilities.bubbelV1(arr);
		assertArrayEquals(expected, arr);
	}

	@Test
	void testBubbelV3() {
		int[] arr = {5,8,2,3,1};
		int[] expected = {1,2,3,5,8};
		ArrayAndListUtilities.bubbelV1(arr);
		assertArrayEquals(expected, arr);
	}

	@Test
	void testFindMaxIntArray() {

		assertEquals(462, ArrayAndListUtilities.findMax(numbers));
	}

	@Test
	void testFindMaxArrayListOfInteger() {
		assertEquals(1421, ArrayAndListUtilities.findMax(numbers3));
	}

	@Test
	void testFindMinIntArray() {
		assertEquals(0, ArrayAndListUtilities.findMin(numbers));
	}

	@Test
	void testFindMinArrayListOfInteger() {
		assertEquals(2, ArrayAndListUtilities.findMin(numbers3));
	}

	@Test
	void testFindItIntArrayInt() {
		assertEquals("11 can be found in position(s): 14 19 ", ArrayAndListUtilities.findIt(numbers, 11));
	}

	@Test
	void testFindItArrayListOfIntegerInt() {
		assertEquals("4 can be found in position(s): 2 9 17 ", ArrayAndListUtilities.findIt(numbers3, 4));
	}

	@Test
	void testFindItIntArrayIntFAIL() {
		assertEquals("number not found", ArrayAndListUtilities.findIt(numbers, 1111111));
	}

	@Test
	void testFindItArrayListOfIntegerIntFAIL() {
		assertEquals("number not found", ArrayAndListUtilities.findIt(numbers3, 324));
	}

	@Test
	void testEmptyInt() {
		assertEquals(462, ArrayAndListUtilities.findMax(numbers2));
	}

	@Test
	void testEmptyList() {
		assertEquals(462, ArrayAndListUtilities.findMax(numbers4));
	}

}
