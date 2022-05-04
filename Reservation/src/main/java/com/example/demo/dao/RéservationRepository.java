package com.example.demo.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Réservation;

	public interface RéservationRepository extends  JpaRepository <Réservation, Long>  {
		List<Réservation> findByClient(Long id);
		List<Réservation> findByDateReservationAndDisponibilite(Date date,boolean disp);
	
		
	}
