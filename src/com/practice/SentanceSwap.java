package com.practice;

public class SentanceSwap {
    public static void main(String[] args) {
        String s="i am is the room i am in the room";
        int mid=(s.length())/2;
        String ns="";
        for(int i=0;i<s.length();i++){
            if(i<mid){
                ns = ns+Character.toLowerCase(s.charAt(i));

            }
            else{
                ns=ns+Character.toUpperCase((s.charAt(i)));
            }
        }
        System.out.println(ns);

    }
}
