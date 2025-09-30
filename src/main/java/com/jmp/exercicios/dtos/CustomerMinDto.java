package com.jmp.exercicios.dtos;

import java.util.Objects;

import com.jmp.exercicios.projections.CustomerMinProjection;

public class CustomerMinDto {

	private String name;
	
	public CustomerMinDto() {
		// TODO Auto-generated constructor stub
	}

	public CustomerMinDto(String name) {
		this.name = name;
	}
	
	public CustomerMinDto(CustomerMinProjection projection) {
		name = projection.getName();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerMinDto other = (CustomerMinDto) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "CustomerDto [name=" + name + "]";
	}
	
}
