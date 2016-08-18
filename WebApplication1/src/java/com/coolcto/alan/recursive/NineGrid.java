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
public class NineGrid {

    public static void main(String[] args) {
        int[] c = new int[12];
        defineList(c, 0);

    }

    public static void defineList(int[] c, int cur) {
        if (cur == 9 && c[6] + c[7] + c[8] == 15&& c[0] + c[4] + c[8] == 15&& c[2] + c[4] + c[6] == 15) {
            //ok
            for (int i = 0; i < 9; i++) {
                System.out.print(c[i] + " ");
                if ((i + 1) % 3 == 0) {
                    System.out.println();
                }
            }
            System.out.println();
        } else {
            for (int i = 1; i <= 9; i++) {
                boolean ok = true;
                for (int j = 0; j < cur; j++) {
                    if (c[j] == i) {
                        ok = false;
                        break;
                    }
                }
                if (cur == 3 && c[0] + c[1] + c[2] != 15
                        || cur == 6 && c[3] + c[4] + c[5] != 15
                        || cur == 7 && c[0] + c[3] + c[6] != 15
                        || cur == 8 && c[1] + c[4] + c[7] != 15) {
                    ok = false;
                }
                if (ok) {
                    c[cur] = i;
                    defineList(c, cur + 1);
                }
            }
        }

    }

    public static boolean elementInArray(int a, int[] list) {
        boolean in = false;
        for (int i = 0; i < 9; i++) {
            if (a == list[i]) {
                in = true;
            }
        }

        return in;

    }

}
