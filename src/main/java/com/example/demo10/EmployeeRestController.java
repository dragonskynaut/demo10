package com.example.demo10;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeRestController {
    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeRestController.class);

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/api/employees")
    public List<Employee> getEmployees(){
        return employeeService.retrieveEmployees();
    }

    @PostMapping("/api/employees")
    public void saveEmployee(Employee employee){
        employeeService.saveEmployee(employee);
        LOGGER.info("add a record:"+ employee);
    }

    @GetMapping("/api/employees/{employeeId}")
    public Employee getEmployee(@PathVariable(name="employeeId") Long employeeId){
        return employeeService.getEmployee(employeeId);
    }

    @DeleteMapping("/api/employees/{employeeId}")
    public void deleteEmployee(@PathVariable(name="employeeId") Long employeeId){
        employeeService.deleteEmployee(employeeId);
        LOGGER.info("employee:{} deleted suceussfully", employeeId);
    }

    @PutMapping("/api/employees/{employeeId}")
    public void updateEmployee(@RequestBody Employee employee,
            @PathVariable(name="employeeId") Long employeeId){
        Employee emp = employeeService.getEmployee(employeeId);
        if(emp != null){
            employeeService.updateEmployee(employee);
            LOGGER.info("employee:{} deleted suceussfully", employeeId);
        }
    }
}
