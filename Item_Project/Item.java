/*
 * 
 * CS55 #1812 Inho Choi 
 * Inheritence Program Project
 * 3 Dec 2020
 * 
 * 
 */

public class Item {
	// Private declaration
	private String title;
	private String description;
	private double price;
	
	// Constructor
	public Item()
	{
		
	}
	// Initialize constructor (parent)
	public Item(String t,String d, double p)
	{
		title=t;
		description=d;
		price=p;
	}
	// Setter
	public void setTtitle(String t)
	{
		this.title=t;
	}
	// Getter
	public String getTitle()
	{
		return title;
	}
	// Setter
	public void setDescription(String d)
	{
		this.description=d;
	}
	// Getter
	public String getDescription()
	{
		return description;
	}
	// Setter
	public void setPrice(double p)
	{
		this.price=p;
	}
	// Getter
	public double getPrice()
	{
		return price;
	}
	
	//Override
	public String toString()
	{
		 return "Name: " + title+" Description: " +description+" Price: "+price;
	              
	}
	

}
