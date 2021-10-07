package com.example.demo.Services;
import java.sql.*;

public class Database {

    public Database() {
    }

    private Connection connection = null;
    public boolean setConnection() {
        final String url = "jdbc:mysql://localhost:3306/rssfeedv2?serverTimezone=UTC";
        boolean res = false;
        try {
            connection = DriverManager.getConnection(url, "furt", "x");
            res = true;
        } catch (SQLException ioerr) {
            System.out.println(ioerr);
        }
        return res;
    }

    public int writeMessage(String firstName, String lastName, String email, String message, 
    String address, String postalCode, String phoneNumber) {
        String insstr = "INSERT INTO messages(firstname, lastname, email, message, address, postalcode, phonenumber,  pubdate) values (?, ? , ?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement;
        try {
            preparedStatement = connection.prepareStatement(insstr);
            preparedStatement.setString(1, firstName);
            preparedStatement.setString(2, lastName);
            preparedStatement.setString(3, email);
            preparedStatement.setString(4, message);
            preparedStatement.setString(5, address);
            preparedStatement.setString(6, postalCode);
            preparedStatement.setString(7, phoneNumber);
            preparedStatement.executeUpdate();
        } catch (SQLException err) {
            System.out.println("Fejl i INSERT message:" + err.getMessage());
            return 400;
        }
        System.out.println("Message er gemt");
        return 200;
    }
}
