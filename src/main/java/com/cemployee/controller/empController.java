package com.cemployee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.cemployee.entity.Employee;
import com.cemployee.service.empService;

import jakarta.servlet.http.HttpSession;

@Controller
public class empController {
	@Autowired
	private empService service;

	
	@GetMapping("/")
	public String hoome(Model model) {
		List<Employee> emp = service.getAllEmp();
		model.addAttribute("emp",emp);
		return "Index";
	}

	@GetMapping("/emp")
	public String emp() {
		return "emp";
	}

	@PostMapping("/register")
	public String register(@ModelAttribute Employee e, HttpSession session) {
		service.addEmp(e);
		session.setAttribute("msg", "Employee added sucessfully");
		return "redirect:/";
	}
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") int id, Model m) {
		
		Employee e = service.getElementById(id);
		m.addAttribute("emp", e);
		return "edit";
	}
	@PostMapping("/update")
	public String upodate(@ModelAttribute Employee e ,HttpSession session)
	{
		session.setAttribute("msg", "Emp data has been updated Sucessfully");
		service.addEmp(e);
		return "redirect:/";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") int id, HttpSession session )
	{
		service.delete(id);
		session.setAttribute("msg", "Emp Deleted sucessfully");
		return"redirect:/";
	}
	
}
