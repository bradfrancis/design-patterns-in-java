package com.example.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
    public List<Employee> getEmployeeList() {
        List<Employee> employees = new ArrayList<>();

        Employee employeeFromDB = new EmployeeDB("1234", "John", "Wick", "john.wick@example.com");
        employees.add(employeeFromDB);

        EmployeeLDAP employeeFromLDAP = new EmployeeLDAP("chewie", "Solo", "Han", "han.solo@example.com");
        employees.add(new EmployeeAdapterLDAP(employeeFromLDAP));

        EmployeeCSV employeeFromCSV = new EmployeeCSV("567, Sherlock, Holmes, sherlock.holmes@example.com");
        employees.add(new EmployeeAdapterCSV(employeeFromCSV));

        return employees;
    }
}
