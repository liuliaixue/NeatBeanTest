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
public class Person {

    int age;
    String name;
    Gender gender;

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public void say(String s) {
        System.out.println("say:");
        System.out.println(s);
    }

    public void action(String action) {
        System.out.println("action:");
        System.out.println(action);
    }

}
