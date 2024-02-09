/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trying_out;


public class Cat extends Animal {
    private String name;
    
    public Cat(String name){
    super(4);
    this.name=name;
    }

    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }
    
    public void eat(){
        System.out.println("this animal eats rats or fish");
    }
    //public void walk(){}
    
}
