package com.sabbir;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sabbir.model.Employee;
import com.sabbir.service.EmployeeService;

public class EmployeeMain {

	public static void main(String[] args) {
		System.out.println("Load Context");
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee em = new Employee();
		em.setId("123");
		em.setName("John");
		em.setAge(35);
		EmployeeService emService = (EmployeeService) context.getBean("employeeService");
		emService.persistEmployee(em);
		System.out.println("Updated age :" + emService.findEmployeeById("123").getAge());		
		em.setAge(32);
		emService.updateEmployee(em);
		System.out.println("Updated age :" + emService.findEmployeeById("123").getAge());
		emService.deleteEmployee(em);
		context.close();
	}
}
