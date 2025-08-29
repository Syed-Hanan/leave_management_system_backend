package com.example.Leave_Management.service;

import com.example.Leave_Management.entity.Employee;
import java.util.List;

public interface EmployeeService {
    Employee getEmployeeByEmail(String email);       // Fetch employee by email
    List<Employee> getAllEmployees();               // For manager
    Employee getEmployeeById(String empId);         // Get by empId
    Employee addEmployee(Employee employee);        // Add new employee
}
