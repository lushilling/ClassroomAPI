package com.qa.persistance.repository;

import java.util.Collection;

import javax.enterprise.inject.Default;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.qa.persistance.domain.Classroom;
import com.qa.util.JSONUtil;

@Default
public class ClassroomDatabaseRepository implements ClassroomRepository {

	private JSONUtil json;

	private EntityManager em;

	public String reviewAllTrainees() {
		Query reviewAll = em.createQuery("SELECT c from Classroom c");
		Collection<Classroom> allTrainees = (Collection<Classroom>) reviewAll.getResultList();
		return json.getJSONForObject(allTrainees);
	}

	public String getTrainee(int id) {
		return json.getJSONForObject(em.find(Classroom.class, id));
	}

	public String createTrainee(String trainee) {
		em.persist(trainee);
		return json.returnMessage("Trainee created");
	}

}
