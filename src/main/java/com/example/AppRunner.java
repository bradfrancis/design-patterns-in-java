package com.example;

import com.example.structural.composite.CompositeMenuDemo;

public class AppRunner {
    public static void main(String[] args) {
        Application app = new CompositeMenuDemo();
        app.entry(args);
    }
}
