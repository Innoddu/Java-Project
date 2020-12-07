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
/**
 *
 * @author adehkhoda
 */
public class Student extends APerson
{
    private double gpa;
    
    public Student()
    {
        super();
    }
    public Student(String fN, String lN, String s, int a, String e, double g)
    {
        super(fN,lN,s,a,e);
        gpa = g;
    }
    public void setGPA(double g)
    {
       this.gpa = g;
    }
    public double getGPA()
    {
        return gpa;
    }
    
    public String toString()
    {
        return super.toString() + "\n"+"GPA:"+gpa;
    }
    
    
    
    
    
}
