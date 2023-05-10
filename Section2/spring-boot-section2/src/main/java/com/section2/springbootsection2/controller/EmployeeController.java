package com.section2.springbootsection2.controller;

import com.section2.springbootsection2.servicelayer.EmployeeService;
import com.section2.springbootsection2.servicelayer.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    // Here we are injecting the employee service interface, since the interface has only 1 implementation, it will use that


}
