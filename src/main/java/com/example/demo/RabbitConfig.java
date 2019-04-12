package com.example.demo;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

	@Bean
	public Queue queue() {
		System.out.println("===================simple_queue===================");
		return new Queue("simple_queue");
	}
}
