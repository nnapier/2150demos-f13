/**
 * 
 */

/**
 * @author nnapier
 *
 */
public class StringExample1
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		String value = "Some value";
		for (int i = 0; i < value.length(); i++)
		{
		   System.out.print("Character at position: " + i);
		   System.out.println(" is " + value.charAt(i));
		}

	}

}
