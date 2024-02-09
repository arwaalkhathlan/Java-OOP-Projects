/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

/**
 *
 * @author arwa1
 */
public class employee {
    int id;
    float salary;
    pi p1;
    dep d1;
    
    employee(int id,float salary,String name,String nationality,double yearofbirth,dep d1){
    this.id = id;
    this.salary = salary;
    p1 =new pi(name,nationality,yearofbirth);
    this.d1=d1;
        
    }
    String disply(){
    
    return "id "+id+" ||salary "+salary+" ||persnol information "+p1.name+ " ||"+p1.nationality+p1.yearofbirth+" ||department "+d1.depname+" "+d1.depno;
    }
    
}
