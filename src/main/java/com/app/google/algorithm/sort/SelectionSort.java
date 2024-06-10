package com.app.google.algorithm.sort;

import java.util.Arrays;

public class SelectionSort {

    private void sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int min =i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[min]) {
                    min =j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void main(String[] args) {
        SelectionSort ss = new SelectionSort();

        int[] arr = {-5, 6, -8, 44, 22, 455, 47, -78};

        ss.sort(arr);

        System.out.println("Sorted Array in Ascending Order:");

        System.out.println(Arrays.toString(arr));
    }
}
