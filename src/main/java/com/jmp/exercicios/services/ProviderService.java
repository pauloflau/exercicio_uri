package com.jmp.exercicios.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jmp.exercicios.dtos.ProviderSumDto;
import com.jmp.exercicios.entities.Provider;
import com.jmp.exercicios.projections.ProviderSumProjection;
import com.jmp.exercicios.repository.ProviderRepository;

@Service
public class ProviderService {
	
	@Autowired
	private ProviderRepository providerRepository;
	
	public List<ProviderSumDto> findSqlProvider(){
		List<ProviderSumProjection>list = providerRepository.search1();
		List<ProviderSumDto> result1 = list.stream()
				.map(x -> new ProviderSumDto(x))
				.collect(Collectors.toList());
				
		return result1;
	}
	
	public List<Provider> findAll(){
		return providerRepository.findAll();
	}
}
