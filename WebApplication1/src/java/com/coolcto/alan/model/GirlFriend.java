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
public class GirlFriend {
    int age ;
    int height;
    int[]  body3D =new int[3];
    String name;
    Man man;

    public GirlFriend(Man man) {
        this.man = man;
    }    


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int[] getBody3D() {
        return body3D;
    }

    public void setBody(int[] body3D) {
        this.body3D = body3D;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Man getMan() {
        return man;
    }

    public void setMan(Man man) {
        this.man = man;
    }
    
        
    
    
//    @Override
//    public void papapa() {
////        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        System.out.println("啊啊啊");
//    }
  
}
