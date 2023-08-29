package com.staticTest;

public class DatabaseConnection {
    private DatabaseConnection() {}

    private static DatabaseConnection instance = null;

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
}
