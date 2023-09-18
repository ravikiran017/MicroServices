package com.mnsofttech.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.mnsofttech.employee.model.Employee;
import com.mnsofttech.employee.repo.EmployeeRepo;

@Service
public class EmployeeService 
{

	@Autowired
	EmployeeRepo employeeRepo;
	
	public Employee addEmployee( Employee employee)
	{
		return employeeRepo.save(employee);
	}
//	public List<Employee> getAllEmployee()
//	{
//		return employeeRepo.findAll();
//	}
	
	public Employee getEmployee(@PathVariable int Id)
	{
		return employeeRepo.findById(Id).get();
}
	
	public String updateCustomer(Employee employee)
	{
	Employee emp=employeeRepo.findById(employee.getEmpId()).get();
			
	emp.setEmpName(employee.getEmpName());
			
	emp.setEmpSal(employee.getEmpSal());
			
	employeeRepo.save(emp);
			
	return "Record is updated";
	}
	
	public String deleteCustomer(int empId)
	{
		employeeRepo.deleteById(empId);
		return "Record is deleted";
	}
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return employeeRepo.findAll();
	}
	public Optional<Employee> findById(Integer id) {
		// TODO Auto-generated method stub
		return employeeRepo.findById(id);
	}

}
