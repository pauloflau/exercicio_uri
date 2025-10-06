package com.jmp.exercicios.entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="empregados")
public class Empregado {

	@Id
	private Long cpf;
	private String enome;
	private Double salario;
	
	@ManyToOne
	@JoinColumn(name="cpf_supervisor")
	@JsonIgnore
	private Empregado supervisor;
	
	@OneToMany(mappedBy = "supervisor")
	@JsonIgnore
	private List<Empregado> supervisionados = new ArrayList<>();
	
	@ManyToOne
    @JoinColumn(name = "dnumero")
	@JsonBackReference
    private Departamento departamento;

    @ManyToMany
    @JoinTable(name = "trabalha",
		joinColumns = @JoinColumn(name = "cpf_emp"),
		inverseJoinColumns = @JoinColumn(name = "pnumero"))
    @JsonIgnore 
    private Set<Projeto> projetosOndeTrabalha = new HashSet<>();
    
    public Empregado() {
		// TODO Auto-generated constructor stub
	}

	public Empregado(Long cpf, String enome, Double salario, Empregado supervisor, List<Empregado> supervisionados,
			Departamento departamento, Set<Projeto> projetosOndeTrabalha) {
		super();
		this.cpf = cpf;
		this.enome = enome;
		this.salario = salario;
		this.supervisor = supervisor;
		this.supervisionados = supervisionados;
		this.departamento = departamento;
		this.projetosOndeTrabalha = projetosOndeTrabalha;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public String getEnome() {
		return enome;
	}

	public void setEnome(String enome) {
		this.enome = enome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Empregado getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(Empregado supervisor) {
		this.supervisor = supervisor;
	}

	public List<Empregado> getSupervisionados() {
		return supervisionados;
	}

	public void setSupervisionados(List<Empregado> supervisionados) {
		this.supervisionados = supervisionados;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Set<Projeto> getProjetosOndeTrabalha() {
		return projetosOndeTrabalha;
	}

	public void setProjetosOndeTrabalha(Set<Projeto> projetosOndeTrabalha) {
		this.projetosOndeTrabalha = projetosOndeTrabalha;
	}
    
}
