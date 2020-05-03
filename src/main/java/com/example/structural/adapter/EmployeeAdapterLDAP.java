package com.example.structural.adapter;

public class EmployeeAdapterLDAP extends EmployeeAdapter {

    private EmployeeLDAP instance;

    public EmployeeAdapterLDAP(EmployeeLDAP employeeFromLDAP) {
        this.instance = employeeFromLDAP;
    }

    @Override
    public String getId() {
        return instance.getCn();
    }

    @Override
    public String getFirstName() {
        return instance.getGivenName();
    }

    @Override
    public String getLastName() {
        return instance.getSurname();
    }

    @Override
    public String getEmail() {
        return instance.getMail();
    }
}
