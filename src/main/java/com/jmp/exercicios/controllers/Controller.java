package com.jmp.exercicios.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jmp.exercicios.dtos.CustomerMinDto;
import com.jmp.exercicios.entities.Customer;
import com.jmp.exercicios.services.CustomerService;

@RestController
@RequestMapping
public class Controller {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("uri2602/jpql/{state}")
	public List<CustomerMinDto> findJpqlCityCustomer(@PathVariable String state){
		return customerService.findJpqlCity(state);		
	}
	
	@GetMapping("uri2602/sql/{state}")
	public List<CustomerMinDto> findSqlCityCustomer(@PathVariable String state){
		return customerService.findSqlCity(state);		
	}
	
	@GetMapping("uri2602")
	public List<Customer> findAll(){
		return customerService.findAll();		
	}
	
}
