package org.chibpi.prank.modelo;

import java.util.*;

import javax.persistence.*;

import org.chibpi.prank.modelo.HoraDisponible.*;
import org.openxava.annotations.*;

@Entity
public class Reto implements Comparable{
	
	@Id @Hidden
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 private Integer id;
	
	@ManyToOne(fetch=FetchType.LAZY) @Required @NoCreate @NoModify
	@DescriptionsList(descriptionProperties="nombre")
	private Pareja pareja1;
	
	@ManyToOne(fetch=FetchType.LAZY) @Required  @NoCreate @NoModify
	@DescriptionsList(descriptionProperties="nombre")
	private Pareja pareja2;
	
	@ManyToOne(fetch=FetchType.LAZY)  @NoCreate @NoModify
	@DescriptionsList(descriptionProperties="nombre")
	private Pareja ganador;
	
	@Stereotype("DATETIME")
	private Date fechaHora;

	@Enumerated(EnumType.STRING)
	 private Estado estado;
	 public enum Estado { Propuesto, Aceptado, Jugado };
	
	@Column(length=20)
	private String resultado;
	
	@Column(length=150)
	private String comentarioReto;

	public Reto() {
		
	}
	


	public static Date siguienteFechaHora(HoraDisponible hora) {
		// TODO Auto-generated method stub
		Calendar now = Calendar.getInstance();
		int weekday = now.get(Calendar.DAY_OF_WEEK);
		int horaDisponibleWeekday=calculaWeekday(hora);
		if (weekday != horaDisponibleWeekday)
		{
		    // calculate how much to add
		    // the 2 is the difference between Saturday and Monday
		    int days = (Calendar.SATURDAY + horaDisponibleWeekday - weekday ) % 7;
		    now.add(Calendar.DAY_OF_YEAR, days);
		}
		// now is the date you want
		
		now.set(Calendar.HOUR_OF_DAY, hora.getHoraInt());
		now.set(Calendar.MINUTE, hora.getMinuntoInt());
		return now.getTime();

	}

	private static int calculaWeekday(HoraDisponible hora) {
		switch(hora.getDia()) {
			case Lunes:
				return Calendar.MONDAY;
			case Martes:
					return Calendar.TUESDAY;
			case Miercoles:
					return Calendar.WEDNESDAY;
			case Jueves:
					return Calendar.THURSDAY;
			case Viernes:
					return Calendar.FRIDAY;
			case Sabado:
					return Calendar.SATURDAY;
			case Domingo:
					return Calendar.SUNDAY;
			
		}
		return 0;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Pareja getPareja1() {
		return pareja1;
	}

	public void setPareja1(Pareja pareja1) {
		this.pareja1 = pareja1;
	}

	public Pareja getPareja2() {
		return pareja2;
	}

	public void setPareja2(Pareja pareja2) {
		this.pareja2 = pareja2;
	}

	public Pareja getGanador() {
		return ganador;
	}

	public void setGanador(Pareja ganador) {
		this.ganador = ganador;
	}

	public Date getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}



	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public String getComentarioReto() {
		return comentarioReto;
	}

	public void setComentarioReto(String comentarioReto) {
		this.comentarioReto = comentarioReto;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return this.fechaHora.compareTo(((Reto)o).getFechaHora());
	}



}
