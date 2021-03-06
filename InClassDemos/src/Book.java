/**Class: Book
 * @author Nannette Napier
 * @version 1.0
 * Course : ITEC 2120 Fall 2013
 * Written: September 1, 2013
 *
 *
 * This class represents books for sell.
 *
 * Purpose: Compute information about books
 */
public class Book
{
	// Instance Variables
	private String title;       // Title of book
	private String author;      // Author of the vook
	private double price;       // Price of book
	private String genre;       // Type of book
	private String material;    // Hardback, paperback,

	// Constructors
	/**
	 * Method: No-argument constructor for Book class 
	 */
	public Book()
	{
		title = "Gone with the Wind";
		author = "Margaret Mitchell";
		price = 4.50;
		genre = "Fiction";
		material = "Hardback";
	}
	
	/**
	 * Method: Book constructor
	 * @param inTitle Title for book
	 * @param inAuthor Author of book
	 */
	public Book(String inTitle, String inAuthor)
	{
		title = inTitle;
		author = inAuthor;
		price = 10;
		genre = "Mystery";
		material = "Paperback";
	}

	/**
	 * @return the title
	 */
	public String getTitle()
	{
		return title;
	}

	/**
	 * @return the author
	 */
	public String getAuthor()
	{
		return author;
	}

	/**
	 * @return the price
	 */
	public double getPrice()
	{
		return price;
	}

	/**
	 * @return the genre
	 */
	public String getGenre()
	{
		return genre;
	}

	/**
	 * @return the material
	 */
	public String getMaterial()
	{
		return material;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title)
	{
		this.title = title;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author)
	{
		this.author = author;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price)
	{
		this.price = price;
	}

	/**
	 * @param genre the genre to set
	 */
	public void setGenre(String genre)
	{
		this.genre = genre;
	}

	/**
	 * @param material the material to set
	 */
	public void setMaterial(String material)
	{
		this.material = material;
	}
	/**
	 * Method: toString
	 * @return Description of the object as a String
	 */
	@Override
	public String toString()
	{
		String value = "Title: " + title;
		value += " Author: " + author;
		value += " Price: " + price;
		value += " Genre: " + genre;
		value += " Material: " + material + "\n";
		return value;
	}

}