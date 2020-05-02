package com.example;

import com.example.creational.abstractfactory.AbstractFactoryDemo;

public class AppRunner {
    public static void main(String[] args) {
        Application app = new AbstractFactoryDemo();
        app.entry(args);
    }
}
