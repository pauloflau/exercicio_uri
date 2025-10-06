package com.jmp.exercicios.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jmp.exercicios.dtos.LawyerAverageDTO;
import com.jmp.exercicios.entities.Lawyer;
import com.jmp.exercicios.services.LawyerService;

@RestController
@RequestMapping(value="uri2737")
public class LawyerController {
	@Autowired
	private LawyerService lawyerService;
	
	
	@GetMapping("/sql")
	public List<LawyerAverageDTO> findSqlAverageLawyer(){
		return lawyerService.findSqlLawyer();		
	}
	
	@GetMapping
	public List<Lawyer> findAll(){
		return lawyerService.findAll();		
	}
}
