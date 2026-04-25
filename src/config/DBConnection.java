package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/cloud_file_manager",
                "root",
                "root"
            );
        } catch (Exception e) {
            System.out.println("DB Connection Failed");
            return null;
        }
    }
}