/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab_6;
import java.util.*;
import java.io.*;
public class Lab_6 {

    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("out.txt"));
        String line = br.readLine();
        
        while(line!= null){
            System.out.println(line);
            line=br.readLine();
        }
        
    }
    
}
