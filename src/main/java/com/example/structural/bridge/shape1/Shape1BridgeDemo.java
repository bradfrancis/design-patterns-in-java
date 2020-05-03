package com.example.structural.bridge.shape1;

import com.example.Application;

public class Shape1BridgeDemo implements Application {

    @Override
    public void entry(String[] args) {
        Circle circle = new BlueCircle();
        Square square = new RedSquare();

        circle.applyColour();
        square.applyColour();
    }
}
