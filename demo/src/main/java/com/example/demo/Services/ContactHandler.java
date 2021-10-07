package com.example.demo.Services;

import com.example.demo.Models.Contact;

public class ContactHandler {
    Database db = new Database();

    public ContactHandler() { 
    }
    
    public String validateContact(String firstName, String lastName, String email, String message, 
    String address, String postalCode, String phoneNumber) {
       //db.writeMessage(firstName, lastName, email, message, address, postalCode, phoneNumber);
       
        return "200";
    }
}
