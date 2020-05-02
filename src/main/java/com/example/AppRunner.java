package com.example;

import com.example.creational.factory.WebsiteFactoryDemo;

public class AppRunner {
    public static void main(String[] args) {
        Application app = new WebsiteFactoryDemo();
        app.entry(args);
    }
}
