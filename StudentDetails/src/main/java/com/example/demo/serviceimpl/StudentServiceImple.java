package com.example.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Student;
import com.example.demo.repository.Studentrepo;
import com.example.demo.service.studentsServices;

@Service
public class StudentServiceImple implements studentsServices {

	@Autowired

	private Studentrepo studentrepo;

	@Override
	public List<Student> GetallStudent() {
		// TODO Auto-generated method stub
		return studentrepo.findAll();
	}

	@Override
	public Student getById(int id) throws Exception {
		return studentrepo.findById(id).orElseThrow(() -> new Exception("id dosen't exits"));
	}

	@Override
	public Student AddDetails(Student student) {
		// TODO Auto-generated method stub
		return studentrepo.save(student);

	}

	@Override
	public Student Update(int id, Student name) throws Exception {
		// TODO Auto-generated method stub
		Student c = studentrepo.findById(id).orElseThrow(() -> new Exception("id dosen't exits"));
		c.setStudentId(name.getStudentId());
		c.setStudentDept(name.getStudentDept());
		c.setStudentName(name.getStudentName());
		studentrepo.save(c);
		return name;
	}

	@Override
	public void Deletedata(int id) {
		// TODO Auto-generated method stub
		studentrepo.deleteById(id);

	}

	@Override
	public List<Student> getdatabyname(String studentName) {
		// TODO Auto-generated method stub
		return studentrepo.findBystudentName(studentName);
	}

	@Override
	public List<Student> allPagination(int pageNo, int PageSize, String sortBy) {
		// TODO Auto-generated method stub
		Pageable p = PageRequest.of(pageNo - 1, PageSize, Sort.by(sortBy).ascending());
		Page<Student> S = studentrepo.findAll(p);

		List<Student> page = S.getContent();
		return page;
	}

}
