package org.perscholas.JPA.Entities;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Workout
 *
 */
@Entity
@Table(name="workout")
public class Workout implements Serializable {

	   
	@Id
	private int workoutId;
	private String workoutDesc;
	private char date;
	
    
	

	public Workout(int workoutId, String workoutDesc, char date, int memberId) {
		super();
		this.workoutId = workoutId;
		this.workoutDesc = workoutDesc;
		this.date = date;
		
	}
	private static final long serialVersionUID = 1L;
	

	public Workout() {
		super();
	}   
	public int getWorkoutId() {
		return this.workoutId;
	}

	public void setWorkoutId(int workoutId) {
		this.workoutId = workoutId;
	}   
	public String getWorkoutDesc() {
		return this.workoutDesc;
	}

	public void setWorkoutDesc(String workoutDesc) {
		this.workoutDesc = workoutDesc;
	}   
	public char getDate() {
		return this.date;
	}

	public void setDate(char date) {
		this.date = date;
	}   
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + date;
		result = prime * result + ((workoutDesc == null) ? 0 : workoutDesc.hashCode());
		result = prime * result + workoutId;
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
		Workout other = (Workout) obj;
		if (date != other.date)
			return false;
		
		if (workoutDesc == null) {
			if (other.workoutDesc != null)
				return false;
		} else if (!workoutDesc.equals(other.workoutDesc))
			return false;
		if (workoutId != other.workoutId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Workout [workoutId=" + workoutId + ", workoutDesc=" + workoutDesc + ", date=" + date + "]";
	}
	
	}
   

