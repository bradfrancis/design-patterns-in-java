package com.example.structural.bridge.shape2;

public abstract class Shape {
    protected Colour colour;

    public Shape(Colour colour) {
        this.colour = colour;
    }

    abstract public void applyColour();
}
