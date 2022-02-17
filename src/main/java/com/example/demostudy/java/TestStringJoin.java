package com.example.demostudy.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class TestStringJoin {
    public static void main(String[] args) {
        List list = Arrays.asList("1", "2", "3");
        final String join = String.join(",", list);
        System.out.println(join);
    }
}
