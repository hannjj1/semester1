package psalary;

public class Salary {
	private double gross;
	
	public Salary(double gross) {
		gross 
	}
	
	public double getGross() {
		return gross;
	}
	
	public void setGross(double gross) {
		
	}
	
	public double getTax() {
		
		double tax;
		
		if (gross <= 14000) {
			tax = 0.105;
			tax = gross * tax;
			gross -= tax;
		}
		
		else if (gross > 14000 && gross <= 48000){
			tax = 0.175;
			tax = gross * tax;
			gross -= tax;
		}
		
		else if (gross > 48000 && gross <= 70000){
			tax = 0.3;
			tax = gross * tax;
			gross -= tax;
		}
		
		else {
			tax = 0.33;
			tax = gross * tax;
			gross -= tax;
		}
		
		return gross;
	}
	
	public double getNet() {
		return gross;
	}
}
