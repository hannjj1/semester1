package pfriend;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class FriendTest {
	private Friend jacob = new Friend("Jacob", "Hannigan", 2000, 12, 22, Gender.MALE, "Dunedin", "jacobhannigan@hotmail.com", Relationship.SINGLE);
	private Friend bernie = new Friend("Bernie", "Cosgrove", 1991, 8, 21);
	private Friend amber = new Friend("Amber", "Little");
	private Friend test = new Friend("J", "J", 1991, 3, 20);
	
	@Test
	void testCalcAge() {
		assertEquals(19, jacob.calcAge());
	}
	
	@Test
	void testCalcAge2() {
		assertEquals(28, test.calcAge());
	}

	@Test
	void testIsTheSameSamePerson() {
		assertEquals(true, jacob.isTheSame(jacob));
	}

	@Test
	void testIsValidName1() {
		assertEquals(true, jacob.isValidName(jacob));
	}

	@Test
	void testIsValidName2() {
		assertEquals(false, test.isValidName(test));
	}

	@Test
	void testIsTheSame1() {
		assertEquals(true, jacob.isTheSame(jacob));
	}

	@Test
	void testIsTheSame2() {
		assertEquals(false, bernie.isTheSame(amber));
	}
	
	@Test
	void testToString() {
		assertEquals("Jacob Hannigan 2000-12-22 MALE Dunedin jacobhannigan@hotmail.com SINGLE", jacob.toString());
	}
	
	@Test
	void testToString1() {
		assertEquals("Bernie Cosgrove 1991-08-21", bernie.toString());
	}
	
	@Test
	void testToString2() {
		assertEquals("Amber Little", amber.toString());
	}

	@Test
	void testGetBirthDate(){
		LocalDate d1 = LocalDate.of(1991, 8, 21);
		assertEquals(d1 , bernie.getBirthDate());
	}

	@Test
	void testGetDateEntered() {
		LocalDate d1 = LocalDate.of(2020, 3, 10);
		assertEquals(d1, bernie.getDateEntered());
	}

	@Test
	void testGetGender() {
		assertEquals(Gender.MALE, jacob.getGender());
	}

	@Test
	void testGetEmail() {
		assertEquals("jacobhannigan@hotmail.com", jacob.getEmail());
	}

	@Test
	void testGetHomeTown() {
		assertEquals("Dunedin", jacob.getHomeTown());
	}

	@Test
	void testGetRelationshipStatus() {
		assertEquals(Relationship.SINGLE, jacob.getRelationshipStatus());
	}
}