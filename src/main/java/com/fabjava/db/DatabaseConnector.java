package com.fabjava.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.fabjava.auth.Credentials;

public class DatabaseConnector {
    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(
            Credentials.DB_URL,
            Credentials.DB_USER,
            Credentials.DB_PASS
        );
    }
}
