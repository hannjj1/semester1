package psalary;

public class Salary {
	private double gross;
	
	public Salary(double gross) {
		this.gross = gross;
	}
	
	public double getGross() {
		return gross;
	}
	
	public void setGross(double gross) {
		this.gross = gross;
	}
	
	public double getTax() {
		double tax = 0;
		if (gross > 70000) {
			tax = (gross - 70000) * 0.33 + (22000 * 0.3) + (34000 * 0.175) + (14000 * 0.105);
		}
		else if (gross > 48000) {
			tax = (gross - 48000) * 0.3 + (34000 * 0.175) + (14000 * 0.105);
		}
		else if (gross > 14000) {
			tax = (gross - 14000) * 0.175 + (14000 * 0.105);
		}
		else if (gross > 0){
			tax = gross * 0.105;
		}

		return tax;
//		if (gross <= 14000) {
//			tax = 0.105;
//			tax = gross * tax;
//			gross -= tax;
//		}
//		
//		else if (gross > 14000 && gross <= 48000){
//			tax = 0.175;
//			tax = gross * tax;
//			gross -= tax;
//		}
//		
//		else if (gross > 48000 && gross <= 70000){
//			tax = 0.3;
//			tax = gross * tax;
//			gross -= tax;
//		}
//		
//		else {
//			tax = 0.33;
//			tax = gross * tax;
//			gross -= tax;
//		}
	}
	
	public double getNet() {
		return gross - getTax();
	}
}
