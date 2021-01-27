package com.tushar.firstproject.dao;

import com.tushar.firstproject.model.Employee;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeDao extends CrudRepository<Employee, Integer> {
    
}
