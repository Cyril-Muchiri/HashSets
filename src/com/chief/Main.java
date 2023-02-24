package com.chief;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        List <Integer> numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(2);numbers.add(3);numbers.add(4);numbers.add(1);
        numbers.add(1);

        Set <String> names=new HashSet<>();
        names.add("Mike");
        names.add("Johnte");
        names.add("Kamau");
        names.add("Jane");
        names.add("Malkia");

        System.out.println(names);



        Set<Integer> numberList=new HashSet<>();// hashsets are unordered
        numberList.addAll(numbers);
        System.out.println(numbers); // duplicated numbers

        System.out.println(numberList);// non-duplicated func


    }
}
