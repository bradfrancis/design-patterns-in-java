package com.example.creational.factory;

import com.example.creational.factory.pages.CartPage;
import com.example.creational.factory.pages.ItemPage;
import com.example.creational.factory.pages.SearchPage;

public class Shop extends Website {

    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}
