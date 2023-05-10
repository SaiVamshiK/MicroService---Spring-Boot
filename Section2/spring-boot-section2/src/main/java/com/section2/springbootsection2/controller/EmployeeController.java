package com.section2.springbootsection2.controller;

import com.section2.springbootsection2.models.Employee;
import com.section2.springbootsection2.servicelayer.EmployeeService;
import com.section2.springbootsection2.servicelayer.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    // Here we are injecting the employee service interface, since the interface has only 1 implementation, it will use that

    @PostMapping("/")
    public Employee saveEmployee(@RequestBody Employee employee){
        employeeService.save(employee);
        return employee;
    }

}
