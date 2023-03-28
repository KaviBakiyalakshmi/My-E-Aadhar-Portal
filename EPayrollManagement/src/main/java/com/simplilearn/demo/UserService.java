package com.simplilearn.demo;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserRepo userRepo;
	
	public User addUser(User user)
	{
		user.setEmployeeid(UUID.randomUUID().toString().substring(0, 6));
		return userRepo.save(user);
	}
	
	public List<User> getAllUser()
	{
		return userRepo.findAll();
	}
	
	public User updateUser(User user)
	{
		return userRepo.save(user);
	}
	
	public void deleteUser(Long id)
	{
		userRepo.deleteById(id);
	}
	
	public User getUserById(Long id)
	{
		return userRepo.findById(id).get();
	}
	
	
	

}