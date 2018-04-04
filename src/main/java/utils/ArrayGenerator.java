package utils;

import java.util.Random;

public class ArrayGenerator {
    public Comparable[]generate(int n){
        Integer[]arr = new Integer[n];
        Random rand = new Random();

        for (int i =0; i< arr.length; i++){
            arr[i] = rand.nextInt(n);
        }
        return arr;
    }
}
