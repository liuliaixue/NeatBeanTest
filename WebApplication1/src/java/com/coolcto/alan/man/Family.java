/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coolcto.alan.man;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author liu
 */
public class Family {

    Boy man;
    Girl woman;

    List<Boy> sons;
//    Girl[] daughter;
    List<Girl> daughters = new ArrayList<Girl>();

    public List<Girl> getDaughters() {
        return daughters;
    }

    public Family(Boy man, Girl woman) {
        this.man = man;
        this.woman = woman;
    }

    public void Papapa(int papapaTime) {
        System.out.println(this.man.getName() + " and " + this.woman.getName() + " are papapaing...");
        if (papapaTime > 30) {
            Girl g = new Girl(0, "laji", "20,20,20");
            daughters.add(g);
            

        }

    }

}
