package com.ibm.test;

import javax.persistence.*;
import org.junit.jupiter.api.*;

import com.ibm.entity.Department;
import com.ibm.entity.EmpDeptRepo;
import com.ibm.entity.Employee;

import java.util.*;


public class TestEmpDept {
	private static EmpDeptRepo repo;
	
	@BeforeAll
	public static void init() {
		repo = new EmpDeptRepo();
	}
	
	@Test
	public void testSaveDept() {
		Department dept = new Department();
		dept.setDeptName("Sales");
		dept.setDeptNo(20);
		repo.saveDept(dept);
	}
	
	@Test
	public void testSaveEmp() {
		Employee emp = new Employee();
		emp.setEmpNo(201);
		emp.setEmpName("Lili");
		emp.setSalary(3500);
		repo.saveEmp(emp, 20);
	}
	
	@Test
	public void testGetDept() {
		Department dept = repo.getDept(20);
		System.out.println("Department:" + dept.getDeptNo() + "-" + dept.getDeptName());
		dept.getEmps();
	}
	
	@Test
	public void testGetEmp() {
		Employee emp = repo.getEmpt(201);
		System.out.println("Employee:" + emp.getEmpNo() + "-" + emp.getEmpName());
		emp.getEmpName();
		}
	
	@Test
	public void testGetAllEmp() {
		Employee emp = repo.getEmpt(201);
		Department dept = repo.getDept(20);
		System.out.println("Employee:" + emp.getEmpNo() + "-" + emp.getEmpName() + " Salary:" + emp.getSalary() + " Dept: " + dept.getDeptNo());
		emp.getClass();
	}
	
	@Test
	public void testGetAllDept() {
		Employee emp = repo.getEmpt(201);
		Department dept = repo.getDept(20);
		System.out.println(" Dept: " + dept.getDeptNo() + "-" + dept.getDeptName() +  " Employee: " + emp.getEmpName());
		emp.getClass();
	}

	
}