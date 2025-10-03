package com.jmp.exercicios.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jmp.exercicios.dtos.ProviderSumDto;
import com.jmp.exercicios.entities.Provider;
import com.jmp.exercicios.services.ProviderService;

@RestController
@RequestMapping(value="uri2609")
public class ProviderController {
	@Autowired
	private ProviderService providerService;
	
	@GetMapping("sql")
	public List<ProviderSumDto> findSqlProvider(){
		return providerService.findSqlProvider();		
	}
	
	@GetMapping
	public List<Provider> findAll(){
		return providerService.findAll();		
	}
}
