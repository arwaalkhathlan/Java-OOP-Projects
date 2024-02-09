/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_lab1;

/**
 *
 * @author arwa1
 */
public class Circle extends Shape {
    double radius;
    
    Circle(String colour, String filling,Double radius){
    super(colour,filling);
    this.radius=radius;
    
    }
    public void print(){
        System.out.println(radius);
        
    }
    @Override
    
    public double area(){
    
    return radius*2;
    }
}
