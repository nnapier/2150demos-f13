/**  Class: CircleTester
 * @author Nannette Napier
 * @version 1.0
 * Course: ITEC 2150 Fall 2013
 * Written: Aug 26, 2013
 *
 * This class --- description
 * 
 * Purpose: --- 
 */

/**
 * @author nnapier
 *
 */
public class CircleTester
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// create a small circle and SOP it
		Circle smallCircle = new Circle();
		smallCircle.setRadius(1);
		System.out.println("Small circle: " + smallCircle);

		// create a big circle and SOP it
		Circle bigCircle = new Circle();
		bigCircle.setRadius(10);
		System.out.println("Big circle: " + bigCircle);
	}

}
