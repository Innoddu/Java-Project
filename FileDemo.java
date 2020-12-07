/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package filedemo;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author dehkhoda_abbas
 */
public class FileDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception
    {
        File infile = new File("data.txt");
        File outfile = new File("out.txt");
        
        Scanner input = new Scanner(infile);
        
        
        PrintWriter pr = new PrintWriter(outfile);
        pr.println("********************\n");
        
        
        while(input.hasNext())
        {
            String line = input.nextLine();
            System.out.println(line);
            pr.println(line);
        }
        input.close();pr.close();
        
        
        
        
        
    }
    
}
