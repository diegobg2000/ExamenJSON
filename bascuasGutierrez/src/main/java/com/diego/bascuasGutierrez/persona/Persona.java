package com.diego.bascuasGutierrez.persona;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;


@Entity
@Table(name="personas")
public class Persona {

	@Id
	private String idPersona;
	
	@Column
	private String nombre;
	
	@Column
	private String cargo;
	
	@Column 
	@Min(1)	
	private Integer edad;
	
		
	
	
	
	/*GETTERS & SETTERS*/

	public String getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(String idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	/*TO STRING*/

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + ", cargo=" + cargo + ", edad=" + edad + "]";
	}	
	
	
}
