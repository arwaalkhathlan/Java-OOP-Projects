/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ex1_lec5_oob;

/**
 *
 * @author arwa1
 */
public class EX1_LEC5_OOB {

    public static void main(String[] args) {
        
        spider s = new spider();
        
        s.eat();
        s.walk();
        
        cat c1 = new cat("sai");
        c1.eat();
        c1.walk();
    }
}
