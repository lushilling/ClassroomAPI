package com.qa.persistance.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trainee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(length = 200)
	private String traineeName;
	@Column(length = 2)
	private int classroomId;
	@Column(length = 200)
	private String trainerName;

	public Trainee() {

	}

	public Trainee(int traineeId, String traineeName, int classroomId, String trainerName) {
		super();
		this.id = traineeId;
		this.traineeName = traineeName;
		this.classroomId = classroomId;
		this.trainerName = trainerName;
	}

	public int getTraineeId() {
		return id;
	}

	public void setTraineeId(int traineeId) {
		this.id = traineeId;
	}

	public String getTraineeName() {
		return traineeName;
	}

	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

	public int getClassroomId() {
		return classroomId;
	}

	public void setClassroomId(int classroomId) {
		this.classroomId = classroomId;
	}

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

}
