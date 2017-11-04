package mum.edu.service;

import java.util.List;

import mum.edu.domain.User;

 

 public interface UserService   {
	
	public List<User> getAll();
	
	public User findByName(String name);
	
	
		   
}
 
