package mum.edu.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mum.edu.domain.Calculator;
import mum.edu.framework.annotation.AutoWired;
import mum.edu.framework.annotation.RequestMapping;
import mum.edu.framework.annotation.Controller;
import mum.edu.service.CalculatorService;
import mum.edu.validator.CalculatorValidator;

@Controller
public class CalculatorController implements mum.edu.framework.controller.Controller {

	
	@AutoWired
	CalculatorValidator calculatorValidator;
	
	@AutoWired
	CalculatorService calculatorService;
	
	@RequestMapping(value={"/","/calculator"})
	  public String inputCalc(Calculator calculator)   {		  
	       return  "/WEB-INF/jsp/CalculatorForm.jsp" ;    
	   }
	   
	  @RequestMapping(value="/calculatorSave")
	  public String handleCalc(Calculator calculator, HttpServletRequest request, 
 				HttpServletResponse response )   {
	  
 		  
 	        List<String> errors = calculatorValidator.validate(calculator);
 	        if (errors.isEmpty()) {
 	        	
			     calculatorService.add(calculator);
 			     calculatorService.mult(calculator);
 			    	        	 
  	            request.setAttribute("calculator", calculator);
 	            return "/WEB-INF/jsp/CalculatorView.jsp";
 	        } else {
 	  
 	            // store errors and calculator in a scope variable for the view
 	            request.setAttribute("errors", errors);
 	            request.setAttribute("calculator", calculator);
 	            return "/WEB-INF/jsp/CalculatorForm.jsp";
 	        }

  	   }
	   
}
