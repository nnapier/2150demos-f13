import java.util.Scanner;

/**
 * 
 * @author nnapier
 *
 */

public class SpecialDay
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int month = 0;
		int day = 0;
		boolean goAgain = true;

		while ( goAgain )
		{
			System.out.print("Enter month:");

			if (keyboard.hasNextInt())
			{
				month = keyboard.nextInt();
				if ( month < 1 || month > 12)
				{
					System.out.println("Error: Month should only be between 1 and 12");
				}
			}
			else
			{
				String temp = keyboard.nextLine();
				System.out.println("Error: Please enter a numeric value for month (1-12)");
			}

			System.out.print("Enter day:");
			if (keyboard.hasNextInt())
			{
				day = keyboard.nextInt();
				if ( day < 1 || day > 31)
				{
					System.out.println("Error: Day should only be between 1 and 31");
				}
			}
			else
			{
				String temp = keyboard.nextLine();
				System.out.println("Error: Please enter a numeric value for day (1-31)");
			}

			if (month == 1 && day == 1)
			{
				System.out.println("New Year's Day");
			}
			else if (month == 7 && day == 4)
			{
				System.out.println("Independence Day");
			}
			else
			{
				System.out.println("Not a special day");
			}

			System.out.println("Do you want to enter another date? ");
			System.out.println("Please enter 1 for yes");
			int answer = keyboard.nextInt();
			if (answer == 1)
			{
				System.out.println("We want to go again");
			}
			else
			{
				goAgain = false;
			}
			if (answer ==2) {
				System.out.println("Answer is 2");
			}
		}

	}

}
