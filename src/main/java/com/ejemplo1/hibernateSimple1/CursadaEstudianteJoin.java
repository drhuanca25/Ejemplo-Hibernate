package com.ejemplo1.hibernateSimple1;

public class CursadaEstudianteJoin {

	private String nombre;
	private int id;
	private float calificacion;
	public CursadaEstudianteJoin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CursadaEstudianteJoin(String nombre, int id, float calificacion) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.calificacion = calificacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(float calificacion) {
		this.calificacion = calificacion;
	}
	
	
}
