package com.jmp.exercicios.entities;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "projetos")
public class Projeto {

	@Id
	private Long pnumero;
	private String pnome;

	@ManyToOne
	@JoinColumn(name = "dnumero")
	@JsonIgnore
	private Departamento departamento;

	@ManyToMany(mappedBy = "projetosOndeTrabalha")
	@JsonIgnore
	private Set<Empregado> empregados = new HashSet<>();

	public Projeto() {
	}

	public Projeto(Long pnumero, String pnome, Departamento departamento, Set<Empregado> empregados) {
		super();
		this.pnumero = pnumero;
		this.pnome = pnome;
		this.departamento = departamento;
		this.empregados = empregados;
	}

	public Long getPnumero() {
		return pnumero;
	}

	public void setPnumero(Long pnumero) {
		this.pnumero = pnumero;
	}

	public String getPnome() {
		return pnome;
	}

	public void setPnome(String pnome) {
		this.pnome = pnome;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Set<Empregado> getEmpregados() {
		return empregados;
	}

	public void setEmpregados(Set<Empregado> empregados) {
		this.empregados = empregados;
	}
	
}
