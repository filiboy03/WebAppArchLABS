package edu.mum.service;

import org.springframework.stereotype.Service;

import edu.mum.domain.Calculator;
@Service
public interface CalculatorService {
	
	public void add(Calculator calculator);
	
	public void mult(Calculator calculator);
}
