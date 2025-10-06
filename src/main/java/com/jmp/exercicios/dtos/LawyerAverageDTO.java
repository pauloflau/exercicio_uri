package com.jmp.exercicios.dtos;

import com.jmp.exercicios.projections.LawyerAverageProjection;

public class LawyerAverageDTO {
	private String name;
	private Long customersNumber;
	
	public LawyerAverageDTO() {
		// TODO Auto-generated constructor stub
	}

	public LawyerAverageDTO(String name, Long customersNumber) {
		super();
		this.name = name;
		this.customersNumber = customersNumber;
	}

	public LawyerAverageDTO(LawyerAverageProjection lawyerAverageProjection) {
		name = lawyerAverageProjection.getName();
		customersNumber = lawyerAverageProjection.getCustomersNumber();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getCustomersNumber() {
		return customersNumber;
	}

	public void setCustomersNumber(Long customersNumber) {
		this.customersNumber = customersNumber;
	}
	
	
	
}
