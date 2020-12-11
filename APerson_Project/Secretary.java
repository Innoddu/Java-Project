package apersonstudentdriver;
//
//CS55 #1812 Inho Choi 
//APerson Program Project
//20 Nov 2020
//
//

//Parent -> Employee
public class Secretary extends Employee{
	
	//Member variable
   private int Seid=0;
 
	//default constructor
	public Secretary()
	{
		super();
	}
	
	//constructor parent
    public Secretary(String fN, String lN, String s, int a, String e, String g,int ta) 
    {
    	
    //call parent
    super(fN,lN,s,a,e,g);
    this.Seid=ta;
    
	}
    
    //setter fun
    public void setSeid(int ta)
    {
    	this.Seid=ta;
    }
    //getter fun
    public int getSeid()
    {
    	return this.Seid;
    }
    
  //Override
    public String toString()
    {
    	return super.toString()+"\n"+ "SecretaryID: " +Seid;
    }
    

}
