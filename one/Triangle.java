package one;

public class Triangle implements Shape{
	private double side_a;
	private double side_b; 
	private double side_c;
	
	/**
	 * constructor
	 * ensures that all sides are greater than 0 and that triangle is possible
	 * from the given sides. Adding the length of any two sides together must be greater
	 * than the third side
	 * 
	 * @param side_a first side
	 * @param side_b second side
	 * @param side_c third side
	 * @throws Exception
	 */
	public Triangle(double side_a, double side_b, double side_c) throws Exception{
		//ensure all sides are greater than 0
		if(side_a <= 0 || side_b <= 0 || side_c <= 0){
			throw new Exception("All sides and height must be positve");
		}
		//ensure that triangle is possible
		if(side_a + side_b <= side_c || side_b + side_c <= side_a 
				|| side_a + side_c <= side_b){
			throw new Exception("Triangle not possible with sides given");

		}
		this.side_a = side_a;
		this.side_b = side_b;
		this.side_c = side_c;
	}
	
	
	/**
	 * uses Heron's formula to find area from the length of the sides
	 */
	public double getArea() {
		double s = (side_a+side_b+side_c)/2;
		return Math.sqrt(s*(s-side_a)*(s-side_b)*(s-side_c));
	}
	
	/**
	 * adds length of the sides to find the perimeter
	 */
	public double getPerimeter() {
		return side_a + side_b + side_c;
	}

}
