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
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MyIO
{
    
    private MyIO()
    {
        
    }
    
   public static int getInt(String s)
   {
       boolean ok = false;
       int num=0; String strNum="";
       while(!ok)
       {
          try
          {
             strNum = JOptionPane.showInputDialog(s); 
             num = Integer.parseInt(strNum);
             ok = true;
             
             
             
          } catch (Exception ex)
          {
              JOptionPane.showMessageDialog(null,strNum+" it is not integer try again");
          }
           
         
           
           
       }
       
       return num;
   }
    
   public static void display(String s, Color bc, Color fc, int size)
    {
        JTextArea jt = new JTextArea(15,20);
        jt.setBackground(bc);
        jt.setForeground(fc);
        Font f = new Font("Times new Roman",Font.BOLD+Font.ITALIC,size);
        jt.setFont(f);
        jt.setText(s);
        JScrollPane sr = new JScrollPane(jt);
        JOptionPane.showMessageDialog(null,sr);
        
        
        
        
        
        
        
        
    }
    
}
