package com.jmp.exercicios.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jmp.exercicios.entities.Product;
import com.jmp.exercicios.projections.ProductMinProjection;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
    @Query(nativeQuery = true, value = "SELECT products.name FROM products "
    		+ "INNER JOIN providers ON products.id_providers = providers.id "
    		+ "WHERE products.amount BETWEEN :min AND :max "
    		+ "AND providers.name LIKE CONCAT(:letra, '%')")
	List<ProductMinProjection> search1(Integer min, Integer max, String letra);
    

}

