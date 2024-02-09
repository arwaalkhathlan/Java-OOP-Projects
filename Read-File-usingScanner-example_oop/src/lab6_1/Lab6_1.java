/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6_1;

import java.util.*;
import java.io.*;

public class Lab6_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException,NoSuchElementException {
        String name;
        int id;
        double gpa;
        
      
        Scanner sc = new Scanner(new File("lab.txt"));
        
        
        
        while (sc.hasNext())
          {
          name = sc.next();
          id = sc.nextInt();
          gpa = sc.nextDouble();
          if(gpa>4)
          System.out.println("Name: "+name+"ID: "+id+" Excellent");
          else
                  System.out.println("Name: "+name+"ID: "+id+" Average");
          }
        sc.close();

    }
    
}
