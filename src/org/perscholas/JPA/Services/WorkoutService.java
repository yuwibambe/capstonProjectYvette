package org.perscholas.JPA.Services;

import java.lang.reflect.Member;
import java.util.List;

import javax.persistence.Query;

import org.perscholas.JPA.Entities.Workout;

public class WorkoutService extends AbstractService {

	public WorkoutService() {
		super();
	
	}
	public void addWorkout(Workout workout) {
		em.getTransaction().begin();
		em.persist(workout);
		em.getTransaction().commit();
	}

	public List<Workout> getAllWorkouts() {
		Query query = em.createNamedQuery("GetaAllWorkouts");
		return query.getResultList();
	}

	public List<Workout> getWorkoutById(int id) {
		Query query = em.createNamedQuery("GetWorkoutById");
		query.setParameter("searchId", id);
		return query.getResultList();
	}

}
