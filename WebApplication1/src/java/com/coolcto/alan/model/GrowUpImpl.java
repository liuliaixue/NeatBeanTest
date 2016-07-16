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
public class GrowUpImpl implements GrowUp{

    @Override
    public Person addAge(Person p) {
        p.setAge(p.getAge()+1);
        return p;
    }
    
}
