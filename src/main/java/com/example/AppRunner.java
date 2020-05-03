package com.example;

import com.example.structural.bridge.BridgeDemo;

public class AppRunner {
    public static void main(String[] args) {
        Application app = new BridgeDemo();
        app.entry(args);
    }
}
