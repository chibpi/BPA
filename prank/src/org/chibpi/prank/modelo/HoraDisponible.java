package org.chibpi.prank.modelo;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
@View(members="Dia;hora")
public class HoraDisponible implements Comparable{

	@Id @Hidden
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 private Integer id;	
	
	@Enumerated(EnumType.STRING)
	 private Dia dia;
	 public enum Dia { Lunes, Martes, Miercoles, Jueves, Viernes, Sabado, Domingo };
	 
	@Column @Stereotype("HORA")
	private String hora;

	


	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public Dia getDia() {
		return dia;
	}



	public void setDia(Dia dia) {
		this.dia = dia;
	}



	public String getHora() {
		return hora;
	}



	public void setHora(String hora) {
		this.hora = hora;
	}



	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		HoraDisponible otraHora=(HoraDisponible)o;
		
		if (otraHora.getDia() != this.getDia())
			return this.getDia().compareTo(otraHora.getDia());
		else //mismo dia
			return this.getHora().compareTo(otraHora.getHora());

	}



	public int getHoraInt() {
		// TODO Auto-generated method stub
		return new Integer(hora.substring(0, 2));
	}



	public int getMinuntoInt() {
		// TODO Auto-generated method stub
		return new Integer(hora.substring(3, 5));
	}

}
