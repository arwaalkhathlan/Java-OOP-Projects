/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex1_lec5_oob;

/**
 *
 * @author arwa1
 */
public class cat extends animal {
private String catName;
   public String getName() {
      return catName;
    }
  public void setName(String name) {
      catName=name;
   }
   public cat(String name){
    super(4);
    catName=name;
  }
//  @Override
public void eat() {
System.out.println(catName+" who is a cat eats fishes");
}
}

