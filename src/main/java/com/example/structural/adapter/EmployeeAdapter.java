package com.example.structural.adapter;

public abstract class EmployeeAdapter implements Employee {

    @Override
    public String toString() {
        return String.format("ID: %s, First Name: %s, Last Name: %s, Email: %s",
                this.getId(), this.getFirstName(), this.getLastName(), this.getEmail());
    }
}
