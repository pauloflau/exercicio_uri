package com.jmp.exercicios.dtos;

import java.util.Objects;

import com.jmp.exercicios.projections.ProductMinProjection;

public class ProductMinDto {
	private String name;
	public ProductMinDto() {
		// TODO Auto-generated constructor stub
	}
	public ProductMinDto(String name) {
		super();
		this.name = name;
	}
	
	public ProductMinDto(ProductMinProjection projection) {
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
		ProductMinDto other = (ProductMinDto) obj;
		return Objects.equals(name, other.name);
	}
	
}
