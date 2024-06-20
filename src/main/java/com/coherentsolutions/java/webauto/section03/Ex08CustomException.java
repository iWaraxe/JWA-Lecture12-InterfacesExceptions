package com.coherentsolutions.java.webauto.section03;

import java.util.ArrayList;
import java.util.List;

/**
 * Custom exception class.
 * Custom exceptions can be created by extending the Exception class.
 */
public class Ex08CustomException extends Exception {
    public Ex08CustomException() {
        super("Our company is empty! Please add employees.");
    }
}

class Company {
    private List<Employee> employees = new ArrayList<>();

    public List<Employee> getEmployees() throws Ex08CustomException {
        if (employees.isEmpty()) {
            throw new Ex08CustomException();
        }
        return employees;
    }

    public static void main(String[] args) {
        Company company = new Company();
        try {
            company.getEmployees();
        } catch (Ex08CustomException e) {
            System.out.println("Exception: " + e);
        }
    }
}

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
