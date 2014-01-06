import java.util.Arrays;

/**  Class: Chapter8Demo
 * @author Nannette Napier
 * @version 1.0
 * Course: ITEC 2150 Fall 2013
 * Written: Sep 10, 2013
 *
 * This class --- description
 * 
 * Purpose: --- 
 */

/**
 * @author nnapier
 *
 */
public class Chapter8Demo
{

	public static void practiceWithStrings()
	{
		String school = "Georgia Gwinnett College";
		school.replace("G", "T");
		System.out.println("School " + school);
		
		String subject = "ITEC";
		subject.toLowerCase();
		System.out.println("Subject: " + subject);
		
		String value = school.replace("G", "T");
		System.out.println("Value: " + value);		

		
	}
	
	public static void morePracticeWithStrings()
	{
		String author = "Horstmann";
		String bigAuthor = author.toUpperCase();
		System.out.println("author: " + author);
		System.out.println("bigAuthor: " + bigAuthor);	
		
		
		String[] args = new String[5];
		System.out.println("args: " + Arrays.toString(args));
	}
	
	public static void practiceWithWrappers()
	{
		Integer value = 10;
		System.out.println(value);
		
		
		Integer[] values = new Integer[5];
		System.out.println(Arrays.toString(values));
	}
	
	public static void parameterExample(int num, double price)
	{
		System.out.println("-->Inside method, num is " + num + 
				   " and price is " + price);

		// Do NOT do. Has no effect on the calling method
		num = 999;
		price = 999.9;
		System.out.println("-->Inside method, num changed to " + num + 
						   " and price changed to " + price);	
	}
		
	public static void arrayExample(String[] message)
	{
		if (message.length >= 3)
		{
			message[0] = "Hello";
			message[1] = "there";
			message[2] = "World!";
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		//practiceWithStrings();
		//morePracticeWithStrings();
		//practiceWithWrappers();
		
		int param1 = 10;
		double param2 = 15.6;
		System.out.println("Before method call, param1 is " + param1 +
							" and param 2 is " + param2 );
		
		parameterExample(param1, param2);
		
		System.out.println("After method call, param1 is " + param1 +
				" and param 2 is " + param2 );
		
		System.out.println("-------------------");
		String [] wordArray = {"This", "is", "an", "array", "of", "Strings"};
		System.out.println( Arrays.toString(wordArray));
		arrayExample(wordArray);
		System.out.println( Arrays.toString(wordArray));

		System.out.println("-------------------");
		
	}

}
