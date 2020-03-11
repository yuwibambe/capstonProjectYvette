package org.perscholas.JPA.Entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



/**
 * Entity implementation class for Entity: MemberLog
 *
 */
@Entity
@Table(name = "MemberLog")

public class MemberLog implements Serializable {
	@Id
	private int logId;
	private int memberId;
	private int calorieId;
	private int classsId;
	private int weightId;
	private int workoutId;

	@OneToMany(targetEntity=Member.class)
	private List<Member>memberList;
	
	@OneToMany(targetEntity=Workout.class)
	private List<Workout>WorkoutList;
	
	@OneToMany(targetEntity=Class.class)
	private List<Class>ClassList;
	
	@OneToMany(targetEntity=Weight.class)
	private List<Weight>WeightList;
	
	@OneToMany(targetEntity=Calorie.class)
	private List<Calorie>CalorieList;
	
	public MemberLog(int logId, int memberId, int calorieId, int classsId, int weightId, int workoutId,
			List<Member>memberList,List<Workout>WorkoutList,List<Class>ClassList,List<Weight>WeightList,List<Calorie>CalorieList) {
		super();
		this.logId = logId;
		this.memberId = memberId;
		this.calorieId = calorieId;
		this.classsId = classsId;
		this.weightId = weightId;
		this.workoutId = workoutId;
	}

	private static final long serialVersionUID = 1L;

	public MemberLog() {
		super();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + memberId;
		result = prime * result + calorieId;
		result = prime * result + classsId;
		result = prime * result + logId;
		result = prime * result + weightId;
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
		MemberLog other = (MemberLog) obj;
		if (memberId != other.memberId)
			return false;
		if (calorieId != other.calorieId)
			return false;
		if (classsId != other.classsId)
			return false;
		if (logId != other.logId)
			return false;
		if (weightId != other.weightId)
			return false;
		if (workoutId != other.workoutId)
			return false;
		return true;
	}

}
