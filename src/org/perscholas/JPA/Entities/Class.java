/**
 * @author Yvette U.
 * Entity implementation class for Entity: Classe
 *
 */
package org.perscholas.JPA.Entities;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Class
 *
 */
@Entity
@Table(name="class")
public class Class implements Serializable {

	   
	@Id
	private int classsId;
	private String className;
	
    
	private static final long serialVersionUID = 1L;
	public Class(int classsId, String className, int memberId) {
		super();
		this.classsId = classsId;
		this.className = className;

		
	}
	public Class() {
		super();
	}   
	public int getClasssId() {
		return this.classsId;
	}

	public void setClasssId(int classsId) {
		this.classsId = classsId;
	}   
	public String getClassName() {
		return this.className;
	}

	public void setClassName(String className) {
		this.className = className;
	}   
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((className == null) ? 0 : className.hashCode());
		result = prime * result + classsId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Class other = (Class) obj;
		if (className == null) {
			if (other.className != null)
				return false;
		} else if (!className.equals(other.className))
			return false;
		if (classsId != other.classsId)
			return false;
		return true;
	}
	
	}
   

