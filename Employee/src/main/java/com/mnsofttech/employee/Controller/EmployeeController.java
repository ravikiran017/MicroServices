package com.mnsofttech.employee.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.mnsofttech.employee.model.Employee;
import com.mnsofttech.employee.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@PostMapping("/add")
	public Employee addEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}
//
//	@GetMapping("/feach")
//	public List<Employee> findAllemployee()
//
//	{
//		return employeeService.findAll();
//	}
//
//	@GetMapping("/get/{id}")
//	public Optional<Employee> findById(@PathVariable Integer id, RequestBody Employee) {
//		return employeeService.findById(id);
//
//	}
//
//	@GetMapping("/fetch/{empId}")
//	public Employee getCustomer(@PathVariable int empId) {
//		return employeeService.getEmployee(empId);
//	}
//
//	@PutMapping("/edit")
//	public String updateCustomer(@RequestBody Employee employee) {
//		return employeeService.updateCustomer(employee);
//	}
//
//	@DeleteMapping("/delete/{custId}")
//	public String deleteCustomer(@PathVariable int custId) {
//		return employeeService.deleteCustomer(custId);
//	}
}
