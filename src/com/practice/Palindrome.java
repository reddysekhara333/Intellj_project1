package com.practice;

public class Palindrome {
    public  static boolean palindrome(String name){

        int a=0;
        int b=name.length()-1;
        while(a<b){
            if(name.charAt(a)!=name.charAt(b))
                return false;
            a++;
            b--;

        }
        return true;
    }
    public static void main(String[] args) {
  if(palindrome("madaam") ==true){
      System.out.println("is palindrome");
  }else{
      System.out.println("is not palindrome");
  }

    }
}
