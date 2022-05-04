//Elaborée par Hela Cherni

package com.example.demo.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@RequiredArgsConstructor
public class Réservation {
	@Id
	private Long codeRes;
	@NonNull
	private Date dateReservation;
	@NonNull
	private Date heureReservation;
	private boolean disponibilite;
	
	@ManyToMany(mappedBy="réservations")
	private Collection<Locale> locales;
	
	@ManyToOne
	@JoinColumn(name="code_client")
	private Client client;

	@OneToMany(mappedBy="réservation",
			fetch=FetchType.LAZY, cascade=CascadeType.ALL)
			private Collection<Ticket> tickets;
	
	@ManyToOne
	@JoinColumn(name="id_vehicule")
	private Véhicule véhicule;
	

}
