package com.practice;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountDuplicate {
    public static void main(String[] args) {
        Employee e =new Employee(2,"reddi",20l);

        Employee e1 =new Employee(1,"kumar",30l);
        Employee e2 =new Employee(1,"reddi",100l);


        List<Employee> l=new ArrayList<>();
        l.add(e);
        l.add(e1);
        l.add(e2);
        Map<Integer,Long> map=l.stream().collect(Collectors.groupingBy(Employee::getId,Collectors.counting()));
        System.out.println(map);

    }
}

