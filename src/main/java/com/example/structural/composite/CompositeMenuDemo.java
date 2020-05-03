package com.example.structural.composite;

import com.example.Application;

public class CompositeMenuDemo implements Application {

    @Override
    public void entry(String[] args) {
        Menu mainMenu = new Menu("Main", "/main");
        MenuItem safetyMenuItem = new MenuItem("Safety", "/safety");
        Menu claimsSubMenu = new Menu("Claims", "/claims");
        MenuItem personalClaimsMenu = new MenuItem("Personal Claim", "/personalClaims");

        mainMenu.add(safetyMenuItem);
        mainMenu.add(claimsSubMenu);
        claimsSubMenu.add(personalClaimsMenu);

        System.out.println(mainMenu.toString());
    }
}
