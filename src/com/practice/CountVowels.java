package com.practice;

import java.util.ArrayList;

public class CountVowels {
    public static void main(String[] args) {
        String s="hello Good night chinna";
        s.toLowerCase();
        String vowel="aeiou";
        ArrayList<Character> Vowels= new ArrayList<Character>();
        int count=0;
        for(int i=0;i<vowel.length();i++){
            Vowels.add(vowel.charAt(i));
        }
        System.out.println(Vowels);
        for(int j =0;j<s.length();j++){
           if(Vowels.contains(s.charAt(j))){
            count++;
           }
        }
        System.out.println(count);


    }
}
