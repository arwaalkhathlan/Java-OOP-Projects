/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop_lab1_1;

/**
 *
 * @author arwa1
 */
public class OOP_lab1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Spider
        Animal s1= new Spider();
        
        s1.eat();
        s1.walk();
        
        //Cat
        
        Animal C1 = new Cat("Sai");
        
        C1.eat();
        C1.walk();
    }
    
}
