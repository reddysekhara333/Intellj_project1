package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortedAndClosetNumber {
    private static List<Integer> integers = new ArrayList<Integer>();

    static {
        for (int i = 0; i <= 10; i++) {
            integers.add(Integer.valueOf(i * 10));
        }
    }

    public static void main(String[] args) {
        Integer closest = null;
        Integer arg = Integer.valueOf(args[0]);

        int index = Collections.binarySearch(
                integers, arg);

        if (index < 0) /*arg doesn't exist in integers*/ {
            index = -index - 1;
            if (index == integers.size()) {
                closest = integers.get(index - 1);
            } else if (index == 0) {
                closest = integers.get(0);
            } else {
                int previousDate = integers.get(index - 1);
                int nextDate =  integers.get(index);
                if (arg - previousDate < nextDate - arg) {
                    closest = previousDate;
                } else {
                    closest = nextDate;
                }
            }
        } else /*arg exists in integers*/ {
            closest = integers.get(index);
        }
        System.out.println("The closest Integer to " + arg + " in " + integers
                + " is " + closest);

    }
    }
