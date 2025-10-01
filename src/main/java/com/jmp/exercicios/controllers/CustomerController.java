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
@RequestMapping(value="uri2602")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("jpql/{state}")
	public List<CustomerMinDto> findJpqlCityCustomer(@PathVariable String state){
		return customerService.findJpqlCity(state);		
	}
	
	@GetMapping("sql/{state}")
	public List<CustomerMinDto> findSqlCityCustomer(@PathVariable String state){
		return customerService.findSqlCity(state);		
	}
	
	@GetMapping
	public List<Customer> findAll(){
		return customerService.findAll();		
	}
	
}
