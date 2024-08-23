package utilities;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OneTimeSetup {

    private static Connection connection;

    //@BeforeSuite
    public void setupDatabaseConnection() {
        System.out.println("Before Suite: Setting up database connection...");
        try {
            // Connection string for Windows Authentication
            String url = "jdbc:sqlserver://DESKTOP-AVAL6I4\\SQLEXPRESS;integratedSecurity=true;";

            // Establish the connection
            connection = DriverManager.getConnection(url);
            System.out.println("Connection established successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Failed to establish database connection.");
        }
    }

   // @AfterSuite
    public void closeDatabaseConnection() {
        System.out.println("After Suite: Closing database connection...");
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Database connection closed.");
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Failed to close database connection.");
            }
        }
    }

}
