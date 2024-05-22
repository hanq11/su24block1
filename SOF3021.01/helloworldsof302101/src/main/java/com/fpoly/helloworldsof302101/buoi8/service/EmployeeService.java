package com.fpoly.helloworldsof302101.buoi8.service;

import com.fpoly.helloworldsof302101.buoi8.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {
    private List<Employee> list = Arrays.asList(
            new Employee("Nguyen Van A"),
            new Employee("Nguyen Van B")
    );

    public List<Employee> getAll() {
        return list;
    }
}
