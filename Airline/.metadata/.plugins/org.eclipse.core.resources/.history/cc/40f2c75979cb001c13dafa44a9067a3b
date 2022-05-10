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
@Table(name = "airline_offers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Offers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int offerId;
	private String from;
	private String to;
	private int discount;
	
}
