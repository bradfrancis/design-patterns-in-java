package com.example.structural.bridge.shape2;

import com.example.Application;

public class Shape2BridgeDemo implements Application {

    @Override
    public void entry(String[] args) {
        Colour blue = new Blue();
        Colour red = new Red();
        Colour green = new Green();

        Shape circle = new Circle(red);
        Shape square = new Square(blue);
        Shape greenCircle = new Circle(green);

        circle.applyColour();
        square.applyColour();
        greenCircle.applyColour();
    }
}
