package tuan2;

public class Rectangle {
	private double width;
	private double height;

	public Rectangle() {

	}

	public Rectangle(double width, double height) {

		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getArea() {
		return Math.round(this.height * this.width * 100.0) / 100.0;
	}

	public double getPerimeter() {
		return Math.round((this.height + this.width) * 2 * 100.0) / 100.0;
	}

}
