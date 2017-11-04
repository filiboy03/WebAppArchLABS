package edu.mum.validator;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public interface  CalculatorValidator  {
	
	public List<String> validate(Object  object ) ;
}
