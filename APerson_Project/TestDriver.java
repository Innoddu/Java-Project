package apersonstudentdriver;
//
// CS55 #1812 Inho Choi 
// APerson Program Project
// 20 Nov 2020
// 
//



import java.util.Arrays;
import java.util.Scanner;

public class TestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   APerson[] ap= new APerson[10];

	       Scanner sc=new Scanner(System.in);
	       int num = 0;
	       int input=0;
	       int save=0;
	       System.out.println("1: Create Employee \n2: Create Faculty \n3: Create Secretray \n4: Print APerson \n0: Exit");
	       input = sc.nextInt();
	       sc.nextLine();
	       
	       //Initialize
	       String fN="";
	       String lN="";
	       String s="";
	       int a=0;
	       String e="";
	       String g="";
	       int sa=0;
 		   int ta=0;
		
	 //Start create person
	while(input !=-1) {

	       if(input==1) {
	    	   System.out.print("How many create Employee?  \n");
	    	   num = sc.nextInt();
	    	      sc.nextLine();
	    	    //Employee create  
	    	  for(int i =0; i<num; i++) {

	    		System.out.print("First name (String) : ");
	       		fN = sc.next();
	       		System.out.print("Last name (String): ");
	       		lN = sc.next();
	       		System.out.print("SSN (String)  : ");
	       		s = sc.next();
	       		System.out.print("Age (Integer) : ");
	       		a = sc.nextInt();
	       		sc.nextLine();
	       		System.out.print("email (String) : ");
	       		e = sc.next();
	       		System.out.print("Gender(m/fm) (String)  : ");
	       		g = sc.next();
	       	   	 
	    		System.out.print("Successfully Create \n");
	    		// Employee objects save in to "ap" object array
	    		ap[save] = new Employee (fN,lN,s,a,e,g);
	    	    save++;
	    	  }
	    	
	       }
	     //Faculty create  
	    	  else if(input==2) {
	    	   System.out.print("How many create Faculty?  \n");
	    	   num = sc.nextInt();
	    	      sc.nextLine();
	    	  for(int i =0; i<num; i++) {

	    		
	    		System.out.print("First name (String) : ");
	       		fN = sc.next();
	       		System.out.print("Last name (String) : ");
	       		lN = sc.next();
	       		System.out.print("SSN (String) : ");
	       		s = sc.next();
	       		System.out.print("Age (Integer) : ");
	       		a = sc.nextInt();
	       		sc.nextLine();
	       		System.out.print("Email (String) : ");
	       		e = sc.next();
	       		System.out.print("Gender(m/fm) (String)  : ");
	       		g = sc.next();
	       		sc.nextLine();
	       		System.out.print("Salary (Integer)  : ");
	       		sa = sc.nextInt();
	       		sc.nextLine();
	       
	       		System.out.print("Successfully Create \n");
	       	// Faculty objects save in to "ap" object array
	       		ap[save] = new Faculty (fN,lN,s,a,e,g,sa);
	       		save++;
	       		break;
			
	    	  }
	    	  }
	       
	    	  else if(input==3) {
	    	   System.out.print("How many create Secretary?  \n");
	    	   num = sc.nextInt();
	    	    sc.nextLine();
	    	  for(int i =0; i<num; i++) {

	    		  // Secretary Create
	      		System.out.print("First name (String) : ");
	       		fN = sc.next();
	       		System.out.print("Last name (String) : ");
	       		lN = sc.next();
	       		System.out.print("SSN  (String): ");
	       		s = sc.next();
	       		System.out.print("Age (Integer) : ");
	       		a = sc.nextInt();
	       		sc.nextLine();
	       		System.out.print("E-mail (String) : ");
	       		e = sc.next();
	       		System.out.print("Gender(m/fm) (String) : ");
	       		g = sc.next();
	       		sc.nextLine();
	       		System.out.print("SecretaryID (Integer) : ");
	       		ta = sc.nextInt();
	       		sc.nextLine();
	       	
	       	
	       		System.out.print("Successfully Create \n");
	       	// Secretary objects save in to "ap" object array
   		  		ap[save] = new Secretary (fN,lN,s,a,e,g,ta);
   		  		save++;
   		  		break;
	    	  }
	    }
	    	  else if(input==4) {
	    	  for(int i=0; i<save;i++) {
	    		// Output created Employee, Faculty, and Secretary 
	    		System.out.println(ap[i]+"\n***********");
	    	  }
	    	  }
	    	  else if(input ==0)
	    	  {
	    		  //exit
	    		  System.out.print("Good Bye :) \n");
	    		 System.exit(0);
	    		 
	    	  }
	   
	    	  else
	    	  {
	    		  System.out.println("Check user number \n");
	    	  }
	       System.out.println("1: Create Employee \n2: Create Faculty \n3: Create Secretray \n4: Print APerson \n0: Exit");
	       input = sc.nextInt();
	      sc.nextLine();
	      if(input ==0)
    	  {
	    	  //exit
    		  System.out.print("Good Bye :) \n");
    		 System.exit(0);
    		 
    	  }
	   
		}
	}
}
