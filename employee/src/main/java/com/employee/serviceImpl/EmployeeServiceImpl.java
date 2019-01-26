package com.employee.serviceImpl;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    static int counter=3;

    @Override
    public void deleteEmployee(int id) {
        employees.remove(id);
    }

    @Override
    public Employee findOne(int id) {
        return employees.get(id);
    }

    static  List<Employee>  employees = new ArrayList<>();
    static {

        employees.add(new Employee("1","John","Admin","Administration"));
        employees.add(new Employee("2","Jill","SalesManager","Sales"));
        employees.add(new Employee("3","Jack","Deveolper","Information Technology"));


    }


    @Override
    public List<Employee> retieveEmployes() {
        return employees;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        if(employee.getEmployeeId()==null)
        {
            employee.setEmployeeId(String.valueOf(++counter));
        }
        employees.add(employee);
        return employee;
    }
}
