/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.coolcto.alan.man;

/**
 *
 * @author liu
 */
public class Girl extends Person {
       String cup ;
       
       public Girl(int age , String name, String cup){
           super.age=age;
           super.name=name;
           this.cup=cup;
           super.gender=Gender.GIRL;
       }
           
}
