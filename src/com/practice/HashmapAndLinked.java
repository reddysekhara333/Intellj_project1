package com.practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashmapAndLinked {
    public static void main(String[] args) {
        HashMap<String ,Integer> hm=new HashMap<>();
        hm.put("chinna",12);
        hm.put("bahs",123);
        hm.put("reddi",12);
        hm.put("null",12);
        System.out.println(hm);

        LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>();
        lhm.put(11,"good");
        lhm.put(2,  "bl");
        lhm.put(1,"am");
        lhm.put(null,"and");
        System.out.println(lhm);

        TreeMap<Integer,String> tm=new TreeMap<>();
        tm.put(11,"good");
        tm.put(2,"i");
        tm.put(1,"am");
        tm.put(0,"and");
        System.out.println(tm);


    }

}
