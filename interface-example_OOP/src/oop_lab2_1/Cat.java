/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_lab2_1;

/**
 *
 * @author arwa1
 */
public class Cat implements nameable{
    String name;
    Cat(String name){
    this.name = name;
    
    }
    
    @Override
    public String getName(){
    
    return "the cat's name is "+name;}
}
