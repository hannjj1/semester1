package probot;

public class Robot {

	private String name;
	private String fuel;
	
	public Robot(String rName, String rFuel) {
		name = rName;
		fuel = rFuel;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getFuel() {
		return fuel;
	}
	
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

}
