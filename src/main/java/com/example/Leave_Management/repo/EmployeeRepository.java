package com.example.Leave_Management.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Leave_Management.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {

    // Find employee by email
    Employee findByEmail(String email);

    // Find all employees under a manager
    List<Employee> findByManager_EmpId(String managerEmpId);
}
