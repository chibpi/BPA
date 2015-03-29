package org.chibpi.prank.modelo;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.jpa.*;


@Entity
@View(members="nombre;telefono1;telefono2;horasCoincidencia;retos;horasDisponibilidad")
public class Pareja implements Comparable{
	
	@Id @Hidden
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 private Integer id;

	@Column
	private Boolean activa;
	
	@Column(length=50) @Required
	private String nombre;

	@Column(length=9) @Required @Stereotype("TELEFONO")
	private String telefono1;
	
	@Column(length=9) @Required @Stereotype("TELEFONO")
	private String telefono2;
	
	@OneToMany (mappedBy="pareja", cascade=CascadeType.REMOVE)
//	@OrderBy("horaDisponible.dia,horaDisponible.hora")
	@ListProperties("horaDisponible.dia,horaDisponible.hora")
	private Collection<HoraDisponiblePareja> horasDisponibilidad;
	
	@OneToMany (mappedBy="pareja1", cascade=CascadeType.REMOVE) @ReadOnly
//	@OrderBy("horaDisponible.dia,horaDisponible.hora")
	@ListProperties("pareja2.nombre,fechaHora,estado,ganador.nombre,")
	private Collection<Reto> retosPropuestos;
	
	@OneToMany (mappedBy="pareja2", cascade=CascadeType.REMOVE) @ReadOnly
//	@OrderBy("horaDisponible.dia,horaDisponible.hora")
	@ListProperties("pareja1.nombre,fechaHora,estado,ganador.nombre,")
	private Collection<Reto> retosRecibidos;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	


	public boolean isActiva() {
		return activa;
	}

	public void setActiva(boolean activa) {
		this.activa = activa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono1() {
		return telefono1;
	}

	public void setTelefono1(String telefono1) {
		this.telefono1 = telefono1;
	}

	public String getTelefono2() {
		return telefono2;
	}

	public void setTelefono2(String telefono2) {
		this.telefono2 = telefono2;
	}




	public Collection<HoraDisponiblePareja> getHorasDisponibilidad() {
		return horasDisponibilidad;
	}

	public void setHorasDisponibilidad(
			Collection<HoraDisponiblePareja> horasDisponibilidad) {
		this.horasDisponibilidad = horasDisponibilidad;
	}

	public Collection<Reto> getRetosPropuestos() {
		return retosPropuestos;
	}

	public void setRetosPropuestos(Collection<Reto> retosPropuestos) {
		this.retosPropuestos = retosPropuestos;
	}

	public Collection<Reto> getRetosRecibidos() {
		return retosRecibidos;
	}

	public void setRetosRecibidos(Collection<Reto> retosRecibidos) {
		this.retosRecibidos = retosRecibidos;
	}

	@ListProperties("pareja2.nombre,fechaHora") @ReadOnly
	@RowAction("Reto.retar")
	public Collection<Reto> getHorasCoincidencia() {
		TreeSet<Reto> horas=new TreeSet<Reto>();
		
		Query q=XPersistence.getManager().createQuery("Select p From Pareja p");
		Collection<Pareja> parejas=q.getResultList();
		for (Pareja otraPareja: parejas) {
			if (otraPareja != this) {
				for (HoraDisponiblePareja horaOtraPareja: otraPareja.getHorasDisponibilidad()) {
					for (HoraDisponiblePareja hora: this.getHorasDisponibilidad()) {
						if (horaOtraPareja.getHoraDisponible().compareTo(hora.getHoraDisponible())==0) {
							Reto r = new Reto();
							r.setPareja1(this);
							r.setPareja2(otraPareja);
							r.setFechaHora(Reto.siguienteFechaHora(hora.getHoraDisponible()));
							horas.add(r);
						}
					}
				}
			}
		}
		return horas;
	}
	
	@OneToMany (mappedBy="pareja1", cascade=CascadeType.REMOVE) @ReadOnly
//	@OrderBy("horaDisponible.dia,horaDisponible.hora")
	@ListProperties("pareja1.nombre,pareja2.nombre,fechaHora,estado,ganador.nombre,")
	public Collection<Reto> getRetos() {
		TreeSet<Reto> retos=new TreeSet<Reto>();
		retos.addAll(this.getRetosPropuestos());
		retos.addAll(this.getRetosRecibidos());
		return retos;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return this.getNombre().compareTo(((Pareja)o).getNombre());
	}
	
	
}
