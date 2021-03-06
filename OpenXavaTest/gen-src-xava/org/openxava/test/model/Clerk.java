
// File generated by OpenXava: Wed Jun 25 12:25:34 CEST 2014
// Archivo generado por OpenXava: Wed Jun 25 12:25:34 CEST 2014

// WARNING: NO EDIT
// OJO: NO EDITAR
// Component: Clerk		Entity/Entidad

package org.openxava.test.model;

import java.util.*;
import java.math.*;
import java.rmi.RemoteException;
import org.openxava.component.MetaComponent;
import org.openxava.model.meta.MetaModel;
import org.openxava.util.*;

/**
 * 
 * @author MCarmen Gimeno
 */
public class Clerk implements java.io.Serializable, org.openxava.test.model.IClerk {	

	// Constructor
	public Clerk() {
		initMembers();
	} 

	private void initMembers() { 
		setZoneNumber(0); 
		setOfficeNumber(0); 
		setNumber(0); 
		setName(null); 
		setArrivalTime(null); 
		setEndingTime(null); 
		setComments(null); 	
	} 
	
	// Properties/Propiedades 
	private static org.openxava.converters.IConverter arrivalTimeConverter;
	private org.openxava.converters.IConverter getArrivalTimeConverter() {
		if (arrivalTimeConverter == null) {
			try {
				arrivalTimeConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("arrivalTime");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "arrivalTime"));
			}
			
		}	
		return arrivalTimeConverter;
	} 
	private java.sql.Time arrivalTime;
	private java.sql.Time get_ArrivalTime() {
		return arrivalTime;
	}
	private void set_ArrivalTime(java.sql.Time newArrivalTime) {
		this.arrivalTime = newArrivalTime;
	} 	
	
	/**
	 * 
	 * 
	 */
	public java.sql.Time getArrivalTime() {
		try {
			return (java.sql.Time) getArrivalTimeConverter().toJava(get_ArrivalTime());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "ArrivalTime", "Clerk", "java.sql.Time"));
		}
	}
	
	/**
	 * 
	 */
	public void setArrivalTime(java.sql.Time newArrivalTime) {
		try { 
			set_ArrivalTime((java.sql.Time) getArrivalTimeConverter().toDB(newArrivalTime));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "ArrivalTime", "Clerk", "java.sql.Time"));
		}		
	} 
	private static org.openxava.converters.IConverter endingTimeConverter;
	private org.openxava.converters.IConverter getEndingTimeConverter() {
		if (endingTimeConverter == null) {
			try {
				endingTimeConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("endingTime");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "endingTime"));
			}
			
		}	
		return endingTimeConverter;
	} 
	private java.lang.String endingTime;
	private java.lang.String get_EndingTime() {
		return endingTime;
	}
	private void set_EndingTime(java.lang.String newEndingTime) {
		this.endingTime = newEndingTime;
	} 	
	
	/**
	 * 
	 * 
	 */
	public String getEndingTime() {
		try {
			return (String) getEndingTimeConverter().toJava(get_EndingTime());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "EndingTime", "Clerk", "String"));
		}
	}
	
	/**
	 * 
	 */
	public void setEndingTime(String newEndingTime) {
		try { 
			set_EndingTime((java.lang.String) getEndingTimeConverter().toDB(newEndingTime));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "EndingTime", "Clerk", "String"));
		}		
	} 
	private static org.openxava.converters.IConverter nameConverter;
	private org.openxava.converters.IConverter getNameConverter() {
		if (nameConverter == null) {
			try {
				nameConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("name");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "name"));
			}
			
		}	
		return nameConverter;
	} 
	private java.lang.String name;
	private java.lang.String get_Name() {
		return name;
	}
	private void set_Name(java.lang.String newName) {
		this.name = newName;
	} 	
	
	/**
	 * 
	 * 
	 */
	public String getName() {
		try {
			return (String) getNameConverter().toJava(get_Name());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Name", "Clerk", "String"));
		}
	}
	
	/**
	 * 
	 */
	public void setName(String newName) {
		try { 
			set_Name((java.lang.String) getNameConverter().toDB(newName));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Name", "Clerk", "String"));
		}		
	} 
	private int officeNumber;
	public int getOfficeNumber() {
		return officeNumber;
	}
	public void setOfficeNumber(int newOfficeNumber) {
		this.officeNumber = newOfficeNumber;
	} 
	private int number;
	public int getNumber() {
		return number;
	}
	public void setNumber(int newNumber) {
		this.number = newNumber;
	} 
	private int zoneNumber;
	public int getZoneNumber() {
		return zoneNumber;
	}
	public void setZoneNumber(int newZoneNumber) {
		this.zoneNumber = newZoneNumber;
	} 
	private static org.openxava.converters.IConverter commentsConverter;
	private org.openxava.converters.IConverter getCommentsConverter() {
		if (commentsConverter == null) {
			try {
				commentsConverter = (org.openxava.converters.IConverter) 
					getMetaModel().getMapping().getConverter("comments");
			}
			catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException(XavaResources.getString("generator.create_converter_error", "comments"));
			}
			
		}	
		return commentsConverter;
	} 
	private byte[] comments;
	private byte[] get_Comments() {
		return comments;
	}
	private void set_Comments(byte[] newComments) {
		this.comments = newComments;
	} 	
	
	/**
	 * 
	 * 
	 */
	public java.lang.String getComments() {
		try {
			return (java.lang.String) getCommentsConverter().toJava(get_Comments());
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Comments", "Clerk", "java.lang.String"));
		}
	}
	
	/**
	 * 
	 */
	public void setComments(java.lang.String newComments) {
		try { 
			set_Comments((byte[]) getCommentsConverter().toDB(newComments));
		}
		catch (org.openxava.converters.ConversionException ex) {
			ex.printStackTrace();
			throw new RuntimeException(XavaResources.getString("generator.conversion_error", "Comments", "Clerk", "java.lang.String"));
		}		
	} 

	// References/Referencias 

	// Colecciones/Collections 

	// Methods/Metodos 	

	// User defined finders/Buscadores definidos por el usuario 	
 	public static Clerk findByZoneNumberOfficeNumberNumber(int zoneNumber,int officeNumber,int number) throws javax.ejb.ObjectNotFoundException {
 		if (XavaPreferences.getInstance().isJPAPersistence()) { 			
 			javax.persistence.Query query = org.openxava.jpa.XPersistence.getManager().createQuery("from Clerk as o where o.zoneNumber = :arg0 and officeNumber = :arg1 and number = :arg2"); 
			query.setParameter("arg0", new Integer(zoneNumber)); 
			query.setParameter("arg1", new Integer(officeNumber)); 
			query.setParameter("arg2", new Integer(number)); 
 			try {
				return (Clerk) query.getSingleResult();
			}
			catch (Exception ex) {
				// In this way in order to work with Java pre 5 
				if (ex.getClass().getName().equals("javax.persistence.NoResultException")) {
					throw new javax.ejb.ObjectNotFoundException(XavaResources.getString("object_not_found", "Clerk"));
				}
				else {
					ex.printStackTrace();
					throw new RuntimeException(ex.getMessage());
				}
			}  		
 		}
 		else {
 			org.hibernate.Query query = org.openxava.hibernate.XHibernate.getSession().createQuery("from Clerk as o where o.zoneNumber = :arg0 and officeNumber = :arg1 and number = :arg2"); 
			query.setParameter("arg0", new Integer(zoneNumber)); 
			query.setParameter("arg1", new Integer(officeNumber)); 
			query.setParameter("arg2", new Integer(number)); 
			Clerk r = (Clerk) query.uniqueResult();
			if (r == null) {
				throw new javax.ejb.ObjectNotFoundException(XavaResources.getString("object_not_found", "Clerk"));
			}
			return r; 
 		}
 	} 


	private static MetaModel metaModel;
	public MetaModel getMetaModel() throws XavaException {
		if (metaModel == null) {
			metaModel = MetaComponent.get("Clerk").getMetaEntity(); 	
		}
		return metaModel;
	}
	
	public String toString() {		
		try {
			return getMetaModel().toString(this);
		}
		catch (XavaException ex) {
			System.err.println(XavaResources.getString("toString_warning", "Clerk"));
			return super.toString();
		}		
	}

	public boolean equals(Object other) {		
		if (other == null) return false;
		return toString().equals(other.toString());
	}
	
	public int hashCode() {		
		return toString().hashCode();
	}
	
}