package com.company;

public class Main {

    public static void main(String[] args) {
        Cat kitty = Cat
                .builder()
                .name("Leo")
                .breed("British Shorthair")
                .build();
        System.out.println(kitty);
        System.out.println("Hi");
    }
}
