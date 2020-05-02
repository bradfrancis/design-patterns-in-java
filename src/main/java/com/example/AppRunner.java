package com.example;

import com.example.creational.prototype.PrototypeDemo;

public class AppRunner {
    public static void main(String[] args) {
        Application app = new PrototypeDemo();
        app.entry(args);
    }
}
