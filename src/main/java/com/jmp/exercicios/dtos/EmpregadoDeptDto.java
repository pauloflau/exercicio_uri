package com.jmp.exercicios.dtos;

import com.jmp.exercicios.projections.EmpregadoDeptProjection;

public class EmpregadoDeptDto {
	private String cpf;
	private String enome;
	private String dnome;

	public EmpregadoDeptDto() {

	}

	public EmpregadoDeptDto(String cpf, String enome, String dnome) {
		super();
		this.cpf = cpf;
		this.enome = enome;
		this.dnome = dnome;
	}

	public EmpregadoDeptDto(EmpregadoDeptProjection projection) {
		cpf = projection.getCpf();
		enome = projection.getEnome();
		dnome = projection.getDnome();
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEnome() {
		return enome;
	}

	public void setEnome(String enome) {
		this.enome = enome;
	}

	public String getDnome() {
		return dnome;
	}

	public void setDnome(String dnome) {
		this.dnome = dnome;
	}
	
	

}
