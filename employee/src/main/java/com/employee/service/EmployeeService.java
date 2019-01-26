package com.employee.service;

import com.employee.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {

    public List<Employee> retieveEmployes();

    public Employee addEmployee(Employee employee);

    void deleteEmployee(int id);

    Employee findOne(int id);
}
