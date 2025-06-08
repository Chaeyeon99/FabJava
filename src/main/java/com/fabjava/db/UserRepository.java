package com.fabjava.db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    public List<String> findAllEmails() {
        List<String> emails = new ArrayList<>();
        try (Connection conn = DatabaseConnector.connect();
             Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery("SELECT email FROM users");
            while (rs.next()) {
                emails.add(rs.getString("email"));
            }
        } catch (SQLException e) {
            System.err.println("Error fetching emails: " + e.getMessage());
        }
        return emails;
    }
}
