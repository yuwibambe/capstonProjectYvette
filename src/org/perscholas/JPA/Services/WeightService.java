package org.perscholas.JPA.Services;

import java.lang.reflect.Member;
import java.util.List;

import javax.persistence.Query;

import org.perscholas.JPA.Entities.Weight;

public class WeightService extends AbstractService {

	public WeightService() {
		super();
	}

	public void addWeight(Weight weight) {
		em.getTransaction().begin();
		em.persist(weight);
		em.getTransaction().commit();
	}

	public List<Weight> getAllWeights() {
		Query query = em.createNamedQuery("GetaAllWeights");
		return query.getResultList();
	}

	public List<Weight> getWeightById(int id) {
		Query query = em.createNamedQuery("GetWeightById");
		query.setParameter("searchId", id);
		return query.getResultList();
	}
}
