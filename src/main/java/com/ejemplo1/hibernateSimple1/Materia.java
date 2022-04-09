package com.ejemplo1.hibernateSimple1;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Materia {
	@Id
	@GenericGenerator(name = "genMat",strategy ="com.ejemplo1.hibernateSimple1.GeneradorMateria")
	@GeneratedValue(generator = "genMat")
	private Long id;
	private String sigla, descripcion;
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
			name="materia_cursada_2",
			catalog="abc123",
			joinColumns = {
					@JoinColumn(name="id_mat", nullable = false,updatable = false)
			},
			inverseJoinColumns = {
					@JoinColumn(name="est",nullable = false,updatable = false)
			}
	)
	private Set<Estudiante> estudiantes;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Set<Estudiante> getEstudiantes() {
		return estudiantes;
	}
	public void setEstudiantes(Set<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

}
