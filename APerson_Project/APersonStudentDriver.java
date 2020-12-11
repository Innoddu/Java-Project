/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apersonstudentdriver;
//
//CS55 #1812 Inho Choi 
//APerson Program Project
//20 Nov 2020
//
//
/**
 *
 * @author adehkhoda
 */
public class APersonStudentDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Student st = new Student("XLisa", "XSmith","111-11-1111", 21,"Lisa@heaven.com",5.0);
        System.out.println(st);
       //APerson ap = st;
       
      APerson lisa = new APerson("Lisa", "Smith","111-11-1111", 21,"Lisa@heaven.com");

      APerson jack = new  APerson("Jack", "Smith","222-11-1111", 41,"Jack@heaven.com");
       APerson tom = new APerson("Tom", "Cruise","111-11-1111", 21,"Tom@heaven.com");
      System.out.println(lisa);
      jack.marriedTO(lisa);
      System.out.println(jack);
      jack.divorceFrom(lisa);
      System.out.println(jack);
      tom.marriedTO(lisa);
      System.out.println(tom);
    }
    
}
