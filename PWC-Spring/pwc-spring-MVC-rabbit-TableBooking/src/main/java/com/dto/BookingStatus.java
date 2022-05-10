package com.dto;

public class BookingStatus {
	
	private TableBooking tableBooking;
	private String bookingStatus;
	private String restaurantMessage;
	public TableBooking getTableBooking() {
		return tableBooking;
	}
	public void setTableBooking(TableBooking tableBooking) {
		this.tableBooking = tableBooking;
	}
	public String getBookingStatus() {
		return bookingStatus;
	}
	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
	public String getRestaurantMessage() {
		return restaurantMessage;
	}
	public void setRestaurantMessage(String restaurantMessage) {
		this.restaurantMessage = restaurantMessage;
	}
	@Override
	public String toString() {
		return "BookingStatus [tableBooking=" + tableBooking + ", bookingStatus=" + bookingStatus
				+ ", restaurantMessage=" + restaurantMessage + "]";
	}
	public BookingStatus(TableBooking tableBooking, String bookingStatus, String restaurantMessage) {
		super();
		this.tableBooking = tableBooking;
		this.bookingStatus = bookingStatus;
		this.restaurantMessage = restaurantMessage;
	}
	public BookingStatus() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
