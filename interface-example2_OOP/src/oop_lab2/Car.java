/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_lab2;

/**
 *
 * @author arwa1
 */
public class Car implements Vehicle {
    
    @Override
    public void start(){
        System.out.println("Starting engine...");
    }
    
    @Override
    public void stop(){
       System.out.println("Stopping engine...");
    }
    
}
