/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop_lab5_1;
import java.util.concurrent.*;

public class OOP_Lab5_1 {

    
    public static void main(String[] args) {
        
       ExecutorService ex1 = Executors.newFixedThreadPool(3);
       ex1.execute(new to100());
       ex1.execute(new printchar('a'));
       ex1.execute(new printchar('b'));
       
       ex1.shutdown();
      
    }
    
}
class to100 implements Runnable {
    @Override
    public void run(){
       
        
    for(int i = 0; i<=100;i++){
        System.out.print(i+"");
        
       /* if(i==50){
        try{    
        t3.sleep();
        }catch(InterruptedException ex){}
         }*/
        }
    }
}


class printchar implements Runnable{
    
char c;

printchar(char c){
this.c =c;
}

@Override
public void run(){
for(int i = 0; i<100;i++){
        System.out.print(c);
        
    }

  }
}