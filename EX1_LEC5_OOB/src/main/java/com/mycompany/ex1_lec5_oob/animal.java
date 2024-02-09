/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex1_lec5_oob;

/**
 *
 * @author arwa1
 */
public abstract class animal {
    
    protected int legs;
    
    protected animal (int legs){
    this.legs=legs;
    }
    
    public abstract void eat();
    
    public void walk(){
        System.out.println("animal walk with "+legs+" legs");
    }
}
