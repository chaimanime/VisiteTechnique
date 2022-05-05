//Elaborée par Hela Cherni

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

import com.example.demo.dao.TicketRepository;
import com.example.demo.entities.Ticket;

@RestController
@RequestMapping(value="/tickets")
public class TicketController {
	
	@Autowired
	protected TicketRepository TK;
	
	
	
	@PostMapping("/AddT")
	public Ticket ajouterT(@RequestBody Ticket t)
	{
		return TK.save(t);
	}
	
	
	@DeleteMapping("/DeleteT")
	public void deleteT(@RequestBody Ticket t)
	{
		TK.delete(t);
		
	
	}
	
	@PutMapping("/UpdateT")
	public Ticket updateT(@RequestBody Ticket t)
	{
		return TK.save(t);
		
		
	}
	
	@GetMapping("/GetAllT")
	public List<Ticket> afficherToutT()
	{
		return TK.findAll();
	}

	
}
