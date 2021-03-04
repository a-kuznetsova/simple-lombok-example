package com.company;

public class Main {

    public static void main(String[] args) {
        Cat kitty = Cat
                .builder()
                .name("Leo")
                .breed("British Shorthair")
                .build();
        System.out.println(kitty);
        Cat kitty3 = Cat
                .builder()
                .name("Kali")
                .breed("British Shorthair")
                .build();
        System.out.println(kitty3);
    }
}
