/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop_lab5;

/**
 *
 * @author arwa1
 */
public class OOP_Lab5 {

    
    public static void main(String[] args) {
        printChar a = new printChar(100,'a');
        printChar b = new printChar(50,'b');
        Thread thread1 = new Thread(a);
        Thread thread2 = new Thread(b);
        thread1.start();
        thread2.start();
        
    }  
}

class printChar implements Runnable{
    
    int times;
    char c;
    
    printChar(int times,char c){
    this.times = times;
    this.c=c;
    }
    
    @Override
    public void run(){
    
    for(int i=1;i<=times;i++){
        System.out.println(i+" :"+c);
      }
    }
}
