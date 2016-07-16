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
public class FreshJuiceTest {
   public static void main(String []args){
       
      FreshJuice juice = new FreshJuice();
      juice.size = FreshJuice    .FreshJuiceSize.SMALL ;
      System.out.println(juice.size);
      System.out.println(juice.getClass());
   }

}

