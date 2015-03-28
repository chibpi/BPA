package org.chibpi.prank.modelo;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
public class Ranking {
	
	@Id @Hidden
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 private Integer id;
	
	@Column @Required
	private Date fecha;
	
	@OneToMany @AsEmbedded
	@OrderBy("posicion")
	@ListProperties("posicion,pareja.nombre")
	private Collection<Posicion> posiciones;
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Collection<Posicion> getPosiciones() {
		return posiciones;
	}

	public void setPosiciones(Collection<Posicion> posiciones) {
		this.posiciones = posiciones;
	}
	

}
