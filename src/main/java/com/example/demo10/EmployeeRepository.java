package com.example.demo10;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
