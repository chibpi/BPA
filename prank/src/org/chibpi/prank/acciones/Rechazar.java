package org.chibpi.prank.acciones;

import java.util.*;

import org.chibpi.prank.modelo.*;
import org.openxava.actions.*;
import org.openxava.jpa.*;

public class Rechazar extends CollectionBaseAction{

	@Override
	public void execute() throws Exception {
		for (Object o: getSelectedObjects()) {
			Reto reto = (Reto) o;
			reto.setFechaHoraAceptado(new Date());
			reto.setEstado(Reto.Estado.Rechazado);
			XPersistence.getManager().persist(reto);
			getView().refresh();
		} 
		
	}


}
