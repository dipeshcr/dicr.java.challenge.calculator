package com.witsoftware.dicr.java.challenge.calculator.model.dto;

import java.math.BigDecimal;

public class ArithmeticResponse {

	private String requestUUID;
	private BigDecimal numberOne;
	private BigDecimal numberTwo;
	private ResultDTO resultDTO;

	public BigDecimal getNumberOne() {
		return numberOne;
	}

	public void setNumberOne(BigDecimal numberOne) {
		this.numberOne = numberOne;
	}

	public BigDecimal getNumberTwo() {
		return numberTwo;
	}

	public void setNumberTwo(BigDecimal numberTwo) {
		this.numberTwo = numberTwo;
	}

	public String getRequestUUID() {
		return requestUUID;
	}

	public void setRequestUUID(String requestUUID) {
		this.requestUUID = requestUUID;
	}

	public ResultDTO getResultDTO() {
		return resultDTO;
	}

	public void setResultDTO(ResultDTO resultDTO) {
		this.resultDTO = resultDTO;
	}

}
