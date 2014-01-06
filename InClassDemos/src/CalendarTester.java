import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.Color;

/**  Class: CalendarTester
 * @author Nannette Napier
 * @version 1.0
 * Course: ITEC 2150 Fall 2013
 * Written: Aug 27, 2013
 *
 * This class --- description
 * 
 * Purpose: --- 
 */

/**
 * @author nnapier
 *
 */
public class CalendarTester
{

	/**
	 * @param args
	 */

	private static String convertColor(Color inColor)
	{
		String color = "Unknown";

		if (inColor.equals(Color.BLACK))
			color = "Black";
		else if (inColor.equals(Color.BLUE))
			color = "Blue";
		else if (inColor.equals(Color.CYAN))
			color = "Cyan";
		else if (inColor.equals(Color.DARK_GRAY))
			color = "Dark Gray";
		else if (inColor.equals(Color.GRAY))
			color = "Gray";
		else if (inColor.equals(Color.GREEN))
			color = "Green";
		else if (inColor.equals(Color.LIGHT_GRAY))
			color = "Light Gray";
		else if (inColor.equals(Color.MAGENTA))
			color = "Magenta";
		else if (inColor.equals(Color.ORANGE))
			color = "Orange";
		else if (inColor.equals(Color.PINK))
			color = "Pink";
		else if (inColor.equals(Color.RED))
			color = "Red";
		else if (inColor.equals(Color.WHITE))
			color = "White";
		else if (inColor.equals(Color.YELLOW))
			color = "Yellow";

		return color;
	}

	private static void testingColor()
	{
		// Creates an opaque sRGB color with the specified red, green, and blue values in the range (0 - 255). 
		Color color000 = new Color(0,0,0);
		System.out.println("All zeroes is the color: " + color000);
		System.out.println("A brighter version of this color is " + color000.brighter());

		Color color0_255_0 = new Color(0,255,0);
		System.out.println("Zero, 255, Zero is the color: " + color0_255_0);
		System.out.println("A lighter version of this color is " + color0_255_0.darker());


		Color color0_0_255 = new Color(0,0,255);
		System.out.println("Zero, zero, 255 is the color: " + color0_0_255);

		System.out.println(color0_0_255 + convertColor(color0_0_255));
		System.out.println(color0_255_0 + convertColor(color0_255_0));
		System.out.println(color000 + convertColor(color000));

		System.out.println("RGB for Light Gray is " + Color.LIGHT_GRAY);
		System.out.println("RGB for Pink is " + Color.PINK);



	}

	private static void testingCalendar()
	{
		// Note: Month is zero-based with 0 being January
		GregorianCalendar calendar = new GregorianCalendar(2004, 7, 19);
		System.out.println("ERA: " + calendar.get(Calendar.ERA));
		System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
		System.out.println("MONTH: " + calendar.get(Calendar.MONTH));
		System.out.println("DAY_OF_WEEK: " + calendar.get(Calendar.DAY_OF_WEEK));

	}
	private static void testingString()
	{
		// Note: Month is zero-based with 0 being January
		String name = "Nannette";
		System.out.println("name: " + name);
		System.out.println("name.toUpperCase(): " + name.toUpperCase());
		System.out.println("name: " + name);

	}


	public static void main(String[] args)
	{
		if (args!=null && args.length>0)
		{
			System.out.println("Number of arguments: " + args.length);
			for(int i=0; i<args.length; i++)
			{
				System.out.println("Arg[" + i + "] is " + args[i]);
			}
		}
		else
		{
			System.out.println("No arguments passed in");
		}
		
		//testingCalendar();
		//testingColor();
		testingString();


	}

}
