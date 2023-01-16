package com.example.manageemployee.Service;

import com.example.manageemployee.DAO.EmployeeDao;
import com.example.manageemployee.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeService {
    @Autowired
    EmployeeDao employeeDao;

    public List<Employee> getAll() {
        return employeeDao.getAll();
    }
}
