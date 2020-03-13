/**
 * @author Yvette U.
 * Entity implementation class for Entity: Goal
 *
 */

package org.perscholas.JPA.Entities;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Goal
 *
 */
@Entity
@NamedQueries({
@NamedQuery(query="select  g from Goal g",name ="GetAllGoals")
})
@Table(name = "goal")
public class Goal implements Serializable {

	   
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int goalId;
	private double weight;
	private int caloriNum;
	private String workoutDesc;
	private String goalDesc;
	private static final long serialVersionUID = 1L;
	
	@OneToOne(targetEntity=Member.class)
	private Member member;


	 
/**
	 * @param weight
	 * @param caloriNum
	 * @param workoutDesc
	 * @param goalDesc
	 * @param member
	 */
	public Goal(double weight, int caloriNum, String workoutDesc, String goalDesc, Member member) {
		super();
		this.weight = weight;
		this.caloriNum = caloriNum;
		this.workoutDesc = workoutDesc;
		this.goalDesc = goalDesc;
		this.member = member;
	}

public Goal() {
	
}

	public int getGoalId() {
		return goalId;
	}


	public void setGoalId(int goalId) {
		this.goalId = goalId;
	}


	public int getCaloriNum() {
		return caloriNum;
	}


	public void setCaloriNum(int caloriNum) {
		this.caloriNum = caloriNum;
	}


	public String getWorkoutDesc() {
		return workoutDesc;
	}


	public void setWorkoutDesc(String workoutDesc) {
		this.workoutDesc = workoutDesc;
	}


	public String getGoalDesc() {
		return goalDesc;
	}


	public void setGoalDesc(String goalDesc) {
		this.goalDesc = goalDesc;
	}


	public Member getMember() {
		return member;
	}


	public void setMember(Member member) {
		this.member = member;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

 
}
	