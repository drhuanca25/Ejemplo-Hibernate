package com.ejemplo1.hibernateSimple1;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Telefono {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int numero;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_est")
	private Estudiante estudiante;
	@OneToOne(fetch = FetchType.LAZY, targetEntity = TelefonoDetalles.class,
			mappedBy = "telf" , cascade = CascadeType.ALL)
	private TelefonoDetalles telefonoDetalles;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}
	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}
	public TelefonoDetalles getTelefonoDetalles() {
		return telefonoDetalles;
	}
	public void setTelefonoDetalles(TelefonoDetalles telefonoDetalles) {
		this.telefonoDetalles = telefonoDetalles;
	}
	
	
}
