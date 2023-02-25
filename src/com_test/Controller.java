package com_test;

import java.util.ArrayList;
import java.util.Iterator;

public class Controller {

        public static void main(String[] args) {
            ArrayList<Integer> i=new ArrayList<>();

            for(int j=1;j<=100;j++){
                i.add(j);
            }
            Iterator<Integer> ii=i.iterator();
            boolean num;
            while(ii.hasNext()){
                int k=ii.next();
                if(k%5==0){
                    System.out.println(k);
                }

            }

        }
    }


