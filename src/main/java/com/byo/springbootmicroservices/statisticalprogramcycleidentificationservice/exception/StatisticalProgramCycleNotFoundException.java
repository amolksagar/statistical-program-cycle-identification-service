package com.byo.springbootmicroservices.statisticalprogramcycleidentificationservice.exception;

public class StatisticalProgramCycleNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;

	public StatisticalProgramCycleNotFoundException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
