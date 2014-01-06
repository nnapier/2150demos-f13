/**Class: BikeTester
* @author Nannette Napier
* @version 1.0
* Course : ITEC 2150 Fall 2013
* Written: August 1, 2013
*
* This class kekwlerw
*
*/

public class BikeTester
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// Create the bike1 object
		Bike bike1 = new Bike(4, 10.3, 2013);
		bike1.setNumWheels(5);
		
		// Print out each of the instance variables
		System.out.println("Number of wheels is: " + bike1.getNumWheels());
		System.out.println("Diameter is: "  + bike1.getDiameter());
		System.out.println("Year built is: " + bike1.getYearBuilt());
		
		
		// Create bike2
		Bike badBike = new Bike(-4, 10.4, 2010);
		System.out.println(badBike);
	}

}
