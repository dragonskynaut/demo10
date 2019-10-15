package com.example.demo10;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name="EMPLOYEE")
public class Employee {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "salary")
    private Integer salary;
    @Column(name = "department")
    private String department;
}
