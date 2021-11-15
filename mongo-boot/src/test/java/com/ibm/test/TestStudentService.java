package com.ibm.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.ibm.model.Student;
import com.ibm.service.StudentService;

@ExtendWith(SpringExtension.class)
public class TestStudentService {
	
	@Autowired
	private StudentService service;
	
	@Test
	public void testSave() {
		Student s1 = new Student();
		s1.setRollNo(987);
		s1.setName("Rashi");
		s1.setSchool("DPS");
		
		service.save(s1);
	}
	
	@Test
	public void testFetch() {
		Student s1 = service.fetch(987);
		assertNotNull(s1);
	}

	@Test
	public void testInvalidFetch() {
		Student s1 = service.fetch(9876);
		assertNull(s1);
		
	}
	@Test
	public void testFetchAll() {
		List<Student> student = service.fetchAll();
				assertNotNull(student);
	}
}