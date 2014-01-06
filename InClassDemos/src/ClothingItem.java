/** Class: ClothingItem
 *  @author Nannette Napier
 *  @version 1.0
 * Course: ITEC 2150 Fall 2013
 * Written: Aug 23, 2013
 *
 * This class represents an item of clothing in a retail store
 *
 * Purpose: The purpose is to provide methods for a ClothingItem object
 * 
 */

/**
 * @author nnapier
 * 
 */
public class ClothingItem
{
	// Instance Variables
	private int itemId; // Unique identifier for this clothing item
	private String size; // Size of this item (small, medium, large, etc.)
	private String color; // Color of the item (red, yellow, black, etc.)
	private String brand; // Brand name of the clothing (Gucci, Nike, etc.)
	private double suggestedRetailPrice; // Suggested retail price
	private String clothingType; // Type (pants, shirts, hats, etc.)
	private double actualRetailPrice; // Actual retail price
	private String gender; // Gender intended for this item (male, female,
							// unisex)
	private double cost; // Manufacturer's cost

	// Constructor
	/**
	 * Method: ClothingItem constructor No-argument constructor for the
	 * ClothingItem class. Initializes each instance variable to default values.
	 */
	public ClothingItem()
	{
		itemId = -1;
		size = "small";
		color = "unknown";
		brand = "generic";
		suggestedRetailPrice = 999.0;
		clothingType = "unknown";
		actualRetailPrice = 111.0;
		gender = "unisex";
		cost = 10.0;
	}

	/**
	 * Method: ClothingItem constructor Provides a way of creating ClothingItem
	 * objects by providing the ItemId. All other values are initialized to
	 * default values.
	 * 
	 * @param inItemId
	 *            Incoming item ID for the new object
	 */
	public ClothingItem(int inItemId)
	{
		itemId = inItemId;
		size = "small";
		color = "unknown";
		brand = "generic";
		suggestedRetailPrice = 999.0;
		clothingType = "unknown";
		actualRetailPrice = 111.0;
		gender = "unisex";
		cost = 10.0;
	}

	public ClothingItem(int inItemId, String inSize, String inColor,
			String inBrand, double inSuggestedRetailPrice,
			String inClothingType, double inActualRetailPrice, String inGender,
			double inCost)
	{
		itemId = inItemId;
		size = inSize;
		color = inColor;
		brand = inBrand;
		suggestedRetailPrice = inSuggestedRetailPrice;
		clothingType = inClothingType;
		actualRetailPrice = inActualRetailPrice;
		gender = inGender;
		cost = inCost;
	}

	/**
	 * @return the itemId
	 */
	public int getItemId()
	{
		return itemId;
	}

	/**
	 * @return the size
	 */
	public String getSize()
	{
		return size;
	}

	/**
	 * @return the color
	 */
	public String getColor()
	{
		return color;
	}

	/**
	 * @return the brand
	 */
	public String getBrand()
	{
		return brand;
	}

	/**
	 * @return the suggestedRetailPrice
	 */
	public double getSuggestedRetailPrice()
	{
		return suggestedRetailPrice;
	}

	/**
	 * @return the clothingType
	 */
	public String getClothingType()
	{
		return clothingType;
	}

	/**
	 * @return the actualRetailPrice
	 */
	public double getActualRetailPrice()
	{
		return actualRetailPrice;
	}

	/**
	 * @return the gender
	 */
	public String getGender()
	{
		return gender;
	}

	/**
	 * @return the cost
	 */
	public double getCost()
	{
		return cost;
	}

	/**
	 * @param itemId
	 *            the itemId to set
	 */
	public void setItemId(int itemId)
	{
		this.itemId = itemId;
	}

	/**
	 * @param size
	 *            the size to set
	 */
	public void setSize(String size)
	{
		this.size = size;
	}

	/**
	 * @param color
	 *            the color to set
	 */
	public void setColor(String color)
	{
		this.color = color;
	}

	/**
	 * @param brand
	 *            the brand to set
	 */
	public void setBrand(String brand)
	{
		this.brand = brand;
	}

	/**
	 * @param suggestedRetailPrice
	 *            the suggestedRetailPrice to set
	 */
	public void setSuggestedRetailPrice(double suggestedRetailPrice)
	{
		this.suggestedRetailPrice = suggestedRetailPrice;
	}

	/**
	 * @param clothingType
	 *            the clothingType to set
	 */
	public void setClothingType(String clothingType)
	{
		this.clothingType = clothingType;
	}

	/**
	 * @param actualRetailPrice
	 *            the actualRetailPrice to set
	 */
	public void setActualRetailPrice(double actualRetailPrice)
	{
		this.actualRetailPrice = actualRetailPrice;
	}

	/**
	 * @param gender
	 *            the gender to set
	 */
	public void setGender(String gender)
	{
		this.gender = gender;
	}

	/**
	 * @param cost
	 *            the cost to set
	 */
	public void setCost(double cost)
	{
		this.cost = cost;
	}

	/**
	 * Method: computeExpectedProfit
	 * Returns the difference between the suggested retail price and
	 * the actual cost of the item
	 * @return suggested retail price - cost
	 */
	public double computeExpectedProfit()
	{
		return suggestedRetailPrice - cost; 
	}
	
	public double computeSalePrice(double percentDiscount)
	{
		return (suggestedRetailPrice*(1-percentDiscount));
	}

	@Override
	public String toString()
	{
		String value = "Item id = " + itemId;
		value += ", Size = " + size;
		value += ", Color = " + color;
		return value;
	}
}
