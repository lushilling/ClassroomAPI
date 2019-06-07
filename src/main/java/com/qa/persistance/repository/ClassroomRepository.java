package com.qa.persistance.repository;

public interface ClassroomRepository {

	String reviewAllTrainees();

	String getTrainee(int id);

	String createTrainee(String trainee);
	
	String deleteTrainee(int id);
}
