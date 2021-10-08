package com.witsoftware.dicr.java.challenge.calculator.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.springframework.stereotype.Service;

@Service
public class ArithmeticOperationServiceImpl implements IArithmeticOperationService {

	@Override
	public BigDecimal add(BigDecimal numberOne, BigDecimal numberTwo) {
		return numberOne.add(numberTwo);
	}

	@Override
	public BigDecimal subtract(BigDecimal numberOne, BigDecimal numberTwo) {
		return numberOne.subtract(numberTwo);
	}

	@Override
	public BigDecimal divide(BigDecimal numberOne, BigDecimal numberTwo) {
		return numberOne.divide(numberTwo).setScale(2, RoundingMode.HALF_UP);
	}

	@Override
	public BigDecimal multiply(BigDecimal numberOne, BigDecimal numberTwo) {
		return numberOne.multiply(numberTwo);
	}

}
