package com.jdbcfarmacia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdbcfarmacia.entities.Laboratory;
import com.jdbcfarmacia.repositories.LaboratoryRepository;

@RestController
public class LaboratoryController {

	@Autowired
	private LaboratoryRepository laboratoryRepository;
	
	@GetMapping("/laboratory")
	public List<Laboratory> findAll() {
        return laboratoryRepository.findAll();
    } 
	
}
