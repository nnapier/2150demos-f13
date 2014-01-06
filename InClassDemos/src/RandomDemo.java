import java.util.Random;

/** Class: RandomDemo
 *  @author Nannette Napier
 *  @version 1.0
 * Course: ITEC 2150 Fall 2013
 * Written: Sep 20, 2013
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
public class RandomDemo 
{
	
	public static void doRandomApproach1()
	{
		/* 
		 * The first approach uses the Math.random method
		 * see http://docs.oracle.com/javase/7/docs/api/java/lang/Math.html#random%28%29
		 * 
		 * Basically, the method returns a double between 0.0 and 1.0 inclusive.
		 * For our number of legs, we want an integer between 1 and 6. 
		 * We will : (1) Generate a double between 0.0 and 5.0
		 *           (2) Cast to convert to an int
		 *           (3) Add 1 to make sure we don't get 0
		 */
		int numLegs = (int)(5*Math.random()) +1;
		
		System.out.println("doRandomApproach1: \nSample random numbers. Calling inside a for loop");
		for (int i = 0; i<9; i++)
		{
			numLegs = (int)(5*Math.random()) +1;
			System.out.println("legs = " + numLegs);			
		}
		
	}

	public static void doRandomApproach2()
	{
		/* 
		 * The second approach uses the Random.nextInt method
		 * see http://docs.oracle.com/javase/7/docs/api/java/util/Random.html#method_summary
		 * 
		 * Basically, the method returns an integer between 0 and the number passed in (not included).
		 * For our number of legs, we want an integer between 1 and 6. 
		 * We will : (1) Generate an integer between 0 and 5
		 *           (2) Add 1 to make sure we don't get 0
		 */
		Random generator = new Random();
		int numLegs = generator.nextInt(6) +1;
		
		System.out.println("doRandomApproach2: \nSample random numbers. Calling inside a for loop");
		for (int i = 0; i<9; i++)
		{
			numLegs = generator.nextInt(6) +1;
			System.out.println("legs = " + numLegs);			
		}
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		doRandomApproach1();
		doRandomApproach2();
		
	}

}
