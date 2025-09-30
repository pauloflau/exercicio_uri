package com.jmp.exercicios.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jmp.exercicios.dtos.CustomerMinDto;
import com.jmp.exercicios.entities.Customer;
import com.jmp.exercicios.projections.CustomerMinProjection;
import com.jmp.exercicios.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository customerRepository;
	
	public List<CustomerMinDto> findJpqlCity(String state){
		List<CustomerMinDto> result2 = customerRepository.search2(state);
				
		return result2;
	}
	
	public List<CustomerMinDto> findSqlCity(String state){
		List<CustomerMinProjection>list = customerRepository.search1(state);
		List<CustomerMinDto> result1 = list.stream()
				.map(x -> new CustomerMinDto(x))
				.collect(Collectors.toList());
				
		return result1;
	}
	
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}
}
