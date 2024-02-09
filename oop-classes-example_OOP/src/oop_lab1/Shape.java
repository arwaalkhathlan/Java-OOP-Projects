/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_lab1;

/**
 *
 * @author arwa1
 */
public abstract class Shape {
    String colour;
    String filling;
    
    Shape(String colour,String filling){
    this.colour=colour;
    this.filling=filling;
    
    }
    public abstract double area();
}
