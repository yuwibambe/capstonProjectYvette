/**
 *
 */
package org.perscholas.JPA.Services;

import java.util.List;

import javax.persistence.Query;

import org.perscholas.JPA.Entities.Member;

/**
 * @author CTStudent
 *
 */
public class MService extends AbstractService {

// add
	public void add(Member member) {
		em.getTransaction().begin();
		em.persist(member);
		em.getTransaction().commit();

	}

// find all
	public List<Member> getAll() {
		Query query = em.createNamedQuery("GetAllMembers");
		List<Member> custList = query.getResultList();
		for (Member c : custList) {
//System.out.println(c);
		}
		return custList;
	}

// update
	public boolean update(int id, String password) {
		em.getTransaction().begin();
		Member ctg = em.find(Member.class, id);
		ctg.setPassword(password);
		em.getTransaction().commit();
		return true;
	}

// delete by id
	public void deleteById(int id) {
		Query query = em.createNamedQuery("DeleteMemberbyId");
		em.getTransaction().begin();
		Member foundCustomer = em.find(Member.class, id);
		em.remove(foundCustomer);
		em.getTransaction().commit();
	}
}
