package com.example.demo.Models;

public class Contact {
    private String firstName;
    private String lastName;
    private String email;
    private String message;
    private String address;
    private int postalCode;
    private int phoneNumber;

    public Contact(String firstName, String lastName, String email, String message, 
                    String address, int postalCode, int phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.message = message;
        this.address = address;
        this.postalCode = postalCode;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Message [address=" + address + ", email=" + email + ", firstName=" + firstName + ", lastName="
                + lastName + ", message=" + message + ", phoneNumber=" + phoneNumber + ", postalCode=" + postalCode
                + "]";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
