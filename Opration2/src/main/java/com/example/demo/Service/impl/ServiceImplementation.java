package com.example.demo.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Reposasitory.UserRepo;
import com.example.demo.Service.UserService;
import com.example.demo.entity.Userss;

@Service
public class ServiceImplementation implements UserService{

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public List<Userss> getAll() {
		
		return userRepo.findAll();
	}

	@Override
	public Userss getById(int id) {
		// TODO Auto-generated method stu
		return userRepo.findById(id);
	}

	@Override
	public Userss addEntity(Userss entity) {
		
      
//      newUserss.setId(entity.getId());
//      newUserss.setCity(entity.getCity());
//      newUserss.setName(entity.getName());
//      newUserss.setEmail(entity.getEmail());
//      newUserss.setMobileNo(entity.getMobileNo());
//		
		return userRepo.save(entity);
	}

	@Override
	public void deleteEntity(int id) {
		// TODO Auto-generated method stub
		 userRepo.deleteById(id);
		
	}

	@Override
	public Userss updateEntity(int id, Userss entity) {
		// TODO Auto-generated method stub
		 Userss k=userRepo.findById(id);
		 k.setCity(entity.getCity());
		 k.setName(entity.getName());
		 k.setEmail(entity.getEmail());
		 k.setMobileNo(entity.getMobileNo());
		 return userRepo.save(k);
		 
		
	}

}
