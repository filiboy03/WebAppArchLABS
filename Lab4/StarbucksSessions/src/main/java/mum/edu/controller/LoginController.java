package mum.edu.controller;

import mum.edu.domain.User;
import mum.edu.service.UserService;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
 
/**
 * Servlet implementation class AuthenticationServlet
 */
@SessionAttributes("filisession")
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

	  @RequestMapping (value={"/login"},method = RequestMethod.POST)
	  public String Authenticate( User loginUser,RedirectAttributes redirect) throws Exception {

		User user = userService.findByName(loginUser.getName());
		
		if(user == null || !user.getPassword().equals(loginUser.getPassword())) {
				
			throw new RuntimeException("Username or Password is invalid");
		} 
		
		
		redirect.addFlashAttribute("fillisession",user);
		

	
		return "redirect:advice";
	}
	  @RequestMapping (value={"/logout"},method = RequestMethod.GET)
	  public String Logout(SessionStatus status ) throws Exception {

		  status.setComplete();
	       return  "redirect:/login";    

	}

}
