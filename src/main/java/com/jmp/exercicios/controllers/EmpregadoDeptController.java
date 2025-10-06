package com.jmp.exercicios.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jmp.exercicios.dtos.EmpregadoDeptDto;
import com.jmp.exercicios.entities.Empregado;
import com.jmp.exercicios.services.EmpregadoDeptService;

@RestController
@RequestMapping(value="uri2990")
public class EmpregadoDeptController {
	
	@Autowired
	private EmpregadoDeptService empregadoDeptService;
	
	@GetMapping("/sql")
	public List<EmpregadoDeptDto> findSqlEmpregadoDept(){
		return empregadoDeptService.findSqlEmpregadoDept();		
	}
	
	@GetMapping
	public List<Empregado> findAll(){
		return empregadoDeptService.findAll();		
	}
}
