package com.company;

public class Main {

    public static void main(String[] args) throws Exception, Exception {
        Cat kitty = Cat
                .builder()
                .name("Leo")
                .breed("British Shorthair")
                .build();
        if (true) System.out.println("true kitty");
    }
}
