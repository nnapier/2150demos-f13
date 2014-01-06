/**  Class: Car
 * @author Nannette Napier
 * @version 1.0
 * Course: ITEC 2150 Fall 2013
 * Written: Sep 12, 2013
 *
 * This class --- description
 * 
 * Purpose: --- 
 */

/**
 * @author nnapier
 *
 */
public class Car
{
	// instance variables
	private String make;
	private String model;
	private double price;
	
	// constructor
	public Car(String make, String model, double price)
	{
		this.make = make;
		this.model = model;
		this.price = price;
	}

	/**
	 * @return the make
	 */
	public String getMake()
	{
		return make;
	}

	/**
	 * @return the model
	 */
	public String getModel()
	{
		return model;
	}

	/**
	 * @return the price
	 */
	public double getPrice()
	{
		return price;
	}

	/**
	 * @param make the make to set
	 */
	public void setMake(String make)
	{
		this.make = make;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model)
	{
		this.model = model;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price)
	{
		this.price = price;
	}

	/* Method: toString
	 */
	@Override
	public String toString()
	{
		return "Car [make=" + make + ", model=" + model + 
				", price=" + price + "]\n";
	}
	
	
}
