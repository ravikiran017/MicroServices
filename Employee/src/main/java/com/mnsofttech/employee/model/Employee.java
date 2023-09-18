package com.mnsofttech.employee.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue
	private Integer empId;
	@Column
	private String empName;
	@Column
	private Integer empSal;

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Integer getEmpSal() {
		return empSal;
	}

	public void setEmpSal(Integer empSal) {
		this.empSal = empSal;
	}

}
