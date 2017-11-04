package mum.edu.repository;

import java.util.List;

import mum.edu.domain.User;

 public interface UserRepository   {
	
	public List<User> getAll();
	
	public User findByName(String name);
	
	
		   
}
 
