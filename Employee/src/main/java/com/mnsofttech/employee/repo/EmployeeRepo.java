package com.mnsofttech.employee.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mnsofttech.employee.model.Employee;
@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
