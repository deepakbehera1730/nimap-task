package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Student;

public interface studentsServices {

	public List<Student> GetallStudent();

	public Student getById(int id);

	public Student AddDetails(Student student);

	public Student Update(int id, Student name) throws Exception
	;

	public void Deletedata(int id);
	
	public List<Student> getdatabyname(String name);
	public List<Student> allPagination(int pageNo,int PageSize,String sortBy);

}
