/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_lab1_1;

/**
 *
 * @author arwa1
 */
public class Cat extends Animal {
     String name;
     
     Cat(String name){
     super(4);
     this.name=name;
     }
     @Override
     void eat(){
         System.out.println("Cat eats Fishes");
     }
}
