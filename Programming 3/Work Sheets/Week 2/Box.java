package pbox;

public class Box {
	
	private double height;
	private double width;
	private double length;
	
	public Box(double size) {
		height = width = length = size;
	}
	public Box(double squareBase, double height) {
		this.height = height;
		width = length = squareBase;
	}
	
	public Box(double height, double length, double width) {
		this.height = height;
		this.length = length;
		this.width = width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void	setHeight(double height) {
		this.height = height;
	}
	
	public void	setWidth(double width) {
		this.width = width;
	}
	
	public void	setLength(double length) {
		this.length = length;
	}
	
	public double calcVolume() {
		double volume = length * height * width;
		return volume;
	}
	
	public double calcSurfaceArea() {
		double sa = 2 * length * width + 2 * length * height + 2 * width * height;
		return sa;
	}
	
	public String toString() {
		return "The height is: " + height + " width is: " + width + " length is: " + length;
	}

}
