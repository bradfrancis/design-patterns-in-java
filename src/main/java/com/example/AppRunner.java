package com.example;

import com.example.creational.builder.LunchOrderDemo;

public class AppRunner {
    public static void main(String[] args) {
        Application app = new LunchOrderDemo();
        app.entry(args);
    }
}
