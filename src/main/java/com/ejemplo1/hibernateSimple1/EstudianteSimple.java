package com.ejemplo1.hibernateSimple1;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EstudianteSimple {
	@Id
	private int id;
	private String apellido;
		
	public EstudianteSimple() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EstudianteSimple(int id, String apellido) {
		super();
		this.id = id;
		this.apellido = apellido;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
}