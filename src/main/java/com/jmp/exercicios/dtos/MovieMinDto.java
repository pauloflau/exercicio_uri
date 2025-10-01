package com.jmp.exercicios.dtos;

import java.util.Objects;

import com.jmp.exercicios.projections.MovieMinProjection;

public class MovieMinDto {
	private Long id;
	private String name;
	
	public MovieMinDto() {
		// TODO Auto-generated constructor stub
	}

	public MovieMinDto(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public MovieMinDto(MovieMinProjection projection) {		
		id = projection.getId();
		name = projection.getName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MovieMinDto other = (MovieMinDto) obj;
		return Objects.equals(id, other.id);
	}
}
