package pfriend;

import java.time.LocalDate;

public class Friend {

	private String firstName;
	private String lastName;
	private LocalDate birthDate;
	private Gender gender;
	private String homeTown;
	private String email;
	private Relationship relationshipStatus;
	private LocalDate dateEntered;

	public Friend(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Friend(String firstName, String lastName, int year, int month, int day) {
		this(firstName, lastName);
		birthDate = LocalDate.of(year, month, day);
	}

	public Friend(String firstName, String lastName, int year, int month, int day, Gender gender, String homeTown,
			String email, Relationship relationshipStatus) {
		this(firstName, lastName, year, month, day);
		this.gender = gender;
		this.homeTown = homeTown;
		this.email = email;
		this.relationshipStatus = relationshipStatus;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public Gender getGender() {
		return gender;
	}

	public String getHomeTown() {
		return homeTown;
	}

	public String getEmail() {
		return email;
	}

	public Relationship getRelationshipStatus() {
		return relationshipStatus;
	}

	public LocalDate getDateEntered() {
		return dateEntered;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

//DO
	public boolean isValidName(String firstName) {
		if (firstName.length() > 1) {
			return true;
		}
		
		else {
			return false;
		}
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setRelationship(Relationship relationshipStatus) {
		this.relationshipStatus = relationshipStatus;
	}

	public void setDateEntered(LocalDate dateEntered) {
		this.dateEntered = dateEntered;
	}

	public int calcAge() {

		int age = dateEntered.getYear() - birthDate.getYear();

		if (dateEntered.getMonthValue() < birthDate.getMonthValue()) {
			age--;
		}

		if (dateEntered.getMonthValue() == birthDate.getMonthValue()) {

			if (dateEntered.getDayOfMonth() < birthDate.getDayOfMonth()) {
				age--;
			}
		}

		return age;
	}

	public boolean isTheSame(Friend friend) {

		if (this.firstName.equals(friend.getFirstName()) && this.lastName.equals(friend.getLastName())) {
			return true;
		}

		else {
			return false;
		}
	}

	public String toString() {

		String temp = "";

		if (firstName == null || lastName == null) {
			temp = "";
//			System.out.println("You cannot enter a friend without a name");
		}

		else if (birthDate == null) {
			temp = firstName + " " + lastName;
//			StringBuilder buffer = new StringBuilder(firstName + " " + lastName);
		}

		else if (gender == null || homeTown == null || email == null || relationshipStatus == null) {
			temp = firstName + " " + lastName + " " + birthDate;
		}

		else if (firstName != null && lastName != null && birthDate != null && gender != null && homeTown != null
				&& email != null && relationshipStatus != null) {
			temp = firstName + " " + lastName + " " + birthDate + " " + gender + " " + homeTown + " " + email + " "
					+ relationshipStatus;
		}

		return temp;
//		return firstName + " " + lastName;
	}
}
