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
public class FamilyTest {
    public static void main(String[] args){
        Boy xiaoming=new Boy();
        xiaoming.setAge(18);
        xiaoming.setName("xiaoming");
        Girl xiaohong=new Girl(22,"xiaohong","90,90,90");
        
        
        Family family=new Family(xiaoming,xiaohong);
        family.Papapa(40);
        family.Papapa(40);
        System.out.println(family.getDaughters().size());
    }
    
}
