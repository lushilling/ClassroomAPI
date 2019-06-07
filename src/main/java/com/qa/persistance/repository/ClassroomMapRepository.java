package com.qa.persistance.repository;

import java.util.HashMap;
import java.util.Map;

import javax.enterprise.inject.Alternative;

import com.qa.persistance.domain.Classroom;
import com.qa.util.JSONUtil;

@Alternative
public class ClassroomMapRepository implements ClassroomRepository {

	Map<Integer, Classroom> classroomMap = new HashMap<Integer, Classroom>();

	private JSONUtil json;

	public String reviewAllTrainees() {
		return json.getJSONForObject(classroomMap);
	}

	public String getTrainee(int id) {
		return json.getJSONForObject(classroomMap.get(id));

	}

	
	public String createTrainee(String trainee) {
		Classroom newTrainee = json.getObjectForJSON(trainee, Classroom.class);
		classroomMap.put(newTrainee.getTraineeId(), newTrainee);
		return "New trainee created";
	}

}
