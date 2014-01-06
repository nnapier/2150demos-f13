import java.util.ArrayList;

/**  Class: Library
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
public class Library
{
	// Instance Variables
	private ArrayList<Book> bookList;
	
	// Constructors
	public Library()
	{
		bookList = new ArrayList<Book>();
	}
	
	public ArrayList<Book> getBookList()
	{
		return bookList;
	}
	// Instance Methods
	public void addBook(Book book)
	{
		bookList.add(book);
	}
	
	public void removeBook(int i)
	{
		bookList.remove(i);
	}
	public int countBooks()
	{
		return bookList.size();
	}
	
	public int countByGenre(String genre)
	{
		int count=0;
		
		for (int i=0; i<bookList.size(); i++)
		{
			Book book = bookList.get(i);
			if (book.getGenre().equals( genre))
				count++;
		}
		
		return count;

	}

	public double computeTotalPrice()
	{
		double total = 0;
		
		for (Book book : bookList)
		{
			total = total + book.getPrice();
		}
		
		return total;

	}

	public Book findMostExpensiveBook()
	{
		Book maxBook = null;
		double maxPrice = 0;
		
		for (Book book : bookList)
		{
			if ( book.getPrice() > maxPrice)
			{
				maxPrice = book.getPrice();
				maxBook = book;
			}
		}
		return maxBook;
	}
	
	public Library generateSubsetByGenre(String genre)
	{
		Library subset = new Library();
		
		for (Book book : bookList)
		{
			if (book.getGenre().equals(genre))
			{
				subset.addBook(book);
			}
		}
		
		return subset;
	}
	
	@Override
	public String toString()
	{
		String value = "Total number of books: " + countBooks() + "\n";
		value += bookList.toString();
		return value;
	}

}
