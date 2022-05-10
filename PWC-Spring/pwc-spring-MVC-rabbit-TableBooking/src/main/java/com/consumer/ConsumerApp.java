package com.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.config.MessageConfig;
import com.dto.BookingStatus;

@Component
public class ConsumerApp {
	@RabbitListener(queues = MessageConfig.QUEUE)
	public void consumerMessage(BookingStatus bookingStatus) {
		System.out.println("Message taken from queue "+ bookingStatus);
	}

}
