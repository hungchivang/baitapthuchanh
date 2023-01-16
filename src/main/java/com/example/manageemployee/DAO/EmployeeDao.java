package com.example.manageemployee.DAO;

import com.example.manageemployee.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import java.util.List;

public class EmployeeDao {
    @Autowired
    EntityManager entityManager;
    public List<Employee> getAll(){
        String sql = "Select e from Employee e";
        List<Employee> employee =  entityManager.createQuery(sql).getResultList();
        return employee;
    }
}
