package com.dto;

public class TableBooking {
	
	private String bookingId;
	private int noOfPer;
	private String cusine;
	private int starRating;
	public String getBookingId() {
		return bookingId;
	}
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}
	public int getNoOfPer() {
		return noOfPer;
	}
	public void setNoOfPer(int noOfPer) {
		this.noOfPer = noOfPer;
	}
	public String getCusine() {
		return cusine;
	}
	public void setCusine(String cusine) {
		this.cusine = cusine;
	}
	public int getStarRating() {
		return starRating;
	}
	public void setStarRating(int starRating) {
		this.starRating = starRating;
	}
	@Override
	public String toString() {
		return "TableBooking [bookingId=" + bookingId + ", noOfPer=" + noOfPer + ", cusine=" + cusine + ", starRating="
				+ starRating + "]";
	}
	public TableBooking(String bookingId, int noOfPer, String cusine, int starRating) {
		super();
		this.bookingId = bookingId;
		this.noOfPer = noOfPer;
		this.cusine = cusine;
		this.starRating = starRating;
	}
	public TableBooking() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
