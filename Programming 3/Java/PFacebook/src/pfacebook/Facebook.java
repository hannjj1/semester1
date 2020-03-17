package pfacebook;

import java.util.ArrayList;

public class Facebook {
	private String userName = "Jacob Hannigan";
	private int friendCount;
	ArrayList<Friend> friendList = new ArrayList<Friend>();

	public Facebook(String userName) {
		this.userName = userName;

	}

	public String addFriend(Friend friend) {
		boolean alreadyThere = false;

		for (Friend item : friendList) {
//			item.add(newFriend);
			if (item.isTheSame(friend)) {
				alreadyThere = true;
			}
		}
		if (alreadyThere == false) {
			friendList.add(friend);
		} else {
			System.out.println("You cannot do that");
		}

		return "";
	}

	public String lessThan21() {
		StringBuilder buffer = new StringBuilder();
		for (Friend item : friendList) {
			if (item.getBirthDate() != null) {
				if (item.calcAge() < 21) {
					buffer.append(buffer + "/n");
				}
			}
		}
		return "";
	}

	public void unfriend(Friend friend) {
		friendList.remove(friend);
	}

	public String listFriends(Friend friend) {

		for (Friend item : friendList) {
			System.out.println(item);
		}
		return "";
	}

	public String toString() {
		return "";
	}
}
