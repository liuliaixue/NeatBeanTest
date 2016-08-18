/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coolcto.alan.recursive;

import java.util.Scanner;

/**
 *
 * @author liu
 */
public class ComputeFactorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a nonnegative inieger");
        int n = input.nextInt();
        System.out.println("Factorial of "+n + " is "+ factorial(n));
    }

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n*factorial(n-1);
        }

    }

}
