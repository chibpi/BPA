package org.openxava.test.model;

import java.math.*;

import javax.persistence.*;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.validator.*;
import org.openxava.annotations.*;
import org.openxava.calculators.*;

/**
 * 
 * @author Javier Paniza
 */

@TypeDef( 
	name="si_no",
	typeClass=org.openxava.types.SiNoType.class
)

@Entity
@IdClass(InvoiceKey.class)  // We reuse the key class for Invoice
@Table(name="INVOICE")
class Invoice4 {
	
	@Id @Column(length=4) @Max(9999l) @Required
	@DefaultValueCalculator(CurrentYearCalculator.class)
	int year
	
	@Id @Column(length=6) @Required
	int number
		
	@Required
	@DefaultValueCalculator(CurrentDateCalculator.class)
	java.util.Date date
		
	@Type(type="si_no")	
	boolean paid
		
}
