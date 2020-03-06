package pfriend;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FriendTest {

	@Test
	void testIsValidNameFalse() {
//		Friend friend = new Friend("J", "Hannigan");
//		assertEquals(true, friend.isValidName(friend));
	}

	@Test
	void testCalcAge() {
		Friend friend = new Friend("Jacob", "Hannigan", 2000, 12, 22);
		assertEquals(19, friend.calcAge());
	}

	@Test
	void testIsTheSameSamePerson() {
		Friend friend1 = new Friend("Jacob", "Hannigan");
		Friend friend2 = new Friend("Jacob", "Hannigan");
		assertEquals(true, friend1.isTheSame(friend2));
	}

	@Test
	void testIsTheSameDifferentPerson() {
		Friend friend1 = new Friend("Jacob", "Hannigan");
		Friend friend2 = new Friend("Amber", "Little");
		assertEquals(false, friend1.isTheSame(friend2));
	}
	
	@Test
	void testToStringNoRelationshipStatus() {
		Friend friend = new Friend("Jacob", "Hannigan", 2000, 12, 22, "MALE", "Dunedin", "jacobhannigan@hotmail.com", SINGLE;
		assertEquals("Jacob Hannigan 2000-12-22 MALE Dunedin jacobhannigan@hotmail.com SINGLE", friend.toString());
	}
	
	@Test
	void testToStringNoBirthDate() {
		Friend friend = new Friend("Jacob", "Hannigan", 2000, 12, 22);
		assertEquals("Jacob Hannigan 2000-12-22", friend.toString());
	}
	
	
//		if (firstName == null || lastName == null) {
//			temp = "";
////			System.out.println("You cannot enter a friend without a name");
//		}
//
//		else if (birthDate == null) {
//			temp = firstName + " " + lastName;
////			StringBuilder buffer = new StringBuilder(firstName + " " + lastName);
//		}
//
//		else if (gender == null || homeTown == null || email == null || relationshipStatus == null) {
//			temp = firstName + " " + lastName + " " + birthDate;
//		}
//
//		else if (firstName != null && lastName != null && birthDate != null && gender != null && homeTown != null
//				&& email != null && relationshipStatus != null) {
//			temp = firstName + " " + lastName + " " + birthDate + " " + gender + " " + homeTown + " " + email + " "
//					+ relationshipStatus;


}
