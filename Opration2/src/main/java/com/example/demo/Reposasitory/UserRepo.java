package com.example.demo.Reposasitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Userss;

@Repository
public interface UserRepo extends JpaRepository<Userss, Integer> {
	
	Userss findById(int id); 
	Userss deleteById(int id);
}
