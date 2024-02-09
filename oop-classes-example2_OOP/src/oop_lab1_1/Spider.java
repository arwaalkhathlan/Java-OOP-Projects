/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_lab1_1;

/**
 *
 * @author arwa1
 */
public class Spider extends Animal{
    Spider(){
     super(8);
    }
    
    @Override
     void eat(){
        System.out.println("Spider eats insects");
     }
}
