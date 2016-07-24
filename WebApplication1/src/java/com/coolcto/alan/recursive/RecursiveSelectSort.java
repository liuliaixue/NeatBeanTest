/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coolcto.alan.recursive;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author liu
 */
public class RecursiveSelectSort {

    public static double[] sort(double[] list) {
        return sort(list, 0, list.length - 1);
    }

    public static double[] sort(double[] list, int low, int high) {
        if (low < high) {
            int indexOfMin = low;
            double min = list[low];
            for (int i = low + 1; i < list.length - 1; i++) {
                if (min > list[i]) {
                    min = list[i];
                    indexOfMin = i;
                }
            }
            list[indexOfMin] = list[low];
            list[low] = min;
            return sort(list, low + 1, high);
        } else {
            return list;
        }
    }

    public static void main(String[] args) {
        double[] list = {1111, 22, 3, 4, 44, 23223};
        double[] reList = sort(list);
        for (double value : reList) {
            System.out.println(value);
        }
    }

}
