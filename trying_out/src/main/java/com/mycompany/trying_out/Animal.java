/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trying_out;

/**
 *
 * @author arwa1
 */
public abstract class Animal {
    protected int legs;
    
    protected Animal(int legs){
     this.legs=legs;
    } 
    public void walk(){
     System.out.println("this animal walks with "+legs+" legs");
    }
    
    public abstract void eat();
    
}
