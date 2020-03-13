/**
 * @author Yvette U.
 * Entity implementation class for Entity: class service
 *
 */

package org.perscholas.JPA.Services;

import java.lang.reflect.Member;
import java.util.List;

import javax.persistence.Query;

public class ClassService extends AbstractService {

	public ClassService() {
		super();

	}
	public void addClass(Class myClass) {
		em.getTransaction().begin();
		em.persist(myClass);
		em.getTransaction().commit();
	}

	public List<Class> getAllClasses() {
		Query query = em.createNamedQuery("GetaAllClasses");
		return query.getResultList();
	}

	public List<Class> getClassById(int id) {
		Query query = em.createNamedQuery("GetClassById");
		query.setParameter("searchId", id);
		return query.getResultList();
	}
	
}
