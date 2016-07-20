/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.coolcto.alan.model;

/**
 *
 * @author liu
 */
public class GirlFriendOfAlan extends GirlFriend implements PapapaInterface{
    int length;  //身高
    
    Alan alan;    
    
    public GirlFriendOfAlan(Man man) {
        super(man);
    }

    @Override
    public void papapa() {
        this.age=2;
    }
    
    public String warkUp(){
        return "起床了";
    }
    
}
