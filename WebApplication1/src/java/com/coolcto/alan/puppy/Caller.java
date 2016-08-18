/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.coolcto.alan.puppy;

/**
 *
 * @author liu
 */
public class Caller {
    public static void main(String[] args){
        Puppy p = new Puppy("sb");
        p.setAge(2);
        System.out.println(p.puppyAge);
    }
}
