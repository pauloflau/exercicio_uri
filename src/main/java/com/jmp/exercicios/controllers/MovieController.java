package com.jmp.exercicios.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jmp.exercicios.dtos.MovieMinDto;
import com.jmp.exercicios.entities.Movie;
import com.jmp.exercicios.services.MovieService;

@RestController
@RequestMapping(value = "uri2611")
public class MovieController {
	@Autowired
	private MovieService movieService;
	
	@GetMapping("jpql/{genre}")
	public List<MovieMinDto> findJpqlGenreMovie(@PathVariable String genre){
		return movieService.findJpqlGenre(genre);		
	}

	@GetMapping("sql/{genre}")
	public List<MovieMinDto> findSqlGenreMovie(@PathVariable String genre){
		return movieService.findSqlGenre(genre);		
	}
	
	@GetMapping
	public List<Movie> findAll(){
		return movieService.findAll();		
	}
}
