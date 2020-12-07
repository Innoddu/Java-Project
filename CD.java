/*
 * 
 * CS55 #1812 Inho Choi 1801787
 * Inheritence Program Project
 * 3 Dec 2020
 * 
 * 
 */

public class CD extends Item{

	// Member variable
	private int trackLenght;
	
	// default constructor
	public CD()
	{
		super();
	}
	// constructor initialize
	public CD(String t, String d, double p,int tl)
	{
		super(t,d,p);
		this.trackLenght=tl;
	}
	// setter
	public void setTrackLength(int tl)
	{
		this.trackLenght=tl;
	}
	// getter
	public int getTrackLength()
	{
		return trackLenght;
	}
	// output CD informatuon
	public String toString()
	{
		return super.toString()+" Track Length: "+trackLenght;
	}
}
