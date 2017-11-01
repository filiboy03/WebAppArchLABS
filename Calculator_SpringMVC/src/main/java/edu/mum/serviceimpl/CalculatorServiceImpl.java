package edu.mum.serviceimpl;

import org.springframework.stereotype.Service;

import edu.mum.domain.Calculator;
import edu.mum.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {

	@Override
	public void add(Calculator calculator) {
		calculator.add();
	}

	@Override
	public void mult(Calculator calculator) {
		calculator.mult();
		
	}

}
