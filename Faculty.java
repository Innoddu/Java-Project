package apersonstudentdriver;

//
//CS55 #1812 Inho Choi 1801787
//APerson Program Project
//20 Nov 2020
//
//

//Parent -> Employee
public class Faculty extends Employee{

    //Member variable
	private int salary=0;

	//default constructor
	public Faculty()
	{
	 super();
	}
   //constructor parents
    public Faculty(String fN, String lN, String s, int a, String e,String g,int sa) 
    {
        //call parent
    	super(fN,lN,s,a,e,g);
    	this.salary=sa;
    	
 	
    }
    //setter fun
    public void setsalary(int sa)
    {
    	this.salary=sa;
    }
    //getter fun
    public int getsalary()
    {
    	return this.salary;
    }

 //Override
    public String toString() {

		return super.toString()+"\n"+"salary: "+salary;

}


}
