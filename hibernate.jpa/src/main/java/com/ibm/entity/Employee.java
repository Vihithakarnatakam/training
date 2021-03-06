package com.ibm.entity;

//import java.util.*;
import javax.persistence.*;

@Entity
@Table(name="emp")
public class Employee {
	@Id
	private int empNo;
	
	@Column(name="ename", length=25)
	private String empName;
	private double salary;
	
	//Each employee belongs to a department
	@ManyToOne
	@JoinColumn(name="deptNo") //joining the deptNo column(from Department java program) to this table
	private Department dept;
	
	//Getters and Setters
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	
}
