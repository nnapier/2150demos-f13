/**Class: Bike
* @author Nannette Napier
* @version 1.0
* Course : ITEC 2150 Fall 2013
* Written: August 1, 2013
*
* This class represents a bike and has associated methods
*
*/
public class Bike
{
	// Instance Variables
	private int numWheels;
	private double diameter;
	private int yearBuilt;
	
	// Constructor(s)
	// -- Constructors are always public
	// -- Constructors are always called the same as the 
	//    name of the class
	// -- Constructors do not have a return type
	// -- The point of the constructor is to initialize 
	//    all the instance variables
	/**
	 * No-argument constructor for Bike
	 */
	public Bike()
	{
		numWheels = 2; // use default value
		diameter = 15; // use default value
		yearBuilt = 2013;
	}
	
	/**
	 * 3 argument constructor for Bike
	 * @param inNumWheels Number of wheels for your bike
	 * @param inDiameter Diameter in centimeters for your bike
	 * @param inYearBuilt Year the manufacturer built your bike
	 * (Precondition: Number of wheels is greater than zero,
	 * 				  Diameter is greater than zero, and
	 * 				  Year built is greater than zero
	 */
	public Bike(int inNumWheels, double inDiameter, int inYearBuilt)
	{
		assert inNumWheels >0;
		assert inDiameter >0;
		assert inYearBuilt >0;
		
		numWheels = inNumWheels; // use the parameter variables
		diameter = inDiameter;
		yearBuilt = inYearBuilt;
	}

	/**
	 * @return the numWheels
	 */
	public int getNumWheels()
	{
		return numWheels;
	}

	/**
	 * @param numWheels the numWheels to set
	 * (Precondition: numWheels passed in is > 0)
	 */
	public void setNumWheels(int numWheels)
	{
		assert numWheels > 0;
		this.numWheels = numWheels;
	}

	/**
	 * @return the diameter
	 */
	public double getDiameter()
	{
		return diameter;
	}

	/**
	 * @param diameter the diameter to set
	 */
	public void setDiameter(double diameter)
	{
		this.diameter = diameter;
	}

	/**
	 * @return the yearBuilt
	 */
	public int getYearBuilt()
	{
		return yearBuilt;
	}

	/**
	 * @param yearBuilt the yearBuilt to set
	 */
	public void setYearBuilt(int yearBuilt)
	{
		this.yearBuilt = yearBuilt;
	}

	
}
