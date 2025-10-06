package com.jmp.exercicios.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jmp.exercicios.entities.Empregado;
import com.jmp.exercicios.projections.EmpregadoDeptProjection;

public interface EmpregadoDeptRepository extends JpaRepository<Empregado, Long> {

	@Query(nativeQuery = true, value = "SELECT empregados.cpf, empregados.enome, departamentos.dnome FROM empregados "
			+ "INNER JOIN departamentos ON empregados.dnumero = departamentos.dnumero "
			+ "WHERE empregados.cpf NOT IN (" + "SELECT empregados.cpf " + "FROM empregados " + "INNER JOIN trabalha "
			+ "ON trabalha.cpf_emp = empregados.cpf " + ") " + "ORDER BY empregados.cpf")
	List<EmpregadoDeptProjection> search1();

}
