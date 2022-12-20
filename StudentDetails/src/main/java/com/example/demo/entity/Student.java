package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studentId;
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentDept=" + studentDept
				+ "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studentId, String studentName, String studentDept) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentDept = studentDept;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentDept() {
		return studentDept;
	}
	public void setStudentDept(String studentDept) {
		this.studentDept = studentDept;
	}
	private String studentName;
	private String studentDept;
	

}
