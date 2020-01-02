package com.bjqn.controller;

import java.util.Arrays;

public class Text {
    public static void main(String[] args) {
        int[] arr={10,20,30,50,90,2};
        for (int i = 0; i < arr.length; i++) {
            int min=0;
            for (int j = min; j < arr.length; j++) {
                   if (arr[j]<arr[min]) {
                       min = j;
                   }
            }
            int tmp =arr[i];
            arr[i]=arr[min];
            arr[min]=tmp;
        }
        System.out.println(Arrays.toString(arr));

        }
    }

