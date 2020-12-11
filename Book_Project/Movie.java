/*
 * 
 * CS55 #1812 Inho Choi 1801787
 * Inheritence Program Project
 * 3 Dec 2020
 * 
 * 
 */

public class Movie extends Item{

	// Member variable
	private int length;
	
	// default constructor
	public Movie()
	{
		super();
	}
	
	// Constructor initialize
	public Movie(String t, String d, double p, int l)
	{
		super(t,d,p);
		this.length=l;
	}
	
	// setter
	public void setLength(int l)
	{
		this.length=l;
	}
	// getter
	public int getLength()
	{
		return length;
	}
	// output Moive information
	public String toString()
	{
		return super.toString()+" Length: "+length;
	}

}
