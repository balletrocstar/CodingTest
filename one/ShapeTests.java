package one;

import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * unit tests for Circle, Rectangle, and Triangle classes
 * 
 * @author Sarah Jeter
 *
 */
public class ShapeTests {
  @Test
  /**
   * creates a circle and calculates area and perimeter
   * asserts that the correct area was calculated
   * uses a delta of 0.1 to account for rounding of the answer
   * @throws Exception
   */
  public void evaluateCircle() throws Exception {
    Circle circle = new Circle(5);
    double area = circle.getArea();
    double perimeter = circle.getPerimeter();
    
    /*delta of 0.1 used for rounding with pi*/
    assertEquals(78.5, area, 0.1);
    assertEquals(31.4, perimeter, 0.1);
  }
  
  @Rule
  public ExpectedException exception = ExpectedException.none();

  @Test
  /**
   * tests that the correct exception is thrown with
   * the correct message
   * @throws Exception
   */
  public void circleException() throws Exception{
      exception.expect(Exception.class);
      exception.expectMessage("Must have positive radius");
      new Circle(-2);
  }
  
  @Test
  /**
   * creates a rectangle and calculates area and perimeter
   * asserts that the correct area was calculated
   * uses a delta of 0 because the answer is exact
   * @throws Exception
   */
  public void evaluateRectangle() throws Exception{
	  Rectangle rect = new Rectangle(3, 10);
	  double area = rect.getArea();
	  double perimeter = rect.getPerimeter();
	  
	  /*delta of 0 used because it should be exact*/
	  assertEquals(30, area, 0);
	  assertEquals(26, perimeter, 0);
  }
  
  @Test
  /**
   * tests that the correct exception is thrown with
   * the correct message
   * @throws Exception
   */
  public void rectangleException() throws Exception{
	  exception.expect(Exception.class);
	  exception.expectMessage("Must have positive length and width");
	  new Rectangle(-1, 5);
	  new Rectangle(-5, 0);
	  new Rectangle(5, -1);
  }
  
  @Test
  /**
   * creates a triangle and calculates area and perimeter
   * asserts that the correct area was calculated
   * uses a delta of 0 because the answer is exact
   * @throws Exception
   */
  public void evaluateTriangle() throws Exception{
	  Triangle tri = new Triangle(3, 4, 5);
	  double area = tri.getArea();
	  double perimeter = tri.getPerimeter();
	  
	  /*delta of 0 used because it should be exact*/
	  assertEquals(6, area, 0);
	  assertEquals(12, perimeter, 0);
  }
  
  @Test
  /**
   * tests that the correct exception is thrown with
   * the correct message
   * @throws Exception
   */
  public void triangleException() throws Exception{
	  exception.expect(Exception.class);
	  exception.expectMessage("All sides and height must be positve");
	  new Triangle(0, 0, 0);
	  new Triangle(-1, -5, 1);
  }
  
  @Test
  /**
   * tests that the correct exception is thrown with
   * the correct message
   * @throws Exception
   */
  public void triangleException2() throws Exception{
	  exception.expectMessage("Triangle not possible with sides given");
	  new Triangle(1, 15, 1);
	  new Triangle(8, 5, 1);
  }
}