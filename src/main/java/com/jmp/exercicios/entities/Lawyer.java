package com.jmp.exercicios.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="lawyers")
public class Lawyer {

	@Id
	private Long register;
	private String name;
	private Integer customersNumber;
	
	public Lawyer() {
		// TODO Auto-generated constructor stub
	}

	public Lawyer(Long register, String name, Integer customersNumber) {
		super();
		this.register = register;
		this.name = name;
		this.customersNumber = customersNumber;
	}

	public Long getRegister() {
		return register;
	}

	public void setRegister(Long register) {
		this.register = register;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCustomersNumber() {
		return customersNumber;
	}

	public void setCustomersNumber(Integer customersNumber) {
		this.customersNumber = customersNumber;
	}
	
}
