package com.witsoftware.dicr.java.challenge.calculator.rabbitmq.configuration;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfigurationImpl implements IRabbitMQConfiguration {

	@Override
	@Bean
	public Queue queueA() {
		return new Queue("queue.A", false);
	}
	
	@Override
	public Queue queueB() {
		return new Queue("queue.B", false);
	}

	@Override
	@Bean
	public TopicExchange exchange() {
		return new TopicExchange("exchange.topic");
	}

	@Override
	@Bean
	public Binding binding(Queue queueA, TopicExchange topicExchange) {
		return BindingBuilder.bind(queueA).to(topicExchange).with("routing.A");
	}

	@Override
	public Binding bindingB(Queue queueB, TopicExchange topicExchange) {
		return BindingBuilder.bind(queueB).to(topicExchange).with("routing.B");
	}

	@Override
	@Bean
	public MessageConverter messageConverter() {
		return new Jackson2JsonMessageConverter();
	}

	@Override
	@Bean
	public RabbitTemplate rabbitTemplate(ConnectionFactory connectionFactory) {
		RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
		rabbitTemplate.setMessageConverter(messageConverter());
		return rabbitTemplate;
	}


}
