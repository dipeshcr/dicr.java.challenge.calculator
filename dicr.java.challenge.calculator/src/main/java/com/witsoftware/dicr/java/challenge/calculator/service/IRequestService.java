package com.witsoftware.dicr.java.challenge.calculator.service;

import com.witsoftware.dicr.java.challenge.calculator.model.dto.ArithmeticResponse;

public interface IRequestService {

	public abstract void sendSumRequestResponse(final ArithmeticResponse arithmeticResponse);
	
	public abstract void sendSubtractionRequestResponse(final ArithmeticResponse arithmeticResponse);
	
	public abstract void sendDivisionRequestResponse(final ArithmeticResponse arithmeticResponse);
	
	public abstract void sendMultiplicationRequestResponse(final ArithmeticResponse arithmeticResponse);

}
