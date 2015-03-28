package org.chibpi.prank.modelo;

import javax.persistence.*;

import org.openxava.annotations.*;


@Entity
public class Posicion {
	
	@Id @Hidden
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 private Integer id;
	
	@Column
	private Integer posicion;
	
	@ManyToOne(fetch=FetchType.LAZY) @Required  @NoCreate @NoModify
	@DescriptionsList(descriptionProperties="nombre")
	private Pareja pareja;
	
	@ManyToOne(fetch=FetchType.LAZY) @Required  @NoCreate @NoModify
	@DescriptionsList(descriptionProperties="fecha")
	private Ranking ranking;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPosicion() {
		return posicion;
	}

	public void setPosicion(Integer posicion) {
		this.posicion = posicion;
	}

	public Pareja getPareja() {
		return pareja;
	}

	public void setPareja(Pareja pareja) {
		this.pareja = pareja;
	}

	public Ranking getRanking() {
		return ranking;
	}

	public void setRanking(Ranking ranking) {
		this.ranking = ranking;
	}



}
