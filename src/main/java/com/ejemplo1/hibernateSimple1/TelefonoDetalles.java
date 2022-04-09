package com.ejemplo1.hibernateSimple1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="telf_detalles")
public class TelefonoDetalles {
	@Id
	@Column(name = "id_t_det", unique = true, nullable = false)
	@GenericGenerator(name="miGen", strategy = "foregin",parameters = @Parameter(name="property",value = "telf"))
	@GeneratedValue
	private int id;
	private String proveedor, tipo, propietario;
	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	private Telefono telf;
	public TelefonoDetalles() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TelefonoDetalles(int id, String proveedor, String tipo, String propietario, Telefono telf) {
		super();
		this.id = id;
		this.proveedor = proveedor;
		this.tipo = tipo;
		this.propietario = propietario;
		this.telf = telf;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProveedor() {
		return proveedor;
	}
	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getPropietario() {
		return propietario;
	}
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	public Telefono getTelf() {
		return telf;
	}
	public void setTelf(Telefono telf) {
		this.telf = telf;
	}
	
}
