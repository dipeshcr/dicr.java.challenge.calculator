package com.witsoftware.dicr.java.challenge.calculator.model.dto;

import java.math.BigDecimal;

import com.witsoftware.dicr.java.challenge.calculator.model.ArithmeticOperationType;

public class ArithmeticRequest {

	private String requestUUID;
	private BigDecimal numberOne;
	private BigDecimal numberTwo;
	private ArithmeticOperationType arithmeticOperationType;


	public BigDecimal getNumberOne() {
		return numberOne;
	}

	public void setNumberOne(BigDecimal numberOne) {
		this.numberOne = numberOne;
	}

	public BigDecimal getNumberTwo() {
		return numberTwo;
	}

	public void setNumberTwo(BigDecimal numberTwo) {
		this.numberTwo = numberTwo;
	}

	public String getRequestUUID() {
		return requestUUID;
	}

	public void setRequestUUID(String requestUUID) {
		this.requestUUID = requestUUID;
	}

	public ArithmeticOperationType getArithmeticOperationType() {
		return arithmeticOperationType;
	}

	public void setArithmeticOperationType(ArithmeticOperationType arithmeticOperationType) {
		this.arithmeticOperationType = arithmeticOperationType;
	}
}
