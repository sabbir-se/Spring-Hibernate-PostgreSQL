package com.sabbir.dao;

import com.sabbir.model.Employee;

public interface EmployeeDao {
	void persistEmployee(Employee employee);
	Employee findEmployeeById(String id);
	void updateEmployee(Employee employee);
	void deleteEmployee(Employee employee);
}
