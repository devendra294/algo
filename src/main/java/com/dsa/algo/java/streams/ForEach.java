package com.dsa.algo.java.streams;

import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> nameList = List.of("Dev", "Sumit", "Harsh", "Suresh", "Gaurav");
        nameList.stream().forEach(System.out::println);
    }
}
