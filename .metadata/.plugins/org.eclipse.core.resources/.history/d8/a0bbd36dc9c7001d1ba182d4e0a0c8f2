package com.simplilearn.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.demo.entity.Admin;

import com.simplilearn.demo.repo.AdminRepo;

@Service
public class AdminService {
	
	@Autowired
	private AdminRepo repo;
	
	public Admin addAdmin(Admin u) {
		return repo.save(u);
	}
	
	public List<Admin> getAllAdmin(){
		return repo.findAll();
	}
	
	public Admin getAdminById(int id) {
		if(repo.findById(id).isPresent()) {
			return repo.findById(id).get();
		}
		else {
			return null;
		}
		
	}
	public boolean deleteAdmin(int id) {
		if(repo.findById(id).isPresent()) {
			repo.deleteById(id);
			return true;
		}
		
		else {
			return false;
		}
	}
	

}
