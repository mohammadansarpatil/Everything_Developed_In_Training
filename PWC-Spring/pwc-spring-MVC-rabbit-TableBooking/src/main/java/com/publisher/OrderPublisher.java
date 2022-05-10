package com.publisher;

import java.util.UUID;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.config.MessageConfig;
import com.dto.BookingStatus;
import com.dto.TableBooking;

@RestController
@RequestMapping("/book")
public class OrderPublisher {
	
	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	@PostMapping("/booktable/{rest}")
	public String bookOrder(@RequestBody TableBooking tableBooking, @PathVariable("rest") String rest) {
		tableBooking.setBookingId(UUID.randomUUID().toString());
		BookingStatus bookingStatus= new BookingStatus(tableBooking, "PROCESS" , "Order placed successfully..." + rest);
		rabbitTemplate.convertAndSend(MessageConfig.EXCHANGE , MessageConfig.ROUTING_KEY, bookingStatus);
		
		return "ORDER SUCCESS...";
	}

}
