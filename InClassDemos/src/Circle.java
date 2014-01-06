/** Class: Circle
 *  @author Nannette Napier
 *  @version 1.0
 * Course: ITEC 2150 Fall 2013
 * Written: Aug 26, 2013
 *
 * This class ****
 *
 * Purpose: The purpose is ***
 * 
 */

/**
 * @author nnapier
 *
 */
public class Circle 
{
	// Instance variables
	private double radius;
	
	// Constructors - no argument
	public Circle()
	{
		radius = 0;
	}

	// Getters and Setters
	/**
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	public String toString()
	{
		String value = "Radius is " + radius;
		return value;
	}
	
	

}
