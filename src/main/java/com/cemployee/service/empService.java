package com.cemployee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cemployee.entity.Employee;
import com.cemployee.repo.EmpRepo;

@Component
public class empService {

	@Autowired
	private EmpRepo repo;
	
	public void addEmp(Employee e)
	{
		repo.save(e);
	}
	public List<Employee> getAllEmp()
	{
		return repo.findAll();
	}
	public Employee getElementById(int id)
	{
	Optional<Employee> emp =  repo.findById(id);
	if(emp.isPresent())
	{
		return emp.get();
	}
	return null;
	}
	public void delete(int id)
	{
		repo.deleteById(id);
	}
}
