package com.cemployee.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cemployee.entity.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer>{

}
