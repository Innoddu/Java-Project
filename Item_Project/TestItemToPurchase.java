/*
 * 
 * CS55 #1812 Inho Choi 
 * ItemPurchase list output Program Project
 * 26 Nov 2020
 * 
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class TestItemToPurchase {

	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		int input;
		System.out.println("Welcome to JAVA MALL \n Press [1] Output ItemCost \n Press [2] Output Item Description \n Press [0] Quit\n");
		Scanner sc = new Scanner(System.in);
		input=sc.nextInt();

		String n="";
		String d="";
		double p=0;
		int q=0;
		String an="";
		
		    // Create an object that converts characters into streams with System.in
			InputStreamReader isr = new InputStreamReader(System.in);
			// Create an object for isr
			BufferedReader br = new BufferedReader(isr);
			try {
				// Create object to write on "report.txt"
				FileWriter fw = new FileWriter("report.txt");
				BufferedWriter bw= new BufferedWriter(fw);
				
		
			while(input != -1) {
					
				// Output ItemCost 
				
				if(input ==1) {
				System.out.println("Write Item Name: ");
				 n = br.readLine();
				System.out.println("Write Item Description: ");
				d = br.readLine();	
				System.out.println("Write Item Price: ");
				p = Double.parseDouble(br.readLine());				
				System.out.println("Write Item Quantity: ");
				q = Integer.parseInt(br.readLine());
				
				ItemToPurchase itp = new ItemToPurchase(n,d,p,q);
				
				System.out.println("Are you add item more? Enter Y/N: ");
				an = br.readLine();
		
				// Write on "report.txt"
				bw.write(n);
				bw.flush();
				bw.newLine();
				bw.write(d);
				bw.flush();
				bw.newLine();
				bw.write(String.valueOf(p));
				bw.flush();
				bw.newLine();
				bw.write(String.valueOf(q));
				bw.flush();
				bw.newLine();
				bw.write(itp.printItemCost());
				bw.flush();
				bw.newLine();
				System.out.println(itp.printItemCost());
				if(an.equals("N") || an.equals("n"))
				{
				System.out.println("Welcome to JAVA MALL \n Press [1] Output ItemCost \n Press [2] Output Item Description \n Press [0] Quit\n");	
				input=sc.nextInt();
				}
				

				}
				
				// Output ItemDescription
				else if(input ==2) 
				{
					System.out.println("Write Item Name: ");
					 n = br.readLine();
					System.out.println("Write Item Description: ");
					d = br.readLine();	
					System.out.println("Write Item Price: ");
					p = Double.parseDouble(br.readLine());				
					System.out.println("Write Item Quantity: ");
					q = Integer.parseInt(br.readLine());
					
					ItemToPurchase itp = new ItemToPurchase(n,d,p,q);
					
					System.out.println("Are you add item more? Enter Y/N: ");
					an = br.readLine();
			
					// Write on "report.txt"
					bw.write(n);
					bw.flush();
					bw.newLine();
					bw.write(d);
					bw.flush();
					bw.newLine();
					bw.write(String.valueOf(p));
					bw.flush();
					bw.newLine();
					bw.write(String.valueOf(q));
					bw.flush();
					bw.newLine();
					bw.write(itp.printItemDescription());
					bw.flush();
					bw.newLine();
					System.out.println(itp.printItemDescription());
					if(an.equals("N") || an.equals("n"))
					{
						System.out.println("Welcome to JAVA MALL \n Press [1] Output ItemCost \n Press [2] Output Item Description \n Press [0] Quit\n");	
						input=sc.nextInt();
					}
					}
				  else if(input ==0)
		    	  {
		    		  //exit
					 
		    		  System.out.print("Check your \"report.txt\" file\nGood Bye :) \n");
		    		 System.exit(0);
		    		 
		    	  }
				}
			
				// Close BufferWriter
				bw.close();
				
				
			} catch (FileNotFoundException e)
			{
				e.printStackTrace();
			}catch (IOException e) {
				e.printStackTrace();
			}

			
	
		
	}


}
