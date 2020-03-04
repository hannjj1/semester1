package ptempconverter;

public class TempConverterApp {
	
	private double cel;
	private double fah;
	private double kel;
	
	
	public TempConverterApp(double celsius) {
		cel = celsius;
	}
	
	public double getCel(){
		fah = (cel * 9/5) + 32;
		kel = cel + 273.15;
		
		return cel;
	}
	
	public double getFah() {
		cel = (fah - 32) * 5/9;
		kel = (fah - 32) * 5/9 + 273.15;
		
		return fah;
	}
	
	public double getKel() {
		cel = kel - 273.15;
		fah = (kel - 273.15) * 9/5 + 32;
		
		return kel;
	}
	
	public void setCel(double celsius) {
		cel = celsius;
	}
	
	public void setFah(double fahrenheit) {
		fah = fahrenheit;
	}
	
	public void setKel(double kelvin) {
		kel = kelvin;
	}
	
	public String toString() {
		StringBuilder temp = new StringBuilder(cel + "C converts to " + fah + "F and " + kel + "K");
		return temp;
	}
}
