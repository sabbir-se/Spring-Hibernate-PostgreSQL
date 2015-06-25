package com.sabbir.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sabbir.dao.EmployeeDao;
import com.sabbir.model.Employee;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired EmployeeDao employeeDao;

	@Transactional
	public void persistEmployee(Employee employee) {
		employeeDao.persistEmployee(employee);
	}

	@Transactional
	public Employee findEmployeeById(String id) {
		return employeeDao.findEmployeeById(id);
	}

	@Transactional
	public void updateEmployee(Employee employee) {
		employeeDao.updateEmployee(employee);
	}

	@Transactional
	public void deleteEmployee(Employee employee) {
		employeeDao.deleteEmployee(employee);
	}
}
