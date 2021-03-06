package com.phearun.service;

import java.util.List;

import com.phearun.model.Student;
import com.phearun.utility.Paging;

public interface StudentService {
	
	List<Student> findAll();
	
	List<Student> findAll(Paging paging);
	
	Student findOne(int id);
	
	boolean remove(int id);
	
	boolean save(Student student);
	
	boolean update(Student student);
	
}
