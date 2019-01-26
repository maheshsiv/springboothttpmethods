package com.employee.controller;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

import static javafx.scene.input.KeyCode.T;

/*
   Employee controller used for retrieve,delete update employees
 */

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    //GET Method used to get all Employers
    @GetMapping("/employees")
    public List<Employee> getEmployees(){

     return employeeService.retieveEmployes();
    }

    //Post Method used to add Employee
    @PostMapping("/employees")
    public ResponseEntity<Object> addEmployee(@RequestBody Employee employee){
        Employee savedemployee = employeeService.addEmployee(employee);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("{/id}").buildAndExpand(savedemployee.getEmployeeId()).toUri();
        return ResponseEntity.created(location).build();
    }

    //delete Method used to delete Employee
    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable int id){

         employeeService.deleteEmployee(id);
    }

    //get Method used to to find Employee
    @GetMapping("/employees/{id}")
    public Employee addEmployee(@PathVariable int id){

        return employeeService.findOne(id);
    }


}
