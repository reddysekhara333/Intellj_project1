package com.practice;

public class FibonacciSeries {
    static  int n=0,n1=1,n2=0;
    static  void fibonacci(int count){
        if(count>0){
            n2=n+n1;
            n=n1;
            n1=n2;
            System.out.print(" "+n2);
            fibonacci(count-1);
        }
    }
    public static void main(String[] args) {
//        int n1=0,n2=1,n3,i,count=10;
//        System.out.print(n1+" "+n2);
//        for(i=2;i<count;++i){
//            n3=n1+n2;
//            System.out.print(" "+n3);
//            n1=n2;
//            n2=n3;
//        }

        // Online Java Compiler
// Use this editor to write, compile and run your Java code online
                System.out.println(n+" "+n1);
                int count=10;
                fibonacci(count-2);
            }
        }



