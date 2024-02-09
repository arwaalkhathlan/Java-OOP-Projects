/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop_lab5_2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class OOP_Lab5_2 {

    
    public static void main(String[] args) {
        ExecutorService ex1 = Executors.newFixedThreadPool(3);
       ex1.execute(new even20());
       ex1.execute(new odd20());
       ex1.shutdown();
    }
    
}
class even20 implements Runnable {
    @Override
    public void run(){
       
        
    for(int i = 1; i<=20;i++){
        if(i%2==0){
        System.out.print(i+" ");
        if(i==10){
        try{    
        Thread.sleep(1000);
        }catch(InterruptedException ex){}
         }
       
        }}
    }
}

class odd20 implements Runnable {
    @Override
    public void run(){
       
        
    for(int i = 1; i<=20;i++){
        if(i%2!=0){
        System.out.print(i);
        
        }}
    }
}