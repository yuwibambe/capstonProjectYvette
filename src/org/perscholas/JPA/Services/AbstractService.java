/**
 * @author Yvette U.
 * Entity implementation class for AbstractService
 *
 */

package org.perscholas.JPA.Services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AbstractService {
		protected EntityManagerFactory emf;
		protected EntityManager em;

		public  AbstractService() {
			emf = Persistence.createEntityManagerFactory("mama");
			em = emf.createEntityManager();

		}
		public  AbstractService(String PU) {
			emf=Persistence.createEntityManagerFactory(PU);
			em=emf.createEntityManager();
		}
		public void closing() {
			em.close();
			emf.close();
		}
	}

