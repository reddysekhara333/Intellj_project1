package com.practice;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ReverseString {
    public static void main(String[] args) {
        /*Scanner s = new Scanner(System.in);
        //System.out.println("enter your string  ======");
        String name =s.nextLine();
        //System.out.println("print the reverse String===");
        for(int i=name.length()-1;i>=0;i--){
            //System.out.print(name.charAt(i));
        }*/



        Employee e1 = new Employee(1,"Reddy",100l);
        Employee e2 = new Employee(2,"Sekhar",101l);
        Employee e3 = new Employee(3,"Raju",102l);
        Employee e4 = new Employee(4,"Reddy",103l);
        Employee e5 = new Employee(1,"Praveen",104l);

        List<Employee> t = new ArrayList<>();

        t.add(e1);
        t.add(e2);
        t.add(e3);
        t.add(e4);
        t.add(e5);

        t.stream().collect(Collectors.groupingBy(Employee::getName,Collectors.counting()));

        //System.out.println("Employee : "+t);
        Map<String,Long> m= t.stream().collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));
        System.out.println(m);
        t.stream().collect(Collectors.groupingBy(Employee::getId,Collectors.counting()));

        Map<Integer, Long> m1= t.stream().collect(Collectors.groupingBy(Employee::getId,Collectors.counting()));
        System.out.println(m1);







    }
}
