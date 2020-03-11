/**
 * Entity implementation class for Entity: Calorie
 *
 */

package org.perscholas.JPA.Entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Calorie
 *
 */
@Entity
@Table(name = "calorie")
public class Calorie implements Serializable {

	@Id
	private int calorieId;
	private float calorieNum;
	private char date;
	
    @OneToMany(targetEntity = MemberLog.class)
	private List<MemberLog> memberLogList;
	private static final long serialVersionUID = 1L;

	public Calorie(int calorieId, float calorieNum, char date, List<MemberLog> memberLogList) {
		super();
		this.calorieId = calorieId;
		this.calorieNum = calorieNum;
		this.date = date;
	}

	public Calorie() {
		super();
	}

	public int getCalorieId() {
		return this.calorieId;
	}

	public void setCalorieId(int calorieId) {
		this.calorieId = calorieId;
	}

	public float getCalorieNum() {
		return this.calorieNum;
	}

	public void setCalorieNum(float calorieNum) {
		this.calorieNum = calorieNum;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + calorieId;
		result = prime * result + Float.floatToIntBits(calorieNum);
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
		Calorie other = (Calorie) obj;
		if (calorieId != other.calorieId)
			return false;
		if (Float.floatToIntBits(calorieNum) != Float.floatToIntBits(other.calorieNum))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Calorie [calorieId=" + calorieId + ", calorieNum=" + calorieNum + "]";
	}

}
