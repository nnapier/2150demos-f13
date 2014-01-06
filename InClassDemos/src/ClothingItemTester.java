import java.util.Arrays;

/** Class: ClothingItemTester
 *  @author Nannette Napier
 *  @version 1.0
 * Course: ITEC 2150 Fall 2013
 * Written: Aug 23, 2013
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
public class ClothingItemTester 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// this calls the no-argument constructor
		ClothingItem shirt = new ClothingItem();
		System.out.println("The shirt item id is " + shirt.getItemId());
		System.out.println("The shirt size is " + shirt.getSize());
		System.out.println("The shirt color is " + shirt.getColor());
		System.out.println(shirt.toString());
		System.out.println(shirt);
		
		// Call the constructor that takes 1 argument
		ClothingItem pants = new ClothingItem(89);
		System.out.println("The pants item id is " + pants.getItemId());
		System.out.println("The pants size is " + pants.getSize());
		System.out.println("The pants color is " + pants.getColor());

		// Call the constructor that takes ALL 9 arguments
		ClothingItem shoes = new ClothingItem ( 97, "XLarge", "Red", "Nike",
											    19.95, "shoes", 18.95, "female",
											    10.65);
		System.out.println("The shoes item id is " + shoes.getItemId());
		System.out.println("The shoes size is " + shoes.getSize());
		System.out.println("The shoes color is " + shoes.getColor());
		
		// Creating an array of ClothingItem objects
		System.out.println("Printing ClothingItem objects!");
		ClothingItem[] clothingRack = new ClothingItem[10];
		clothingRack[0] = shirt;
		clothingRack[1] = pants;
		clothingRack[2] = shoes;
		
		for (int i=0; i<10; i++)
		{
			System.out.println(clothingRack[i]);
		}
		
		System.out.println( Arrays.toString( clothingRack));
	}

}
