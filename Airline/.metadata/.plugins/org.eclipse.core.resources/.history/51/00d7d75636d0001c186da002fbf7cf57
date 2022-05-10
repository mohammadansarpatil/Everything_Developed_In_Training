package com.entity;

import java.sql.Date;
import java.sql.Time;

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
	private Long cartFlightId;
	private String cartFlightName;
	private String cartFrom;
	private String cartTo;
	private Date cartDepartureDate;
	private Date cartArrivalDate;
	private Time cartDepartureTime;
	private Time cartArrivalTime;
	private Long cartPrice;
	private String paymentType;
	private String cartUserName;
	private String cartEmail;
	private int offerAdded;
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cart(int cartId, Long cartFlightId, String cartFlightName, String cartFrom, String cartTo,
			Date cartDepartureDate, Date cartArrivalDate, Time cartDepartureTime, Time cartArrivalTime, Long cartPrice,
			String paymentType, String cartUserName, String cartEmail, int offerAdded) {
		super();
		this.cartId = cartId;
		this.cartFlightId = cartFlightId;
		this.cartFlightName = cartFlightName;
		this.cartFrom = cartFrom;
		this.cartTo = cartTo;
		this.cartDepartureDate = cartDepartureDate;
		this.cartArrivalDate = cartArrivalDate;
		this.cartDepartureTime = cartDepartureTime;
		this.cartArrivalTime = cartArrivalTime;
		this.cartPrice = cartPrice;
		this.paymentType = paymentType;
		this.cartUserName = cartUserName;
		this.cartEmail = cartEmail;
		this.offerAdded = offerAdded;
	}
	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", cartFlightId=" + cartFlightId + ", cartFlightName=" + cartFlightName
				+ ", cartFrom=" + cartFrom + ", cartTo=" + cartTo + ", cartDepartureDate=" + cartDepartureDate
				+ ", cartArrivalDate=" + cartArrivalDate + ", cartDepartureTime=" + cartDepartureTime
				+ ", cartArrivalTime=" + cartArrivalTime + ", cartPrice=" + cartPrice + ", paymentType=" + paymentType
				+ ", cartUserName=" + cartUserName + ", cartEmail=" + cartEmail + ", offerAdded=" + offerAdded
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public Long getCartFlightId() {
		return cartFlightId;
	}
	public void setCartFlightId(Long cartFlightId) {
		this.cartFlightId = cartFlightId;
	}
	public String getCartFlightName() {
		return cartFlightName;
	}
	public void setCartFlightName(String cartFlightName) {
		this.cartFlightName = cartFlightName;
	}
	public String getCartFrom() {
		return cartFrom;
	}
	public void setCartFrom(String cartFrom) {
		this.cartFrom = cartFrom;
	}
	public String getCartTo() {
		return cartTo;
	}
	public void setCartTo(String cartTo) {
		this.cartTo = cartTo;
	}
	public Date getCartDepartureDate() {
		return cartDepartureDate;
	}
	public void setCartDepartureDate(Date cartDepartureDate) {
		this.cartDepartureDate = cartDepartureDate;
	}
	public Date getCartArrivalDate() {
		return cartArrivalDate;
	}
	public void setCartArrivalDate(Date cartArrivalDate) {
		this.cartArrivalDate = cartArrivalDate;
	}
	public Time getCartDepartureTime() {
		return cartDepartureTime;
	}
	public void setCartDepartureTime(Time cartDepartureTime) {
		this.cartDepartureTime = cartDepartureTime;
	}
	public Time getCartArrivalTime() {
		return cartArrivalTime;
	}
	public void setCartArrivalTime(Time cartArrivalTime) {
		this.cartArrivalTime = cartArrivalTime;
	}
	public Long getCartPrice() {
		return cartPrice;
	}
	public void setCartPrice(Long cartPrice) {
		this.cartPrice = cartPrice;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getCartUserName() {
		return cartUserName;
	}
	public void setCartUserName(String cartUserName) {
		this.cartUserName = cartUserName;
	}
	public String getCartEmail() {
		return cartEmail;
	}
	public void setCartEmail(String cartEmail) {
		this.cartEmail = cartEmail;
	}
	public int getOfferAdded() {
		return offerAdded;
	}
	public void setOfferAdded(int offerAdded) {
		this.offerAdded = offerAdded;
	}
	
	
	
	
}
