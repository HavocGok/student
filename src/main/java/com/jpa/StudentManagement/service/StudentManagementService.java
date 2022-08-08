package com.jpa.StudentManagement.service;

import com.jpa.StudentManagement.Dao.StudentManagementDao;
import com.jpa.StudentManagement.entity.Student;

public class StudentManagementService {
	private StudentManagementDao sdao;
	
	public String addStudent(Student s)
	{
		return sdao.insertStudentDetails(s);
	}
	
	public Student viewStudent(int enrollNo)
	{
		return sdao.getStudent(enrollNo);
	}
	
	public String updateStudent(int enrollNo,String property,String value)
	{
		return sdao.updateStudentDetails(enrollNo, property, value);
	}
	
	public String deleteStudent(int enrollNo) {
		return sdao.deleteStudent(enrollNo);
	}
}
