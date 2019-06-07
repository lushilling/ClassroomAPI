package com.qa.persistance.repository;

import java.util.HashMap;
import java.util.Map;

import javax.enterprise.inject.Alternative;

import com.qa.persistance.domain.Classroom;
import com.qa.util.JSONUtil;

@Alternative
public class ClassroomMapRepository implements ClassroomRepository {

	Map<Integer, Classroom> classroomMap = new HashMap<Integer, Classroom>();
	
	private JSONUtil util;
	
	public String reviewAllTrainees() {
		return util.getJSONForObject(classroomMap);
	}

}
