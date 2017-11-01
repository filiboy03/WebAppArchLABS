package mum.edu.controller;

import mum.edu.domain.User;
import mum.edu.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
/**
 * Servlet implementation class AuthenticationServlet
 */
@Controller
public class LoginController   {
 
 
 	  @Autowired
	  UserService userService;
 
	  /**
	   * Landing page method - Login facility
	   * @return
	   * @throws Exception
	   */
	  @RequestMapping (value={"/","/login"},method = RequestMethod.GET)
	  public String Login( ) throws Exception {

	       return  "login" ;    

	}

	  @RequestMapping (value="login",method = RequestMethod.POST)
	  public String Authenticate( User loginUser) throws Exception {

		User user = userService.findByName(loginUser.getName());
		
		if(user == null || !user.getPassword().equals(loginUser.getPassword())) {
				
			throw new RuntimeException("Username or Password is invalid");
		} 

		return "LoginSuccessful";
//		return "redirect:advice";
	}

}
