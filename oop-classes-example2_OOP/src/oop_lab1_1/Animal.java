/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_lab1_1;

/**
 *
 * @author arwa1
 */
public abstract class Animal {
    protected int legs;
    
    Animal(int legs){
    this.legs = legs;
    }
    
    abstract void eat();
    
    public void walk(){
        System.out.println("animal walks on "+legs+" legs");
    }
    
}
