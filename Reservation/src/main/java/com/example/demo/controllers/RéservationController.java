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

import com.example.demo.dao.RéservationRepository;
import com.example.demo.entities.Réservation;


@RestController
@RequestMapping(value="/réservations")
public class RéservationController {
	
	@Autowired
	protected RéservationRepository RS;
	
	
	
	@PostMapping("/AddR")
	public Réservation ajouterR(@RequestBody Réservation r)
	{
		return RS.save(r);
	}
	
	
	@DeleteMapping("/DeleteR")
	public void deleteR(@RequestBody Réservation r)
	{
		RS.delete(r);
		
	
	}
	
	@PutMapping("/UpdateR")
	public Réservation updateR(@RequestBody Réservation r)
	{
		return RS.save(r);
		
		
	}
	
	@GetMapping("/GetAllR")
	public List<Réservation> afficherToutR()
	{
		return RS.findAll();
	}

	
}
