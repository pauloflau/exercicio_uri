package com.jmp.exercicios.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jmp.exercicios.dtos.MovieMinDto;
import com.jmp.exercicios.entities.Movie;
import com.jmp.exercicios.projections.MovieMinProjection;
import com.jmp.exercicios.repository.MovieRepository;

@Service
public class MovieService {

	@Autowired
	private MovieRepository movieRepository;
	
	public List<MovieMinDto> findJpqlGenre(String genre){
		List<MovieMinDto> result2 = movieRepository.search2(genre);
				
		return result2;
	}
	
	public List<MovieMinDto> findSqlGenre(String genre){
		List<MovieMinProjection>list = movieRepository.search1(genre);
		List<MovieMinDto> result1 = list.stream()
				.map(x -> new MovieMinDto(x))
				.collect(Collectors.toList());
				
		return result1;
	}
	
	public List<Movie> findAll(){
		return movieRepository.findAll();
	}
}
