package com.example.creational.singleton;

import com.example.Application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DbSingletonDemo implements Application {
    public void entry(String[] args) {
        DbSingleton instance = DbSingleton.getInstance();
        long timeBefore, timeAfter;

        timeBefore = System.currentTimeMillis();
        Connection conn = instance.getConnection();
        timeAfter = System.currentTimeMillis();
        System.out.println(String.format("Took %d ms to get connection the first time.", timeAfter - timeBefore));

        Statement stmt;
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate("CREATE TABLE Address (ID INT, StreetName VARCHAR(250), City VARCHAR(250))");
            System.out.println("Table created");
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        timeBefore = System.currentTimeMillis();
        conn = instance.getConnection();
        timeAfter = System.currentTimeMillis();
        System.out.println(String.format("Took %d ms to get connection the second time.", timeAfter - timeBefore));
    }
}
