package com.witsoftware.dicr.java.challenge.calculator.rabbitmq.configuration;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.MessageConverter;

public interface IRabbitMQConfiguration {

	public abstract Queue queueA();
	
	public abstract Queue queueB();
	
	public abstract TopicExchange exchange(); 
	
	public abstract Binding binding(final Queue queueA, final TopicExchange topicExchange);
	
	public abstract Binding bindingB(final Queue queueB, final TopicExchange topicExchange);
	
	public abstract MessageConverter messageConverter();

	public abstract RabbitTemplate rabbitTemplate(final ConnectionFactory connectionFactory);
}
