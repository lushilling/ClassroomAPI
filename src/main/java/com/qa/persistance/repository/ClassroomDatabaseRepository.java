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
		Collection<Classroom> allTrainees = (Collection<Classroom>)reviewAll.getResultList();
		return json.getJSONForObject(allTrainees);
	}

}
