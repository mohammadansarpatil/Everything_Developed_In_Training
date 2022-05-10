package com.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "airline_flights")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Flights {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long flightId;
	private String flightName;
	private String from;
	private String to;
	private Long economicPrice;
	private Long businessPrice;
	private Long firstClassPrice;
	private Date departureDate;
	private Date arrivalDate;
	private Date departureTime;
	private Date arrivalTime;
	public Long getFlightId() {
		return flightId;
	}
	public void setFlightId(Long flightId) {
		this.flightId = flightId;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public Long getEconomicPrice() {
		return economicPrice;
	}
	public void setEconomicPrice(Long economicPrice) {
		this.economicPrice = economicPrice;
	}
	public Long getBusinessPrice() {
		return businessPrice;
	}
	public void setBusinessPrice(Long businessPrice) {
		this.businessPrice = businessPrice;
	}
	public Long getFirstClassPrice() {
		return firstClassPrice;
	}
	public void setFirstClassPrice(Long firstClassPrice) {
		this.firstClassPrice = firstClassPrice;
	}
	public Date getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}
	public Date getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public Date getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}
	public Date getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public Flights(Long flightId, String flightName, String from, String to, Long economicPrice, Long businessPrice,
			Long firstClassPrice, Date departureDate, Date arrivalDate, Date departureTime, Date arrivalTime) {
		super();
		this.flightId = flightId;
		this.flightName = flightName;
		this.from = from;
		this.to = to;
		this.economicPrice = economicPrice;
		this.businessPrice = businessPrice;
		this.firstClassPrice = firstClassPrice;
		this.departureDate = departureDate;
		this.arrivalDate = arrivalDate;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
	}
	public Flights() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Flights [flightId=" + flightId + ", flightName=" + flightName + ", from=" + from + ", to=" + to
				+ ", economicPrice=" + economicPrice + ", businessPrice=" + businessPrice + ", firstClassPrice="
				+ firstClassPrice + ", departureDate=" + departureDate + ", arrivalDate=" + arrivalDate
				+ ", departureTime=" + departureTime + ", arrivalTime=" + arrivalTime + "]";
	}
	
	
	
	
	

}
