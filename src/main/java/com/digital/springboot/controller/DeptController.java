package com.digital.springboot.controller;

import com.digital.springboot.entities.Department;
import com.digital.springboot.entities.Employee;
import com.digital.springboot.mapper.DepartmentMapper;
import com.digital.springboot.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DeptController {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Autowired
    private EmployeeMapper employeeMapper;

    @GetMapping("/dept/{id}")
    public Department getDartment(@PathVariable("id") Integer id){
        return departmentMapper.getDeptById(id);
    }

    @PostMapping("/dept")
    public Department addDept(Department department){
        departmentMapper.insertDept(department);
        return department;
    }

    @GetMapping("/employee/{id}")
    public Employee getEmp(@PathVariable("id") Integer id){
        return employeeMapper.getEmpById(id);
    }



}
