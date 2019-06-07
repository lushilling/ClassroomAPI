package com.qa.business.service;

import javax.inject.Inject;

import com.qa.persistance.repository.ClassroomRepository;

public class ClassroomServiceImplementaion implements ClassroomService {

	@Inject
	private ClassroomRepository classroomRepo;
	
	
	public String reviewAllTrainees() {
		return classroomRepo.reviewAllTrainees();
	}


	public String getTrainee(int id) {
		return classroomRepo.getTrainee(id);
	}


	@Override
	public String createTrainee(String trainee) {
		return classroomRepo.createTrainee(trainee);
	}


	@Override
	public String deleteTrainee(int traineeId) {
		return classroomRepo.deleteTrainee(traineeId);
	}

}
