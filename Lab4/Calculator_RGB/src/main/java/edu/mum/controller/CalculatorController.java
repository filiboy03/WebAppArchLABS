package edu.mum.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.mum.domain.Calculator;
import edu.mum.service.CalculatorService;
import edu.mum.validator.CalculatorValidator;

@Controller
public class CalculatorController  {

	
	@Autowired
	CalculatorValidator calculatorValidator;
	
	@Autowired
	CalculatorService calculatorService;
	
	@RequestMapping(value={"/","/calculator"})
	  public String inputCalc(Calculator calculator,Model model)   {		  
	       return  "CalculatorForm" ;    
	   }
	   
	  @RequestMapping(value={"/calculatorSave"},method = RequestMethod.POST)
	  public String Calc(Calculator calculator, RedirectAttributes ra,Model model )   {
	  
 		  
 	        List<String> errors = calculatorValidator.validate(calculator);
 	        if (errors.isEmpty()) {
 	        	
			     calculatorService.add(calculator);
 			     calculatorService.mult(calculator);
 			    	        	 
 			     ra.addFlashAttribute("calculator", calculator);
 			     ra.addFlashAttribute("message", "HelloCalculator");
  	          
 	            return "redirect:/calculatorSave";
 	        } else {
 	  
 	        	model.addAttribute("errors", errors);
 	        	model.addAttribute("calculator", calculator);
 	         
 	            return "CalculatorForm";
 	        }

  	   }
	   


@RequestMapping(value={"/calculatorSave"},method = RequestMethod.GET)
public String Calc()   {
        
           return "CalculatorView";
   }
 
}

