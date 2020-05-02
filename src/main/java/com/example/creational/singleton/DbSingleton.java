package com.example.creational.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbSingleton {

    private static volatile DbSingleton instance = null;
    private static volatile Connection conn = null;

    // No parameters -- if you need parameters then use Factory.
    private DbSingleton() {
        // Protect against creation via reflection
        if (conn != null) {
            throw new RuntimeException("Use getConnetion() methid to create.");
        }

        // Protect against creation via reflection
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create.");
        }
    }

    public static DbSingleton getInstance() {

        // Make thread-safe/lazy-loaded
        if (instance == null) {
            synchronized (DbSingleton.class) {
                if (instance == null) {
                    instance = new DbSingleton();
                }
            }
        }

        return instance;
    }

    public Connection getConnection() {

        // Make thread-safe/lazy-loaded
        if (conn == null) {
            synchronized (DbSingleton.class) {
                if (conn == null) {
                    try {
                        String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";
                        conn = DriverManager.getConnection(dbUrl);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        return conn;
    }
}
