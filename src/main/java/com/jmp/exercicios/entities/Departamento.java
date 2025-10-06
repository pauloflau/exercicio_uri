package com.jmp.exercicios.entities;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table; 

@Entity
@Table(name= "departamentos")
public class Departamento {
	@Id
    private Long dnumero;
    private String dnome;

    @OneToMany(mappedBy = "departamento")
    @JsonManagedReference
    private List<Empregado> empregados = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "cpf_gerente")
    @JsonBackReference
    private Empregado gerente;

	public Departamento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Departamento(Long dnumero, String dnome, List<Empregado> empregados, Empregado gerente) {
		super();
		this.dnumero = dnumero;
		this.dnome = dnome;
		this.empregados = empregados;
		this.gerente = gerente;
	}

	public Long getDnumero() {
		return dnumero;
	}

	public void setDnumero(Long dnumero) {
		this.dnumero = dnumero;
	}

	public String getDnome() {
		return dnome;
	}

	public void setDnome(String dnome) {
		this.dnome = dnome;
	}

	public List<Empregado> getEmpregados() {
		return empregados;
	}

	public void setEmpregados(List<Empregado> empregados) {
		this.empregados = empregados;
	}

	public Empregado getGerente() {
		return gerente;
	}

	public void setGerente(Empregado gerente) {
		this.gerente = gerente;
	}
    
    
}
