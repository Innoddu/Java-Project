/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apersonstudentdriver;
//
//CS55 #1812 Inho Choi 1801787
//APerson Program Project
//20 Nov 2020
//
//
public class APerson implements Driver
{
   
	private String fName;
    private String lName;
    private String sSN;
    private int age;
    private String eMail;
    private APerson hw;
	
	
    


    public APerson()
    {
   
    }
    //
    
    public String howToDrive()
    {
        if (isMarried())
            return "Drives Carefully...";
        else
            return "Drives Recklesly....";
        
    }
    
    
    
    
    public boolean isMarried()
    {
      return  (hw != null) ;
          
    }
    public void divorceFrom(APerson p1)
    {
        if( this == p1.hw)
        {
            this.hw = null;
            p1.hw = null;
            
        }else
        {
          //  MyIO.display("You are not married to eachother");
        }
        
        
    }
    
    
    
    public void marriedTO(APerson p1)
    {
        
        if((!p1.isMarried() && !this.isMarried()))
        {
            p1.hw = this;
            this.hw = p1;
        }else
        {
            System.out.println("You already Married");
        }
        
    }
    
    
    public APerson(String fN, String lN, String s, int a, String e)
    {
        fName = fN; lName = lN; sSN = s;setAge(a);eMail = e;
    }
    public APerson(String fN, String lN, String s)
    {
       this(fN,lN,s,0, "");
    }
            
    public void setAge(int a)
    {
        if (a > 0)
        {
            this.age = a;
        }
    }
    
    public int getAge()
    {
        return age;
    }
    public void setFName(String n)
    {
       fName=n;
    }
    public String getFName()
    {
        return fName;
    }
    public void setLName(String n)
    {
        lName = n;
    }
    public String getLName()
    {
        return lName;
    }
    public void setSSN(String n)
    {
    	sSN=n;
    }
    public String getSSN()
    {
        return sSN;
    }
    
    public String toString()
    {
        return "First Name:"+fName+"\n"
              +"Last  Name:"+lName + "\n"
              +"Email     :"+ eMail+ "\n"
              +"Marrital Status:"+(isMarried()? "Married" : "Available")+"\n"
              +"Spouse First Name:"+(isMarried()? hw.getFName() : "Not married yet");
    }




	public void seteMail(String e)
	{
		eMail=e;
	}
	
	public String geteMail()
	{
		return eMail;
	}





    
    
    
}
