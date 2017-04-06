package one;

public class Circle implements Shape{
	
	private double radius;
	
	/**
	 * constructor
	 * ensures that the radius is greater than 0
	 * @param radius radius of circle
	 * @throws Exception
	 */
	public Circle(double radius) throws Exception{
		if(radius <= 0){
			throw new Exception("Must have positive radius");
		}
		this.radius = radius;
	}
	
	/**
	 * calculates the area of the circle
	 */
	public double getArea() {
		return Math.PI*Math.pow(radius, 2);
	}

	/**
	 * calculates the perimeter (circumference) of
	 * the circle
	 */
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}

}
