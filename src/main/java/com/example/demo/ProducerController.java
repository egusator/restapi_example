package com.example.demo;

import java.sql.*;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {
    static final String DB_URL = "jdbc:postgresql://127.0.0.1:5432/restapi_example";
    static final String USER = "admin";
    static final String PASS = "123456";
    @GetMapping("/all")
    public ArrayList<Producer> producer(@RequestParam(value = "rating", defaultValue = "0") int rating) throws SQLException {
        ArrayList<Producer> arr = new ArrayList<Producer>();

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {

            e.printStackTrace();

        }

        Connection connection = null;

        try {
            connection = DriverManager
                    .getConnection(DB_URL, USER, PASS);

        } catch (SQLException e) {
            System.out.println("Connection Failed");
            e.printStackTrace();

        }

        if (connection != null) {
        } else {
        }

        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("select * from producer");

        while (rs.next()) {
            if (rating == 0) {
                arr.add(new Producer(rs.getInt("id"), rs.getString("inst"), rs.getString("email"), rs.getInt("rating")));
            } else {
                int r = rs.getInt("rating");
                int id = rs.getInt("id");
                String email = rs.getString("email");
                String inst = rs.getString("inst");
                if (r == rating) {
                    arr.add(new Producer(id, inst, email, rating));
                }
            }
        }
        return arr;
    }
}
