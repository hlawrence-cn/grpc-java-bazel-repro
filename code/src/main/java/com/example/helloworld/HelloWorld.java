package com.example.helloworld;
import com.google.common.collect.ImmutableSet;

import java.util.List;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println(List.of("Hello", "World").stream().collect(ImmutableSet.toImmutableSet()));
    }
}