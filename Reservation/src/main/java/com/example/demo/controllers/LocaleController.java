package com.example.demo.controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.dao.LocaleRepository;

import com.example.demo.entities.Locale;

@RestController
@RequestMapping(value="/locales")
public class LocaleController {
	
	@Autowired
	protected LocaleRepository LC;
	
	
	
	@PostMapping("/AddL")
	public Locale ajouterL(@RequestBody Locale l)
	{
		return LC.save(l);
	}
	
	
	@DeleteMapping("/DeleteL")
	public void deleteL(@RequestBody Locale L)
	{
		LC.delete(L);
		
	
	}
	
	@PutMapping("/UpdateL")
	public Locale updateL(@RequestBody Locale L)
	{
		return LC.save(L);
		
		
	}
	
	@GetMapping("/GetAllL")
	public List<Locale> afficherToutL()
	{
		return LC.findAll();
	}

	
}