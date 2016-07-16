/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coolcto.alan.model;

import java.util.Comparator;

/**
 *
 * @author liu
 */
public class Person implements Comparator<Person>{

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public boolean olderThen(Person a) {
        System.out.println(this.age);
        System.out.println(a.age);
        if (this.age > a.age) {
            
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "{age:" + getAge() + ",name:" + getName() + "}";
    }

    public String toJson(Person p) {
        return "error";
    }

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.age > o2.age) {
            return 1;
        }else if(o1.age < o2.age){
            return -1;
        }else{
            return 0;
        }
    }
}
