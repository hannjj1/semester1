package pnameinstars;

public class NameInStars {
	
	private String name;
	
	public NameInStars(String userName) {
		name = userName;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String surroundNameInStars() {
		return "****" + name + "****\n"+ "****" + name + "****\n"+ "****" + name + "****";
	}
	
}
