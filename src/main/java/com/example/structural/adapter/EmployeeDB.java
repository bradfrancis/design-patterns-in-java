package com.example.structural.adapter;

public class EmployeeDB implements Employee {

    private String id, firstName, lastName, email;

    public EmployeeDB(String id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return String.format("ID: %s, First Name: %s, Last Name: %s, Email: %s", id, firstName, lastName, email);
    }
}
