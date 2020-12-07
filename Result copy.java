/*
 * Inho Choi
 * CS55 #1812
 * FileProcessing-Array project
 * This project reads the file and computes duplicate characters
 * and checks how many divided by comma, period, and whitespace.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.Arrays;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;


public class Result {
	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
	BufferedReader br = null; 
	String txt = "";
	int count[] = new int[26];
    int cut=0;
	char ch='a';
	 
		try {
	        //accept result.txt to read the characters as arguments.
			 br = new BufferedReader(new FileReader("test.txt"));
			 
			
			 File infile = new File("test.txt");
			 File outfile = new File("result.txt");
			 Scanner input = new Scanner(infile);
			 PrintWriter pr = new PrintWriter(outfile);
			 
			//implement if result.txt has strings.
			  while((txt = br.readLine())!=null) {
				  char alpha[] = new char[26];	
				 // To make divide by comma,period,and whitespace.
				 String div[] = txt.split("[\\s,.]+");
				 // TO make change by line breaks
				 String n[] = txt.split("\\n");
				 //result.txt strings change lowercase
				 txt=txt.toLowerCase();
				 //result.txt strings make array
				 char save[]= txt.toCharArray();
					 
				// Divide , . space   
				    for(int i=0; i<div.length; i++) {
				    	cut++; 
				    }
				
				    // if Outputs and brakes when line breaks occur
				    	if(n.length==1) {
					       while(input.hasNext()) {
							   String line = input.nextLine();
							   System.out.println(line);
							   pr.println(line);
							   break;	
							   }
					    }
				    //output words
				    pr.println(cut+ " words"); 
				    // Initialization
				    cut=0;   
				    
				    
				    //Create lowercase array
					 for(int i=0; i<alpha.length; i++) {
					    	alpha[i] = (char)(i+97);
						    }
					 // Compare to created lowercase array to save array (strings in result.txt )
				    for(int j=0; j<alpha.length; j++) {
				    	 for(int i = 0; i<save.length; i++){
				    		 // if I find the same value, increasing count
				    		 if(alpha[j] == save[i]) {
					    		count[j]++;
					    		}
				    	   }
				    }
				    
				    
				    // output reuslts 		  
				   	for(int i = 0; i<26; i++){
						 if(count[i] >0)
				   	 pr.println((char)('a'+i)+"-"+count[i]);	
								        
						}
					// Initialization count array to 0
					Arrays.fill(count, 0);	 
				   	}
				   	   
				   	//close files and readers
				    input.close();
				    pr.close();
				    br.close();
				    
		}catch (IOException e) {
			e.printStackTrace();
		}
	
	  
      
	}
}

	
