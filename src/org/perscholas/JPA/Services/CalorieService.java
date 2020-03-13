/**
 * @author Yvette U.
 * Entity implementation class for calorie service
 *
 */
package org.perscholas.JPA.Services;

import java.util.List;

import javax.persistence.Query;

import org.perscholas.JPA.Entities.Calorie;

public class CalorieService extends AbstractService {

	public CalorieService() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void addCalori(Calorie calorie) {
		em.getTransaction().begin();
		em.persist(calorie);
		em.getTransaction().commit();
	}

	public List<Calorie> getAllCalories() {
		Query query = em.createNamedQuery("GetaAllCalories");
		return query.getResultList();
	}

	public List<Calorie> getCalorieById(int id) {
		Query query = em.createNamedQuery("GetCalorieById");
		query.setParameter("searchId", id);
		return query.getResultList();
	}
}
