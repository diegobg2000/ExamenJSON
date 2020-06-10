package com.diego.bascuasGutierrez.aula;

import java.util.List;

import com.diego.bascuasGutierrez.persona.Persona;

public class Aula {

	private Integer idAula;
	
	private String IES; 
	
	private String ciudad;
	
	private String cp;
	
	private List<Persona> personas;
	
	
	/*GETTERS & SETTERS*/

	public Integer getIdAula() {
		return idAula;
	}

	public void setIdAula(Integer idAula) {
		this.idAula = idAula;
	}

	public String getIES() {
		return IES;
	}

	public void setIES(String iES) {
		IES = iES;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public List<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(List<Persona> personas) {
		this.personas = personas;
	}

	/*TO STRING*/
	@Override
	public String toString() {
		return "Aula [idAula=" + idAula + ", IES=" + IES + ", ciudad=" + ciudad + ", cp=" + cp + ", personas="
				+ personas + "]";
	}
	
	
	
	
}
