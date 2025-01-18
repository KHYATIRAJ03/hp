package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    // Handle HTTP GET requests
    @GetMapping
    public Employees getAllEmployees() {
        return EmployeeManager.getEmployees();
    }

    // Handle HTTP POST requests
    @PostMapping
    public ResponseEntity<String> addEmployee(@RequestBody Employee employee) {
        Employees employeesList = EmployeeManager.getEmployees();
        employeesList.getEmployeeList().add(employee);
        return ResponseEntity.ok("Employee added successfully!");
    }
}
