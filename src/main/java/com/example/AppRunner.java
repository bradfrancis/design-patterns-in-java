package com.example;

import com.example.structural.adapter.AdapterDemo;

public class AppRunner {
    public static void main(String[] args) {
        Application app = new AdapterDemo();
        app.entry(args);
    }
}
