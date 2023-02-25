package com.practice;

public class SumOfArrayNumbers {
    public static void main(String[] args) {
        int[] ar = {1,2,3,4,6,7,8,9,10,11};
        int sum=(11*12)/2;
        int miss;
        int actual=0;
        for(int i=0;i<ar.length;i++){
            actual=actual+ar[i];
        }
        System.out.println("missing number is "+(sum-actual));
    }
}
