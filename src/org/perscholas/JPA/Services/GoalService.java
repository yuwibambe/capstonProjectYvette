/**
 * @author Yvette U.
 * Entity implementation class for Goal Service
 *
 */


package org.perscholas.JPA.Services;

import java.lang.reflect.Member;

import java.util.List;

import javax.persistence.Query;

import org.perscholas.JPA.Entities.Goal;


public class GoalService extends AbstractService {

	public GoalService() {
		super();
	}

	public void addGoal(Goal goal) {
		em.getTransaction().begin();
		em.persist(goal);
		em.getTransaction().commit();
	}

	public List<Goal> getAllgoals() {
		Query query = em.createNamedQuery("GetAllGoals");
		List<Goal> goalList = query.getResultList();
		 
		return goalList;
	}

	public List<Goal> getGoalByAccountName(String AccountName) {
		Query query = em.createNamedQuery("GetGoalByAccountName");
		query.setParameter("searchAccount", AccountName);
		return query.getResultList();
	}
	public void cleanup() {
		closing();
	}
}
