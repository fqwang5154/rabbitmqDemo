package com.example.demo.common;

import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

public class CommonUtil {

	private static RabbitTemplate template = null;

	public static synchronized RabbitTemplate getRabbitTemplate() {
		if (template == null) {
			CachingConnectionFactory factory = new CachingConnectionFactory();
			factory.setHost("10.14.47.239");
			factory.setPort(5672);
			factory.setVirtualHost("/vhost_ly");
			factory.setUsername("ly");
			factory.setPassword("Pass8183");
			factory.afterPropertiesSet();
			// factory.destroy();
			// factory.setConnectionLimit(1);
			template = new RabbitTemplate(factory);
		}
		return template;
	}
}
