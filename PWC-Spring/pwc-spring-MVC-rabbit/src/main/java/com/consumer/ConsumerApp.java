package com.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.config.MessageConfig;
import com.dto.OrderStatus;

@Component
public class ConsumerApp {
	@RabbitListener(queues = MessageConfig.QUEUE)
	public void consumerMessage(OrderStatus orderStatus) {
		System.out.println("Message taken from queue "+ orderStatus);
	}

}
