package com.qa.business.service;

public interface ClassroomService {

	String reviewAllTrainees();
	String getTrainee(int id);
	String createTrainee(String trainee);
	String deleteTrainee(int traineeId);
}
