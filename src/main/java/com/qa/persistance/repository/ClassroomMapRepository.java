package com.qa.persistance.repository;

import java.util.HashMap;
import java.util.Map;

import javax.enterprise.inject.Alternative;

import com.qa.persistance.domain.Trainee;
import com.qa.util.JSONUtil;

@Alternative
public class ClassroomMapRepository implements ClassroomRepository {

	Map<Integer, Trainee> classroomMap = new HashMap<Integer, Trainee>();

	private JSONUtil json;

	public String reviewAllTrainees() {
		return json.getJSONForObject(classroomMap);
	}

	public String getTrainee(int id) {
		return json.getJSONForObject(classroomMap.get(id));

	}

	public String createTrainee(String trainee) {
		Trainee newTrainee = json.getObjectForJSON(trainee, Trainee.class);
		classroomMap.put(newTrainee.getTraineeId(), newTrainee);
		return json.returnMessage("New trainee created");
	}

	public String deleteTrainee(int id) {
		classroomMap.remove((Integer) id);
		return json.returnMessage("Trainee deleted");
	}

}
