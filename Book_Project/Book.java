/*
 * 
 * CS55 #1812 Inho Choi 1801787
 * Inheritence Program Project
 * 3 Dec 2020
 * 
 * 
 */



// Book class parent is Item
public class Book extends Item {

	// Member variable
	private int pageCount;
	private String copyrightDate;
	
	// Default constructor
	public Book() 
	{
		super();
	}
	// Constructor initialize
	public Book(String t,String d,double p, int pc,String cd)
	{
		super(t,d,p);
		this.pageCount=pc;
		this.copyrightDate=cd;
	}
	
	// Setter
	public void setPageCount(int pc)
	{
		this.pageCount=pc;
	}
	// Getter
	public int getPageCount()
	{
		return pageCount;
	}
	// setter
	public void setCopyrightDate(String cd)
	{
		this.copyrightDate=cd;
	}
	// getter
	public String getCopyrightDate()
	{
		return copyrightDate;
	}
	// output for toString
	public String toString()
	{
		return super.toString()+" PageCount: "+pageCount+" CopyrightDate: "+copyrightDate;
	}
}
