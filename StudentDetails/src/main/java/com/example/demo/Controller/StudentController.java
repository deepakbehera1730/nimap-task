package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.studentsServices;

@RestController
public class StudentController {
	@Autowired
	private studentsServices services;

	@GetMapping("/getall")
	public List<Student> getStudentAll() {

		return services.GetallStudent();
	}

	@PostMapping("/addstudentdata")
	public ResponseEntity<String> Addstudent(@RequestBody Student student)

	{

		services.AddDetails(student);
		return ResponseEntity.ok().body("addstudentsuccesfull");

	}

	@GetMapping("/getbyid/{id}")
	public Student getdatabyid(@PathVariable int id) throws Exception {
		return services.getById(id);
	}

	@PutMapping("/updatebyid/{id}")
	public String updatedata(@PathVariable int id, @RequestBody Student student) throws Exception {

		services.Update(id, student);
		return "Update Succesfully";
	}

	@DeleteMapping("/Delete/{id}")
	public String Delete(@PathVariable int id) {
		services.Deletedata(id);

		return "Delete";
	}

	@GetMapping("/{name}")
	public List<Student> getbyname(@PathVariable String studentName) {
		return services.getdatabyname(studentName);

	}

	@GetMapping("/{pageNo}/{pageSize}/{sortBy}")
	public List<Student> Pegination(@PathVariable int pageNo, @PathVariable int pageSize, @PathVariable String sortBy)

	{
		return services.allPagination(pageNo, pageSize, sortBy);
	}
	@GetMapping("getdata")
	public Student getparam(@RequestParam int id) throws Exception
	{
		return services.getById(id);
	}

}
