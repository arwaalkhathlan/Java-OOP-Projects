/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trying_out;

/**
 *
 * @author arwa1
 */
public class Fish extends Animal{
    private String name;
    
    public Fish(){
    super(0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void walk(){
        System.out.println("the Fish walks with "+legs+" legs");
    }
    public void eat(){
        System.out.println("Fish eats shrimp");
    }
}
