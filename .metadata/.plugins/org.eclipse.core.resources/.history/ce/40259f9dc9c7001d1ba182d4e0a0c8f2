package com.simplilearn.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.demo.entity.Admin;
import com.simplilearn.demo.service.AdminService;


@CrossOrigin("http://localhost:4200")
@RequestMapping("/api/admin")
public class AdminController {
	
	@Autowired
	private AdminService service;
	
	@PostMapping("/")
	public ResponseEntity<Admin> admin(@RequestBody Admin u){
		
		Admin admin= service.addAdmin(u);
		
		if(admin!=null)
			return new ResponseEntity<Admin>(admin,HttpStatus.CREATED);
		else
			return new ResponseEntity<Admin>(admin,HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	@GetMapping("/")
	public List<Admin> getAllAdmin(){
		return service.getAllAdmin();
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String>deleteAdmin(@PathVariable int id){
		boolean result = service.deleteAdmin(id);
		if(result) 
			return new ResponseEntity<String>("Object Deleted",HttpStatus.OK);
		else
			return new ResponseEntity<String>("NO user Found", HttpStatus.NOT_FOUND);
		
	}
 
}
