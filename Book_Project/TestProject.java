  
/*
 * 
 * CS55 #1812 Inho Choi 
 * Inheritence Program Project
 * 3 Dec 2020
 * 
 * 
 */
import java.util.Arrays;

public class TestProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Making Book object
		Book b1 = new Book("Fun Java"," For bignner",180.0,2015,"12-3-2020");
		Book b2 = new Book("C++ book"," intermidiate",220.0,2400,"03-26-2012");
		Book b3 = new Book("AI technology"," Our Future",80.0,700,"4-16-2018");
		Book b4 = new Book("Comic Book"," real story",50.0,315,"8-22-2015");
		Book b5 = new Book("Python"," For bignner",110.0,1150,"12-25-2011");
		
		// Making Movie object
		Movie x1 = new Movie("Iron Man"," tony",5.0,2);
		Movie x2 = new Movie("Interstella"," Science",8.0,3);
		
		// Making CD object
		CD cd1 = new CD("Beatles"," Best song",22.0,110);
		CD cd2 = new CD("Linkin Park"," Rock and Roll",17.0,60);
		
		// Making object array Item
		Item[] ar = new Item[9];
		
		// Insert object into Item array
		ar[0] = b1;
		ar[1] = b2;
		ar[2] = b3;
		ar[3] = b4;
		ar[4] = b5;
		ar[5] = x1;
		ar[6] = x2;
		ar[7] = cd1;
		ar[8] = cd2;
		
		// Print information ar array
		for(Item altem:ar)
		{
		System.out.println(altem);
		}
		
		// called Bookeshelf object
		Bookshelf bs = new Bookshelf();
		
		// Making temporary object
		Book bb= new Book();
		for(int i=0; i<ar.length; i++)
		{
		
		
		
			if(i<5)
			{
				// Called Bookshelf adds method
				if(bs.isFull()==false)
				{
				bs.adds(b1);
				bs.adds(b2);
				bs.adds(b3);
				bs.adds(b4);
				bs.adds(b5);
				}
				
				// ar change (book) cast
				bb = (Book)ar[i];
				System.out.println("Print Page: "+bb.getPageCount());	
				
				
			}
			
			else if(i>=5 &&  i<=6)
			{
		// Making temporary object
		Movie xx = new Movie();
		// ar change (Movie) cast
		xx=(Movie) ar[i];
		System.out.println("Print Length: "+xx.getLength());
			
			}
			else if(i>=7)
			{
			// Making temporary object
			CD cc = new CD();
			// ar change (CD) cast
			cc=(CD) ar[i];
			System.out.println("Print TrackCount: "+cc.getTrackLength());
			}
		
		}

	
		
		
		//Print Bookshelf Content
		System.out.print(bs);
		 System.out.println("****************************\n");
		//Create a New Book
    	  Book aNew = new Book("Fun Java"," For bignner",180.0,2015,"12-3-2020");
    	  
    	  //Last print content of array ar
    		StringBuilder str = new StringBuilder();
    		for (Item i : ar)
            str.append("").append(i).append('\n');
            System.out.println(str.toString());
    	
		
		
		
		
	}

}
