package parrayandlistutilities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayAndListUtilitiesTest {

	@Test
	void testFindMin(int[] numbers) {
		
		numbers[0] = 10;
		numbers[1] = 12;
		numbers[2] = 53;
		numbers[3] = 9;
		assertEquals(9, findMin(int[] numbers));
		
		
//		findMin(int[] numbers)
	}
	
	@Test
	void testEmptyArray() {
		assertThrows (NullPointerException.class,
			() -> {
			int[] nums = null;
			ArrayUtilities.findMax(nums);
		});
	}

}
