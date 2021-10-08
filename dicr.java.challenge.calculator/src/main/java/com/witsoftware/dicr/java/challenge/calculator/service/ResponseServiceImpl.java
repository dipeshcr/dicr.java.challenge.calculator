package com.witsoftware.dicr.java.challenge.calculator.service;

import java.math.BigDecimal;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.witsoftware.dicr.java.challenge.calculator.model.dto.ArithmeticRequest;
import com.witsoftware.dicr.java.challenge.calculator.model.dto.ArithmeticResponse;
import com.witsoftware.dicr.java.challenge.calculator.transformer.IResultTransformer;

@Service
public class ResponseServiceImpl implements IResponseServiceService {

	@Autowired
	private IArithmeticOperationService arithmeticOperationService;

	@Autowired
	private IRequestService requestServiceImpl;

	@Autowired
	private IResultTransformer resultTransformer;

	@Override
	@RabbitListener(queues = "queue.A")
	public void processArithmeticRequest(ArithmeticRequest arithmeticRequest) {

		ArithmeticResponse arithmeticResponse = new ArithmeticResponse();
		arithmeticResponse.setRequestUUID(arithmeticRequest.getRequestUUID());
		arithmeticResponse.setNumberOne(arithmeticRequest.getNumberOne());
		arithmeticResponse.setNumberTwo(arithmeticRequest.getNumberTwo());

		BigDecimal result = BigDecimal.ZERO;

		switch (arithmeticRequest.getArithmeticOperationType()) {
		case ADDITION:
			result = arithmeticOperationService.add(arithmeticRequest.getNumberOne(), arithmeticRequest.getNumberTwo());
			resultTransformer.transformToDTO(result);
			arithmeticResponse.setResultDTO(resultTransformer.transformToDTO(result));
			this.requestServiceImpl.sendSumRequestResponse(arithmeticResponse);
			break;

		case SUBTRACTION:
			result = arithmeticOperationService.subtract(arithmeticRequest.getNumberOne(),
					arithmeticRequest.getNumberTwo());
			resultTransformer.transformToDTO(result);
			arithmeticResponse.setResultDTO(resultTransformer.transformToDTO(result));
			this.requestServiceImpl.sendSubtractionRequestResponse(arithmeticResponse);
			break;

		case MULTIPLICATION:
			result = arithmeticOperationService.multiply(arithmeticRequest.getNumberOne(),
					arithmeticRequest.getNumberTwo());
			resultTransformer.transformToDTO(result);
			arithmeticResponse.setResultDTO(resultTransformer.transformToDTO(result));
			this.requestServiceImpl.sendMultiplicationRequestResponse(arithmeticResponse);
			break;

		case DIVISION:
			result = arithmeticOperationService.divide(arithmeticRequest.getNumberOne(),
					arithmeticRequest.getNumberTwo());
			resultTransformer.transformToDTO(result);
			arithmeticResponse.setResultDTO(resultTransformer.transformToDTO(result));
			this.requestServiceImpl.sendDivisionRequestResponse(arithmeticResponse);
			break;

		}
	}

}
