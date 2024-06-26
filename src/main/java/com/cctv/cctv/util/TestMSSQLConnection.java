package com.cctv.cctv.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestMSSQLConnection {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=TaichungCCTV;encrypt=true;trustServerCertificate=true";
        String user = "sa";
        String password = "Brent871013.";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            if (connection != null) {
                System.out.println("Connected to the database!");
            } else {
                System.out.println("Failed to make connection!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
