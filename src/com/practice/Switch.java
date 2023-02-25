package com.practice;

public class Switch {

    public static void main(String[] args) {
        int a=120;
        switch (a) {
            case 1:
                System.out.println("integer value is :" + a);

            case 12:
                System.out.println("inter values" +a);
              break;

            default:
                System.out.println("default value greter than 00");
        }
        for(int i=0;i<10;i++){

            if(i==4){
               break;

            }
            System.out.println(i);
        }

    }
}
