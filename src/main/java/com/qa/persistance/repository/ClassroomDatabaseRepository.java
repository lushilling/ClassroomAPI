package com.qa.persistance.repository;

import java.util.Collection;

import javax.enterprise.inject.Default;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import com.qa.persistance.domain.Trainee;
import com.qa.util.JSONUtil;

@Default
public class ClassroomDatabaseRepository implements ClassroomRepository {

	private JSONUtil json;

	private EntityManager em;

	public String reviewAllTrainees() {
		Query reviewAll = em.createQuery("SELECT c from Classroom c");
		Collection<Trainee> allTrainees = (Collection<Trainee>) reviewAll.getResultList();
		return json.getJSONForObject(allTrainees);
	}

	public String getTrainee(int id) {
		return json.getJSONForObject(em.find(Trainee.class, id));
	}

	public String createTrainee(String trainee) {
		em.persist(trainee);
		return json.returnMessage("Trainee created");
	}

	public String deleteTrainee(int traineeId) {
		em.remove(traineeId);
		return json.returnMessage("Trainee deleted");
	}

}
