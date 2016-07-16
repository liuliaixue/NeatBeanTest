/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coolcto.alan.utils;

import com.coolcto.alan.model.Person;

/**
 *
 * @author liu
 */
public class AlanUtils {
    
    public static void main(String[] args){
        System.out.println(compare());
        
    }
    public static boolean compare() {
        Person alan = new Person(18,"alan");
        Person pain = new Person(21,"payne");
        return alan.olderThen(pain);
    }
}
