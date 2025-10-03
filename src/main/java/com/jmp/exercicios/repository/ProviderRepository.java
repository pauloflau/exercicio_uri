package com.jmp.exercicios.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jmp.exercicios.dtos.ProviderSumDto;
import com.jmp.exercicios.entities.Provider;
import com.jmp.exercicios.projections.ProviderSumProjection;

@Repository
public interface ProviderRepository extends JpaRepository<Provider, Long>{

	@Query(nativeQuery = true, value = 
	   "SELECT providers.state AS state, " +
	   "COALESCE(SUM(products.amount), 0) AS sum " +
	   "FROM providers " +
	   "INNER JOIN products ON products.id_providers = providers.id " +
	   "GROUP BY providers.state")
	List<ProviderSumProjection> search1();
	
    @Query(value = "SELECT new com.jmp.exercicios.dtos.ProviderSumDto(obj.provider.state, SUM(obj.amount)) "
    		+ "FROM Product obj "
    		+ "GROUP BY obj.provider.state")
    List<ProviderSumDto> search2();
}
