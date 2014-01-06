import java.util.ArrayList;

/**  Class: GradeUtility
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
public class GradeUtility
{
	// Instance variable
	private ArrayList<Double>  	gradeList;

	// Constructor
	public GradeUtility()
	{
		gradeList = new ArrayList<Double>();
	}

	public GradeUtility (ArrayList<Double> inGradeList)
	{
		gradeList = inGradeList;
	}

	public void removeLowestGrade()
	{
		if (gradeList.size() > 0)
		{
			int lowestPos = 0;
			for (int i=1; i<gradeList.size(); i++)
			{
				Double grade = gradeList.get(i);
				if ( grade < gradeList.get(lowestPos))
				{
					lowestPos = i;
				}
			}
			System.out.println("Removing element at position " + lowestPos);
			gradeList.remove(lowestPos);

		}
	}
	
	public double computeSum()
	{
		double sum = 0;
		for (Double aGrade : gradeList)
		{
			sum += aGrade;
		}
		return sum;
	}

	public double computeAverage()
	{
		double average = 0;
		if (gradeList.size() > 0)
			 average = computeSum()/gradeList.size();
		
		return average;
	}
	
	@Override
	public String toString()
	{
		return gradeList.toString();
	}
}
