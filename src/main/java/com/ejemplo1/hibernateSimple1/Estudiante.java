package com.ejemplo1.hibernateSimple1;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Estudiante {
	@Id
	@GenericGenerator(name = "genEst",strategy ="com.ejemplo1.hibernateSimple1.GeneradorEstudiante")
	@GeneratedValue(generator = "genEst")
	private Long id;
	private String nombre;
	private String apellido;
	@OneToMany(fetch= FetchType.LAZY, mappedBy="estudiante",targetEntity=Telefono.class)
	private Set telefonos;
	
	@OneToMany(fetch= FetchType.LAZY, mappedBy="estudiante",targetEntity=MateriaCursada.class)
	private Set<MateriaCursada> materiasCursadas;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
			name="materia_cursada_2",
			catalog="abc123",
			joinColumns = {
					@JoinColumn(name="est", nullable = false,updatable = false)
			},
			inverseJoinColumns = {
					@JoinColumn(name="id_mat",nullable = false,updatable = false)
			}
	)
	private Set<Materia> materias; 
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Set getTelefonos() {
		return telefonos;
	}
	public void setTelefonos(Set telefonos) {
		this.telefonos = telefonos;
	}
	public Set <MateriaCursada> getMateriasCursadas() {
		return materiasCursadas;
	}
	public void setMateriasCursadas(Set <MateriaCursada> materiasCursadas) {
		this.materiasCursadas = materiasCursadas;
	}
	public Set<Materia> getMaterias() {
		return materias;
	}
	public void setMaterias(Set<Materia> materias) {
		this.materias = materias;
	}
	
	
}
