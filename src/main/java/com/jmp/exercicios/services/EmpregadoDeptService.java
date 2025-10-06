package com.jmp.exercicios.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jmp.exercicios.dtos.EmpregadoDeptDto;
import com.jmp.exercicios.entities.Empregado;
import com.jmp.exercicios.projections.EmpregadoDeptProjection;
import com.jmp.exercicios.repository.EmpregadoDeptRepository;

@Service
public class EmpregadoDeptService {

	@Autowired
	EmpregadoDeptRepository empregadoDeptRepository;
	
	public List<EmpregadoDeptDto> findSqlEmpregadoDept(){
		List<EmpregadoDeptProjection>list = empregadoDeptRepository.search1();
		List<EmpregadoDeptDto> result1 = list.stream()
				.map(x -> new EmpregadoDeptDto(x))
				.collect(Collectors.toList());
				
		return result1;
	}
	
	public List<Empregado> findAll(){
		return empregadoDeptRepository.findAll();
	}
}
