package mum.edu.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import mum.edu.service.AdviceService;


@Controller
public class AdviceController  {
	
	  
	  @Autowired
	  AdviceService adviceService;

 		@RequestMapping (value="/advice",method = RequestMethod.GET)
		public String adviceForm(Model model) {
		 
 	
 			Map<Integer,String> roasts = adviceService.getAllRoasts();
 			model.addAttribute("roasts",roasts);
			
			return "advice";
		}

	  @RequestMapping (value="/advice",method = RequestMethod.POST)
	  public String adviceList( Integer roastKey, Model model,SessionStatus status) throws Exception {
		 
		 

		  String roast = adviceService.getRoast(roastKey);
 		List<String> roastList  = adviceService.getListByType(roast);
 
		model.addAttribute("roast",roast);
		model.addAttribute("roastList",roastList);
 		
		return "display" ;
 
	}
	
 
}
