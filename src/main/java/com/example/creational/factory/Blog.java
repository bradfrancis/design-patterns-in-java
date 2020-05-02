package com.example.creational.factory;

import com.example.creational.factory.pages.AboutPage;
import com.example.creational.factory.pages.CommentPage;
import com.example.creational.factory.pages.ContactPage;
import com.example.creational.factory.pages.PostPage;

public class Blog extends Website {

    @Override
    public void createWebsite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
    }
}
