import java.util.ArrayList;


public class Chapter9Quiz
{

	public static int mystery1 (String input)
	{
		int value = 0;
		
		for (int i=0; i < input.length(); i++)
		{
			if ( input.charAt(0) == input.charAt(i))
			   value++;
		}
		
		return value;
	}
	
	
	public static String mystery2 (String input)
	{
		String result = "";		
		for (int i=input.length()-1; i >= 0; i--)
		{
			if ( Character.isLetter( input.charAt(i) ) )
			   result += input.charAt(i );
		}
		
		return result;
	}
	
	public static boolean beginsWithNumber(String str)
	{
		boolean result = false;
		
		if (str.length() > 0 && Character.isDigit(str.charAt(0)))
			result = true;
		
		return result;
	}
	
	public static int countTo(String str)
	{
		int result = 0;
		
		for (int i=0; i<str.length()-1; i++)
		{
			if (str.substring(i,i+2).equalsIgnoreCase("to"))
				result++;
		}
		return result;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		
		System.out.println( mystery1("GGC 2014"));
		System.out.println( mystery1("Gwinnett"));
		System.out.println( "------ Now mystery2 -----");
		System.out.println( "GGC 2014: " + mystery2("GGC 2014"));
		System.out.println( "Gwinnett: " + mystery2("Gwinnett"));
		System.out.println( "------ Now beginsWithNumber -----");
		System.out.println( "2014: " + beginsWithNumber("2014"));
		System.out.println( "Gwinnett: " + beginsWithNumber("Gwinnett"));
		System.out.println( ": " + beginsWithNumber(""));
		System.out.println( "------ Now countTo -----");
		System.out.println( "to 2014: " + countTo("to 2014"));
		System.out.println( "Gwinnett: " + countTo("Gwinnett"));
		System.out.println( "TO: " + countTo("TO"));
		System.out.println( "TOto t to: " + countTo("TOto t to"));
		ArrayList<String> shows = new ArrayList<String>();
		shows.add("SNL");
		shows.add("Big Bang Theory");
		shows.add("Mad Men");
		shows.add("Breaking Bad");
		
		Chapter8Demo.main(null);
		
		

	}

}
