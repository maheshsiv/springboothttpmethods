package com.employee.model;

public class Employee {

    public Employee(String employeeId, String employeeName, String role, String department) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.role = role;
        this.department = department;
    }

    private Employee() {
    }

    private String employeeId;



    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    private String employeeName;

    private String role;

    private String department;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", role='" + role + '\'' +
                ", department='" + department + '\'' +
                '}';
    }





}
