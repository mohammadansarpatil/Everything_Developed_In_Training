package com.exception;

import java.util.List;

public class ErrorResponse {
	
	private String message;
	private List<String>details;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<String> getDetails() {
		return details;
	}
	public void setDetails(List<String> details) {
		this.details = details;
	}
	@Override
	public String toString() {
		return "ErrorResponse [message=" + message + ", details=" + details + "]";
	}
	public ErrorResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ErrorResponse(String message, List<String> details) {
		super();
		this.message = message;
		this.details = details;
	}
	
	

}
