package com.jmp.exercicios.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jmp.exercicios.dtos.ProductMinDto;
import com.jmp.exercicios.entities.Product;
import com.jmp.exercicios.projections.ProductMinProjection;
import com.jmp.exercicios.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;
	
	public List<ProductMinDto> findSqlProduct(Integer min, Integer max, String letra){
		List<ProductMinProjection>list = productRepository.search1(min, max, letra);
		List<ProductMinDto> result1 = list.stream()
				.map(x -> new ProductMinDto(x))
				.collect(Collectors.toList());
				
		return result1;
	}
	
	public List<Product> findAll(){
		return productRepository.findAll();
	}
}
