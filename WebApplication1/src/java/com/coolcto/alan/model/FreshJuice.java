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

class FreshJuice {
   enum FreshJuiceSize{ SMALL, MEDUIM, LARGE }
   FreshJuiceSize size;
   
   FreshJuice(){
       System.out.println("FreshJuice被构造了");
   }
    public static void main(String []args){};
}

