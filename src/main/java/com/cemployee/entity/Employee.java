package com.cemployee.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="emp_data")
public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String namee;
	private String email;
	private String address;
	private String phone;
	private int salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNamee() {
		return namee;
	}

	public void setNamee(String namee) {
		this.namee = namee;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", namee=" + namee + ", email=" + email + ", address=" + address + ", phone="
				+ phone + ", salary=" + salary + "]";
	}

	public Employee(int id, String namee, String email, String address, String phone, int salary) {
		super();
		this.id = id;
		this.namee = namee;
		this.email = email;
		this.address = address;
		this.phone = phone;
		this.salary = salary;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

}
