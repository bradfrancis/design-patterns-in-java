package com.example.structural.bridge;

import com.example.Application;

public class BridgeDemo implements Application {

    @Override
    public void entry(String[] args) {
        Movie movie = new Movie();
        movie.setClassification("Action");
        movie.setTitle("John Wick");
        movie.setRuntime("2:15");
        movie.setYear("2014");

        Formatter printFormatter = new PrinterFormatter();
        Formatter htmlFormatter = new HTMLFormatter();
        Printer moviePrinter = new MoviePrinter(movie);

        String printedMaterial = moviePrinter.print(printFormatter);
        String htmlMaterial = moviePrinter.print(htmlFormatter);

        System.out.println(printedMaterial);
        System.out.println(htmlMaterial);
    }
}
