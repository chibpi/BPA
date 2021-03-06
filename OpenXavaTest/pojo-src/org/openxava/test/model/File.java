package org.openxava.test.model;

import javax.persistence.*;

/**
 * 
 * @author Javier Paniza 
 */

@Entity
public class File extends Nameable {
	
	@ManyToOne
	private FilesFolder folder;

	public FilesFolder getFolder() {
		return folder;
	}

	public void setFolder(FilesFolder folder) {
		this.folder = folder;
	}

}
