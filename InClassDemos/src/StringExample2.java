/**
 * 
 */

/**
 * @author nnapier
 *
 */
public class StringExample2
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		String value = "Some value";
		for (int i = 0; i < value.length()-1; i++)
		{
			String pair = value.substring(i, i+2);
		   System.out.println("Pair is: " + pair);
		}

	}

}
