/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coolcto.alan.recursive;

/**
 *
 * @author liu
 */
public class RecursivePalinedrome {

    public static boolean isPalindrome(String s) {
        return isPalindrome(s, 0, s.length() - 1);
    }

    public static boolean isPalindrome(String s, int low, int high) {
        if (low >= high) {
            return true;
        } else if (s.charAt(high) != s.charAt(low)) {
            return false;
        } else {
            return isPalindrome(s, low + 1, high - 1);
        }
    }

    public static void main(String[] args) {
        String s = "moom";
        String s1 = "";
        String s2 = "m";
        String s3 = "moom";
        String s4 = "moomoo";
        
        System.out.println(isPalindrome(s));
        System.out.println(isPalindrome(s1));
        System.out.println(isPalindrome(s2));
        System.out.println(isPalindrome(s3));
        System.out.println(isPalindrome(s4));

    }

}
