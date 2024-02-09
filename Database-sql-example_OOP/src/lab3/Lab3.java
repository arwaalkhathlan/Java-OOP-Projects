/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3;

/**
 *
 * @author arwa1
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        dep p1 = new dep("department",112);
        employee e1= new employee(111,4000,"arwa","saudi",2002,p1);
        
        System.out.println(e1.disply());
    }
    
}
