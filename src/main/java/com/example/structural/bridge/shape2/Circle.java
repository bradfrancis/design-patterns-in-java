package com.example.structural.bridge.shape2;

public class Circle extends Shape {

    public Circle(Colour colour) {
        super(colour);
    }

    @Override
    public void applyColour() {
        colour.applyColour();
    }
}
