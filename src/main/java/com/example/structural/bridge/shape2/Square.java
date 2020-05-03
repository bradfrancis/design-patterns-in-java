package com.example.structural.bridge.shape2;

public class Square extends Shape {

    public Square(Colour colour) {
        super(colour);
    }

    @Override
    public void applyColour() {
        colour.applyColour();
    }
}
