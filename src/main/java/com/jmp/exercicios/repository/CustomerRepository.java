package com.jmp.exercicios.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jmp.exercicios.dtos.CustomerMinDto;
import com.jmp.exercicios.entities.Customer;
import com.jmp.exercicios.projections.CustomerMinProjection;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
	
	@Query(nativeQuery=true, value="select name from customers where UPPER(state)=UPPER(:state)")
	List<CustomerMinProjection> search1(String state);
	
	@Query("select new com.jmp.exercicios.dtos.CustomerMinDto(obj.name) from Customer obj where UPPER(obj.state)=UPPER(:state)")
	List<CustomerMinDto> search2(String state);
}
