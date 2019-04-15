package com.ashiq.EmpSqlServ;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Employee;
import services.Services;

class ControllerTestCase_2 {

	@Test
	void test() {
		Employee e = new Employee("50000", "Bulu", "10", "100", "bulu@gmail.com", "Manhataan");
		Services s = new Services();
		//assertEquals(1,s.addemp(e));
		assertEquals(1,s.serachemp(1001));
	
	}

	
}
