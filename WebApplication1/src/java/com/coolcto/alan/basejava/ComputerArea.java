/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coolcto.alan.basejava;

import java.util.Scanner;

/**
 *
 * @author liu list=2-1,2-2
 */
public class ComputerArea {

    public static void main(String[] args) {
        double radius;
        double area;
        for (int i = 0;; i++) {
            Scanner input = new Scanner(System.in);
            radius = input.nextDouble();
            area = radius * radius * 3.141592653;
            System.out.println("The area for the circle of radius " + radius + " is " + area);
        }

    }

}
