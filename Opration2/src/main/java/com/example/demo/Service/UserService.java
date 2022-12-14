package com.example.demo.Service;

import java.util.List;

import com.example.demo.entity.Userss;

public interface UserService {
	  public List<Userss> getAll();
	  public Userss getById(int id);
	  public Userss addEntity(Userss entity);
	  public Userss updateEntity(int id,Userss entity);
	  public void deleteEntity(int id);
	  


}
