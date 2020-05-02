package com.example.creational.abstractfactory;

import com.example.Application;

public class AbstractFactoryDemo implements Application {

    @Override
    public void entry(String[] args) {
        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(900);
        CreditCard card = abstractFactory.getCreditCard(CardType.PLATINUM);
        System.out.println(card.getClass());

        abstractFactory = CreditCardFactory.getCreditCardFactory(600);
        CreditCard card2 = abstractFactory.getCreditCard(CardType.GOLD);
        System.out.println(card2.getClass());
    }
}
