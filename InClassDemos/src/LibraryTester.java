import java.util.ArrayList;

/**  Class: LibraryTester
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
public class LibraryTester
{

	/**
	 * @param args
	 */
	
	public static void removeFromList(ArrayList<Book> bookList)
	{
		// To remove from ArrayList, delete from the end position and go down
		for (int i = bookList.size()-1; i>= 0; i--)
		{
			bookList.remove(i);
		}
		
	}
	
	public static void main(String[] args)
	{
		
		String name = "Hi there";
		System.out.println(name.toLowerCase());
		System.out.println(name.charAt(3));
		
	    Library myBooks = new Library();
		
		Book book1 = new Book("Big Java", "Horstmann");
		book1.setPrice(58.04);
		book1.setGenre("Computing");
		book1.setMaterial("Paperback");
		
		Book book2 = new Book("Database Forever", "Fake Name");
		book2.setPrice(87.04);
		book2.setGenre("Computing");
		book2.setMaterial("Hardback");

		Book book3 = new Book("Limited Edition", "Famous Author");
		book3.setPrice(1000.04);
		book3.setGenre("Art");
		book3.setMaterial("Hardback");

		myBooks.addBook(book1);
		myBooks.addBook(book2);
		myBooks.addBook(book3);
		
	
		System.out.println("ORIGINAL: \n" + myBooks);

		removeFromList(myBooks.getBookList());
		
		System.out.println("After removeFromList, size is " + myBooks.getBookList().size() );
		System.out.println(" \n" + myBooks);

		
		System.out.println("Total price of the books: " + 
							myBooks.computeTotalPrice());
		
		System.out.println("Most expensive book is " + 
							myBooks.findMostExpensiveBook());
		
		System.out.println("Most expensive book is " + 
				myBooks.findMostExpensiveBook());
		
		System.out.println("Art Library consists of " + 
				myBooks.generateSubsetByGenre("Art"));
		
		
	}

}
