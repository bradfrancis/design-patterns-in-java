package com.example;

import com.example.creational.singleton.DbSingletonDemo;

public class AppRunner {
    public static void main(String args[]) {
        Application app = new DbSingletonDemo();
        app.entry(args);
    }
}
