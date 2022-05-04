//Elaborée par Hela Cherni

package com.example.demo.entities;

import java.util.Collection;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

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
public class Locale {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codeLocale;
	@NonNull
	private String adresse;
	private String telephone;
	
	@ManyToMany
	@JoinTable(name="Res_lc", joinColumns=
	@JoinColumn(name="Num_Res"), inverseJoinColumns=
	@JoinColumn (name="Num_Lc"))
	private Collection<Réservation>réservations;
	
	
}
