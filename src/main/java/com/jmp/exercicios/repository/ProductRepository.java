package com.jmp.exercicios.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jmp.exercicios.entities.Product;
import com.jmp.exercicios.projections.ProductMinProjection;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
    @Query(nativeQuery = true, value = """
        SELECT p.name AS name
        FROM products p
        INNER JOIN providers pr ON p.id_providers = pr.id
        WHERE p.amount BETWEEN :min AND :max
        AND pr.name LIKE CONCAT(:fornecedor, '%')
    """)
	List<ProductMinProjection> search1(Integer min, Integer max, String fornecedor);
}
