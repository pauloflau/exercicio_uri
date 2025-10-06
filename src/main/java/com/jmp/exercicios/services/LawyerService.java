package com.jmp.exercicios.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jmp.exercicios.dtos.LawyerAverageDTO;
import com.jmp.exercicios.entities.Lawyer;
import com.jmp.exercicios.projections.LawyerAverageProjection;
import com.jmp.exercicios.repository.LawyerRepository;

@Service
public class LawyerService {

	@Autowired
	LawyerRepository lawyerRepository;
	
	public List<LawyerAverageDTO> findSqlLawyer(){
		List<LawyerAverageProjection>list = lawyerRepository.search1();
		List<LawyerAverageDTO> result1 = list.stream()
				.map(x -> new LawyerAverageDTO(x))
				.collect(Collectors.toList());
				
		return result1;
	}
	
	public List<Lawyer> findAll(){
		return lawyerRepository.findAll();
	}
}
