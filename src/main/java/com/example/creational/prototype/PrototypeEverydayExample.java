package com.example.creational.prototype;

import com.example.Application;

import java.util.ArrayList;
import java.util.List;

public class PrototypeEverydayExample implements Application {

    @Override
    public void entry(String[] args) {
        String sql = "SELECT * FROM movies WHERE title = ?";

        List<String> params = new ArrayList<>();
        params.add("Star Wars");

        Record record = new Record();

        Statement firstStatement = new Statement(sql, params, record);
        System.out.println(firstStatement);
        System.out.println(firstStatement.getSql());
        System.out.println(firstStatement.getParameters());
        System.out.println(firstStatement.getRecord());

        Statement secondStatement = firstStatement.clone();
        secondStatement.getParameters().add("Star Trek");
        System.out.println(secondStatement);
        System.out.println(secondStatement.getSql());
        System.out.println(secondStatement.getParameters());
        System.out.println(secondStatement.getRecord());

        System.out.println(firstStatement.getParameters());

    }
}
