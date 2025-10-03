package com.jmp.exercicios.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jmp.exercicios.dtos.ProductMinDto;
import com.jmp.exercicios.entities.Product;
import com.jmp.exercicios.services.ProductService;

@RestController
@RequestMapping(value="uri2621")
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@GetMapping("jpql")
	public List<ProductMinDto> findJpqlProduct(
			@RequestParam(required = false) Integer min,
			@RequestParam(required = false) Integer max,
			@RequestParam(required = false) String letra){
		return productService.findJpqlProduct(min, max, letra);		
	}
	
	@GetMapping("sql")
	public List<ProductMinDto> findSqlProduct(
			@RequestParam(required = false) Integer min,
			@RequestParam(required = false) Integer max,
			@RequestParam(required = false) String letra){
		return productService.findSqlProduct(min, max, letra);		
	}
	
	@GetMapping
	public List<Product> findAll(){
		return productService.findAll();		
	}
	
}
