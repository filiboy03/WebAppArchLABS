package mum.edu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mum.edu.domain.User;
import mum.edu.repository.UserRepository;
import mum.edu.service.UserService;

 
@Service
 public class UserServiceImpl implements UserService  {
	
	@Autowired 
	UserRepository userRepository;
	
	public List<User> getAll() {
		return userRepository.getAll();
	}
	
	public User findByName(String name) {
		return userRepository.findByName(name);
	}
	
	
		   
}
 
