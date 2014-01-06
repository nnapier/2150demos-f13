import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/** Class: ArrayListDemo
 *  @author Nannette Napier
 *  @version 1.0
 * Course: ITEC 2150 Fall 2013
 * Written: Sep 4, 2013
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

public class ArrayListDemo 
{
	public static final double SMALL_SCALE = 0.3;
	public static final double BIG_SCALE = 3.0;

	/**
	 * @param args
	 */
	/** QUIZ QUESTION
	 * Do not use during class!!!!
	 */
	public static double computeAverage(ArrayList<Double> numbers)
	{
		
		double sum = 0;

		for ( Double num : numbers)
		{
			sum += num;
		}

		double average = sum/numbers.size();
		return average;
	}

	public static void getInput(ArrayList<Double> numbers)
	{

		Scanner keyboard = new Scanner(System.in);

		boolean keepLooping = true;
		while ( keepLooping)
		{
			System.out.print("Enter a number or -1 to quit: ");
			double input = keyboard.nextDouble();
			if (input == -1)
			{
				keepLooping = false;
			}
			else
			{
				numbers.add(input);
			}
		}

	}
	
	public static ArrayList<Double> multiplyByFactor(ArrayList<Double> numbers, double multiplier)
	{
		ArrayList<Double> newNumbers = new ArrayList<Double>();
		for ( Double num : numbers)
		{
			newNumbers.add(num*multiplier);
		}
		
		return newNumbers;
	}

	public static int[] getMiddleNumbers(int[] numbers)
	{
		int [] newList = Arrays.copyOf(numbers, numbers.length);
		Arrays.sort(newList);
		System.out.println("Sorted List: " + Arrays.toString(newList));
		
		if ( numbers.length <=2)
		{
			return newList;
		}
		else if (numbers.length %2 == 0)
		{
			// Even number. Return middle 2
			int lowerIndex = numbers.length/2-1;
			int[] midList = new int[2];
			midList[0] = newList[lowerIndex];
			midList[1] = newList[lowerIndex+1];
			return midList;
		}
		else
		{
			// Odd number of elements. Just return 1 item in the middle position
			int lowerIndex = numbers.length/2;
			int[] midList = { newList[lowerIndex]};
			return midList;
		}

	}
	
	public static boolean isSorted(int[] numbers)
	{
		boolean sorted = true;
		for (int i=1; i<numbers.length; i++)
		{
			int current = numbers[i];
			int prior = numbers[i-1];
			if (current < prior)
				sorted = false;
		}
		
		return sorted;
	}
	
	public static void main(String[] args) 
	{
		// Create an ArrayList of numeric grades
		// Double is a wrapper class 
		// Book book1 = new Book();
		int [] numbers = {4, 5, 10, 3, -39, -39, 4, 100};
		int[] middle = getMiddleNumbers(numbers);
		System.out.println(Arrays.toString(middle));
		System.out.println("Is " + Arrays.toString(numbers) + " sorted? " 
					+ isSorted(numbers));
		System.out.println("Is " + Arrays.toString(middle) + " sorted? " 
				+ isSorted(middle));
		
		int [] numbers2 = {100};
		int[] middle2= getMiddleNumbers(numbers2);
		System.out.println(Arrays.toString(middle2));
		System.out.println("Is " + Arrays.toString(numbers2) + " sorted? " 
				+ isSorted(numbers2));
		System.out.println("Is " + Arrays.toString(middle2) + " sorted? " 
			+ isSorted(middle2));
		
		int [] numbers3 = {1,1,1,1,1,1};
		int[] middle3= getMiddleNumbers(numbers3);
		System.out.println(Arrays.toString(middle3));
		
		int [] numbers4 = {1,2,3,4,5};
		int[] middle4= getMiddleNumbers(numbers4);
		System.out.println(Arrays.toString(middle4));
/*
		ArrayList<Double> gradeList = new ArrayList<Double>();
		
		getInput( gradeList );
		
		System.out.println("Original List \n" + gradeList);
		
		ArrayList<Double> newList = multiplyByFactor(gradeList, BIG_SCALE);
		System.out.println("Three time List \n" + newList);

		System.out.println("The third element is " + newList.get(2));
		System.out.println("The number of elements in the list is " + 
				newList.size() );
		
		
		ArrayList<Double> smallList = multiplyByFactor(gradeList, SMALL_SCALE);
		System.out.println("Small Factor List \n" + smallList);
*/

/*
		// Add some grades
		gradeList.add(45.0);
		gradeList.add(90.5);
		gradeList.add(98.35);
		gradeList.add(100.0);
*/
		
		

	}

}
