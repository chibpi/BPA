package org.chibpi.prank.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
public class HoraDisponiblePareja {
	@Id @Hidden
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 private Integer id;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@DescriptionsList(descriptionProperties="nombre")
	Pareja pareja;
	
	@ManyToOne(fetch=FetchType.LAZY) @Required @NoCreate @NoModify
	@DescriptionsList(descriptionProperties="dia,hora")
	private HoraDisponible horaDisponible;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Pareja getPareja() {
		return pareja;
	}

	public void setPareja(Pareja pareja) {
		this.pareja = pareja;
	}

	public HoraDisponible getHoraDisponible() {
		return horaDisponible;
	}

	public void setHoraDisponible(HoraDisponible horaDisponible) {
		this.horaDisponible = horaDisponible;
	}
	
	
}
