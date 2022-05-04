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

import com.example.demo.dao.ClientRepository;
import com.example.demo.entities.Client;

@RestController
@RequestMapping(value="/clients")
public class ClientController {
	
	@Autowired
	protected ClientRepository CL;
	
	
	
	@PostMapping("/AddC")
	public Client ajouterC(@RequestBody Client c)
	{
		return CL.save(c);
	}
	
	
	@DeleteMapping("/DeleteC")
	public void deleteC(@RequestBody Client c)
	{
		CL.delete(c);
		
	
	}
	
	@PutMapping("/UpdateC")
	public Client updateC(@RequestBody Client c)
	{
		return CL.save(c);
		
		
	}
	
	@GetMapping("/GetAllc")
	public List<Client> afficherToutC()
	{
		return CL.findAll();
	}

	
}
