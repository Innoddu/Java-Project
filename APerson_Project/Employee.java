package apersonstudentdriver;
//
//CS55 #1812 Inho Choi 
//APerson Program Project
//20 Nov 2020
//
//

//Parent -> APerson
public class Employee extends APerson {


//Member variable
private String Gender ="";

  //default constructor
	public Employee()
	{   
	 super();
	}
	//Constructor parents
    public Employee(String fN, String lN, String s, int a, String e, String g)
    {
    
    	//call parent 
    	super(fN,lN,s,a,e);
    	this.Gender=g;

 
    }
    //setter func
    public void setGender(String g)
    {
    	this.Gender=g;
    }
    //getter func
    public String getGender()
    {
    	return this.Gender;
    }

    
    
    
  //Override
    public String toString() {

    		return super.toString()+"\n"+ "Gender: "+this.Gender;
   
    }
	
}
