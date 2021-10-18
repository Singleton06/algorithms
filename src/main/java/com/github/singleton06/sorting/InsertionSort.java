package com.github.singleton06.sorting;

public class InsertionSort {
    public static void sort(int[] arr) { 
        for (int j = 2; j < arr.length; j++) { 
            int val = arr[j];
            int i = j - 1;
            while (i > 0 && arr[i] > val) { 
                arr[i+1] = arr[i];
                i--;
            }
            arr[i+1] = val;
        }
    }
}
