package com.qa.persistance.repository;

import java.util.Collection;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import com.qa.persistance.domain.Trainee;
import com.qa.util.JSONUtil;

@Transactional(TxType.SUPPORTS)
@Default
public class ClassroomDatabaseRepository implements ClassroomRepository {


	private EntityManager em;
	
	@Inject
	private JSONUtil json;

	public String reviewAllTrainees() {
		Query reviewAll = em.createQuery("SELECT c from Classroom c");
		Collection<Trainee> allTrainees = (Collection<Trainee>) reviewAll.getResultList();
		return json.getJSONForObject(allTrainees);
	}

	@Override
	@Transactional(TxType.REQUIRED)
	public String getTrainee(int id) {
		return json.getJSONForObject(em.find(Trainee.class, id));
	}

	@Override
	@Transactional(TxType.REQUIRED)
	public String createTrainee(String trainee) {
		em.persist(trainee);
		return json.returnMessage("Trainee created");
	}

	@Override
	@Transactional(TxType.REQUIRED)
	public String deleteTrainee(int id) {
		em.remove(id);
		return json.returnMessage("Trainee deleted");
	}
	
	public void setEm(EntityManager em) {
		this.em = em;
	}

	public void setJson(JSONUtil json) {
		this.json = json;
	}
}
