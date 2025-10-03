package com.jmp.exercicios.dtos;

import com.jmp.exercicios.projections.ProductMinProjection;

public class ProductMinDto {
	private String name;
	public ProductMinDto() {
		// TODO Auto-generated constructor stub
	}
	public ProductMinDto( String name) {
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
	public String toString() {
		return "ProductMinDto [name=" + name + "]";
	}

}
