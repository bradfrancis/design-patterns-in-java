package com.example.structural.adapter;

public class EmployeeAdapterCSV extends EmployeeAdapter {

    private EmployeeCSV instance;

    public EmployeeAdapterCSV(EmployeeCSV employeeFromCSV) {
        instance = employeeFromCSV;
    }

    @Override
    public String getId() {
        return Integer.toString(instance.getId());
    }

    @Override
    public String getFirstName() {
        return instance.getFirstName();
    }

    @Override
    public String getLastName() {
        return instance.getLastName();
    }

    @Override
    public String getEmail() {
        return instance.getEmailAddress();
    }
}
