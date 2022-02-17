package com.example.demostudy.java;

import java.util.Arrays;
import java.util.List;

public class TestStringJoin {
    public static void main(String[] args) {
        List list = Arrays.asList("1", "2", "3");
        List list2 = Arrays.asList("1", "2", "3");
        List list1 = Arrays.asList("1", "2", "3");
        final String join = String.join(",", list);
        System.out.println(join);
        System.out.println(join);
        System.out.println(join);
    }
}
