import java.util.Scanner;
import java.util.ArrayList;

/**  Class: GradeTester
 * @author Nannette Napier
 * @version 1.0
 * Course: ITEC 2150 Fall 2013
 * Written: Sep 1, 2013
 *
 * This class --- description
 * 
 * Purpose: --- 
 */

/**
 * @author nnapier
 *
 */
public class GradeTester
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		ArrayList<Double> gradeList = new ArrayList<Double>();
		
		// Entering grades for a student
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter next grade (-1 when done):");
		double inputGrade = keyboard.nextDouble();
		
		while(inputGrade > 0)
		{
			gradeList.add(inputGrade);
			inputGrade = keyboard.nextDouble();
		}
		
		System.out.println(gradeList);
		
		// Remove the grade with the smallest value
		GradeUtility util = new GradeUtility(gradeList);
		util.removeLowestGrade();
		System.out.println(util);

		// Computing the average
		System.out.println("Average grade is: " + util.computeAverage());
		
		// Remove second lowest grade
		util.removeLowestGrade();
		System.out.println(util);
		// Computing the average
		System.out.println("Average grade is: " + util.computeAverage());
				
		
	}

}
