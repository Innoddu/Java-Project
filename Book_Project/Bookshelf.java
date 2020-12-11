/*
 * 
 * CS55 #1812 Inho Choi 
 * Inheritence Program Project
 * 3 Dec 2020
 * 
 * 
 */

public class Bookshelf{

	// Member variable
   private Book[] book= new Book[5];
   private int save=0;
   
   // Default Constructor
	public Bookshelf()
	{
	
	}
	// Constructor initialize
	public Bookshelf(Book[] b,int s)
	{
		this.book=b;
		this.save=s;
	}
	
	// Book add to Bookshelf
	public void adds(Book b)
	{
	
		if(save<5)
		{
			book[save]= b;
			save++;
		}
		else
		 System.out.println("Bookself is full.");
	
	}
	// Book remove from Bookshelf
	public void removes()
	{
		if(this.isFull()==true) 
		{
			for(int i=0; i<this.book.length; i++)
			 {
				this.book[save] =book[save+1];
			 }
			save = save - 1;
		}
	 
	
	
	}
	
	// Check Bookshelf full
	public boolean isFull()
	{
		if(save ==5)
		{
			return true;
		}
		else
		return false;
	}
	// Check Bookshelf empty
	public boolean isEmpty()
	{
	    if(save==0)
	    {
	    	return true;
	    }
	    else
	    return false;
	}
	// Output Bookshelf information
	public String toString()
	{  
		StringBuilder str = new StringBuilder();
		for (Book i : book)
        str.append("").append(i).append('\n');
	
		 return str.toString(); 
				
	}

	

}
