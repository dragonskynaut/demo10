package com.example.demo10;

import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService {
    List<Employee> retrieveEmployees();
    Employee getEmployee(Long employeeId);
    void saveEmployee(Employee employee);
    void deleteEmployee(Long employeeId);
    void updateEmployee(Employee employee);
}
