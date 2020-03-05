package ptempconverter;

public class TempConverterApp {

	private double cel;
	private double fah;
	private double kel;

	public TempConverterApp(double celsius) {
		this.cel = celsius;
		this.fah = (cel * 9 / 5) + 32;
		this.kel = cel + 273.15;
	}

	public double getCel() {
		return cel;
	}

	public double getFah() {
		return fah;
	}

	public double getKel() {
		return kel;
	}

	public void setCel(double cel) {
		this.cel = cel;
		this.fah = (cel * 9 / 5) + 32;
		this.kel = cel + 273.15;
	}

	public void setFah(double fah) {
		this.fah = fah;
		this.cel = (fah - 32) * 5 / 9;
		this.kel = (fah - 32) * 5 / 9 + 273.15;
	}

	public void setKel(double kel) {
		this.kel = kel;
		this.cel = kel - 273.15;
		this.fah = (kel -273.15) * 9 / 5 + 32;
	}

	public String toString() {
//		StringBuilder temp = new StringBuilder(cel + "C converts to " + fah + "F and " + kel + "K");
		return "Celsius: " + cel + " | Fahrenheit: " + fah + " | Kelvin: " + kel;
	}
}
