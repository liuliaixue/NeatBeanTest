/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coolcto.alan.basejava;

import javax.swing.JOptionPane;

/**
 *
 * @author liu list=1-4
 */
public class WelcomeInMessageDialogBox {
    float num1=1.0f;
    double part = 1.4;

    public static void main(String[] args) {
        test();
        JOptionPane.showMessageDialog(null, "Welcome to Java", "java title", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void test() {
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Computer Science");
        System.out.println("Programmging is fun");
    }

}
