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

	}

	public void setLastName(String lastName) {

	}

	public boolean isValidName(String firstName) {
		return false;
	}

	public void setBirthDate(LocalDate birthDate) {

	}

	public void setGender(String gender) {

	}

	public void setHomeTown(String homeTown) {

	}

	public void setEmail(String email) {

	}

	public void setRelationship(Relationship relationshipstatus) {

	}

	public int calcAge() {

		int age = (dateEntered.getYear() - birthDate.getYear());

		if (dateEntered.getMonthValue() < birthDate.getMonthValue()) {
			age--;
		}

		else if (dateEntered.getMonthValue() == birthDate.getMonthValue()) {

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
		if (birthDate == null) {
			StringBuilder buffer = new StringBuilder(firstName + " " + lastName);
		}

		else if (gender == null || homeTown == null || email == null || relationshipStatus == null) {

		}
		return buffer;
	}
}
