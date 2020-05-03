package com.example.structural.adapter;

import com.example.Application;

import java.util.List;

public class AdapterDemo implements Application {

    @Override
    public void entry(String[] args) {
        EmployeeClient client = new EmployeeClient();
        List<Employee> employees = client.getEmployeeList();

        System.out.println(employees);
    }
}
