/**
 * @author Yvette U.
 * Entity implementation class for Entity: Weight
 *
 */

package org.perscholas.JPA.Entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Weight
 *
 */
@Entity
@Table(name="weight")
public class Weight implements Serializable {

	   
	@Id
	private int weightId;
	private float WeightNum;
	private char date;
	private static final long serialVersionUID = 1L;
	

	public Weight(int weightId, float weightNum, char date) {
		super();
		this.weightId = weightId;
		WeightNum = weightNum;
		this.date = date;
	}
	public Weight() {
		super();
	}   
	public int getWeightId() {
		return this.weightId;
	}

	public void setWeightId(int weightId) {
		this.weightId = weightId;
	}   
	public float getWeightNum() {
		return this.WeightNum;
	}

	public void setWeightNum(float WeightNum) {
		this.WeightNum = WeightNum;
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
		result = prime * result + Float.floatToIntBits(WeightNum);
		result = prime * result + date;
		result = prime * result + weightId;
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
		Weight other = (Weight) obj;
		if (Float.floatToIntBits(WeightNum) != Float.floatToIntBits(other.WeightNum))
			return false;
		if (date != other.date)
		if (weightId != other.weightId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Weight [weightId=" + weightId + ", WeightNum=" + WeightNum + ", date=" + date +  "]";
	}
   
}
