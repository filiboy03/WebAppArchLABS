package edu.mum.validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import edu.mum.domain.Calculator;


@Component
public class CalculatorValidatorImpl implements CalculatorValidator {
	
	@Override
	public List<String> validate(Object  object ) {
		List<String> errors = new ArrayList<String>();
		
		Calculator calculator = (Calculator) object;

 		
	 	if (calculator.getAdd1() == null) {
			errors.add("Add operands must have a value");
		} 
			
 		if (calculator.getAdd2() == null) {
			errors.add("Add operands must have a value");
		} 
 		if (calculator.getMult1() == null) {
			errors.add("Multiply operands must have a value");
		} 
		
 		if (calculator.getMult2() == null) {
			errors.add("Multiply operands must have a value");
		} 
		
		
		return errors;
	}
}
