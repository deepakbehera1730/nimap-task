package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.UserService;
import com.example.demo.entity.Userss;

@RestController
public class UserController {

	@Autowired
	private UserService useService;

	@GetMapping("/getalldata")
	public List<Userss> getdata() {

		return useService.getAll();

	}

	@PostMapping("/add/data")
	public Userss addData(@RequestBody Userss entity) {
		return useService.addEntity(entity);

	}

	@GetMapping("/getbyid/{id}")
	public Userss getById(@PathVariable int id) {

		return useService.getById(id);

	}
	@PutMapping("/update/{id}")
	public Userss  updateData(@PathVariable int id,@RequestBody Userss entity)
	{
		return useService.updateEntity(id, entity);
	}

	@DeleteMapping("/delete/{id}")
	public void Deleteuser(@PathVariable int id) {
		useService.deleteEntity(id);
	}

}
