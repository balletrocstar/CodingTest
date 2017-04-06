package one;

public class Rectangle implements Shape{
	
	private double length;
	private double width;
	
	/**
	 * constructor
	 * ensures length and width are greater than 0
	 * @param length length of rectangle
	 * @param width width of rectangle
	 * @throws Exception
	 */
	public Rectangle(double length, double width) throws Exception{
		if(length <= 0 || width <= 0){
			throw new Exception("Must have positive length and width");
		}
		this.length = length;
		this.width = width;
	}
	
	/**
	 * calculates area from length and width
	 */
	public double getArea() {
		return length*width;
	}

	/**
	 * calculates perimeter by adding the length of the sides
	 */
	public double getPerimeter() {
		return (2*length) + (2*width);
	}

}
