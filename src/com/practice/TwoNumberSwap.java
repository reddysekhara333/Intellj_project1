package com.practice;

public class TwoNumberSwap {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println(a+"before the variable"+b);
//        a=a+b;
//        b=a-b;
//        a=a-b;
//        System.out.println(a+"before the variable"+b);
        int tem=a;
        a=b;
       b=tem;
        System.out.println(a+"before the variable"+b);


    }

}
