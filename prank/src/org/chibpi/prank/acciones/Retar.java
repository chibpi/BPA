package org.chibpi.prank.acciones;

import org.chibpi.prank.modelo.*;
import org.openxava.actions.*;
import org.openxava.jpa.*;

public class Retar extends CollectionBaseAction{

	@Override
	public void execute() throws Exception {
		for (Object o: getSelectedObjects()) {
			Reto reto = (Reto) o;
			reto.setEstado(Reto.Estado.Propuesto);
			XPersistence.getManager().persist(reto);
		}
	}

}
