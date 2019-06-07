package com.qa.persistance.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Classroom {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int traineeId;
	@Column(length = 200)
	private String traineeName;
	@Column(length = 2)
	private int classroomId;
	@Column(length = 200)
	private String trainerName;

	public Classroom() {

	}

	public Classroom(int traineeId, String traineeName, int classroomId, String trainerName) {
		super();
		this.traineeId = traineeId;
		this.traineeName = traineeName;
		this.classroomId = classroomId;
		this.setTrainerName(trainerName);
	}

	public int getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
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
