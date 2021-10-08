package com.witsoftware.dicr.java.challenge.calculator.service;

import java.math.BigDecimal;

public interface IArithmeticOperationService {

	public abstract BigDecimal add(final BigDecimal numberOne, final BigDecimal numberTwo);
	
	public abstract BigDecimal subtract(final BigDecimal numberOne, final BigDecimal numberTwo);

	public abstract BigDecimal divide(final BigDecimal numberOne, final BigDecimal numberTwo);

	public abstract BigDecimal multiply(final BigDecimal numberOne, final BigDecimal numberTwo);


}
