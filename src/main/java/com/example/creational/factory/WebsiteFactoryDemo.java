package com.example.creational.factory;

import com.example.Application;

public class WebsiteFactoryDemo implements Application {

    @Override
    public void entry(String[] args) {
        Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        System.out.println(site.getPages());

        site = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        System.out.println(site.getPages());
    }
}
