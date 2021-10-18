package com.github.singleton06;

import java.util.Random;

public class DataGeneration {
    public static int[] generateRandomArrayOfLength(int length) { 
        int[] arr = new int[length];
        Random rand = new Random();
        for (int i = 0; i < length; i++ ) { 
            arr[i] = rand.nextInt();
        }
        return arr;
    }
}
