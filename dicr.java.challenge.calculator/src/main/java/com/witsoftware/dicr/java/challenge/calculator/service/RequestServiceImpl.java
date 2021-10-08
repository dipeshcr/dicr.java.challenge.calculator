package com.witsoftware.dicr.java.challenge.calculator.service;

import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.witsoftware.dicr.java.challenge.calculator.model.dto.ArithmeticResponse;

@Service
public class RequestServiceImpl implements IRequestService {

	@Autowired
	private RabbitTemplate rabbitTemplate;

	@Autowired
	private TopicExchange topicExchange;

	@Override
	public void sendSumRequestResponse(ArithmeticResponse arithmeticResponse) {
		rabbitTemplate.convertAndSend(topicExchange.getName(), "routing.B", arithmeticResponse);
	}

	@Override
	public void sendSubtractionRequestResponse(ArithmeticResponse arithmeticResponse) {
		rabbitTemplate.convertAndSend(topicExchange.getName(), "routing.B", arithmeticResponse);

	}

	@Override
	public void sendDivisionRequestResponse(ArithmeticResponse arithmeticResponse) {
		rabbitTemplate.convertAndSend(topicExchange.getName(), "routing.B", arithmeticResponse);

	}

	@Override
	public void sendMultiplicationRequestResponse(ArithmeticResponse arithmeticResponse) {
		rabbitTemplate.convertAndSend(topicExchange.getName(), "routing.B", arithmeticResponse);

	}

}
