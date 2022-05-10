package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "airline_cart")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cartId;
	private Long flightId;
	private String flightName;
	private String from;
	private String to;
	private Long price;
	private String paymentType;
	private String Name;
	private String email;
	private int offerAdded;
	
	
}
