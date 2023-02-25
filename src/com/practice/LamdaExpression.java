package com.practice;

interface f1{
    void method(int a);
}

public class LamdaExpression {
    public static void main(String[] args) {
        int b=89;

        f1 o=(a) -> System.out.println(a);
        o.method(100);
        




    }
}
