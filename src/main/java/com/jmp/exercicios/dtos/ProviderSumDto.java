package com.jmp.exercicios.dtos;

import com.jmp.exercicios.projections.ProviderSumProjection;

public class ProviderSumDto {
	private String state;
	private Long sum;
	
	public ProviderSumDto() {
		// TODO Auto-generated constructor stub
	}

	public ProviderSumDto(String state, Long sum) {
		super();
		this.state = state;
		this.sum = sum;
	}

	public ProviderSumDto(ProviderSumProjection projection) {
		state = projection.getState();
		sum = projection.getSum();
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Long getSum() {
		return sum;
	}

	public void setSum(Long sum) {
		this.sum = sum;
	}

	@Override
	public String toString() {
		return "ProviderSumDto [state=" + state + ", sum=" + sum + "]";
	}
}
