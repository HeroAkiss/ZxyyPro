package com.hch.exception;

public class CustomException  extends Exception {
	private static final long serialVersionUID = -5212079010855161498L;
	
	public CustomException(String message){
		super(message);	
		this.message = message;
	}

	//“Ï≥£–≈œ¢
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
