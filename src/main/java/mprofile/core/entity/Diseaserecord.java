package mprofile.core.entity;
// Generated Sep 25, 2016 7:14:32 PM by Hibernate Tools 5.2.0.Beta1

/**
 * Diseaserecord generated by hbm2java
 */
public class Diseaserecord implements java.io.Serializable {

	private int id;
	private int emrId;
	private Integer interactionId;
	private int diseaseId;

	public Diseaserecord() {
	}

	public Diseaserecord(int id, int emrId, int diseaseId) {
		this.id = id;
		this.emrId = emrId;
		this.diseaseId = diseaseId;
	}

	public Diseaserecord(int id, int emrId, Integer interactionId, int diseaseId) {
		this.id = id;
		this.emrId = emrId;
		this.interactionId = interactionId;
		this.diseaseId = diseaseId;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEmrId() {
		return this.emrId;
	}

	public void setEmrId(int emrId) {
		this.emrId = emrId;
	}

	public Integer getInteractionId() {
		return this.interactionId;
	}

	public void setInteractionId(Integer interactionId) {
		this.interactionId = interactionId;
	}

	public int getDiseaseId() {
		return this.diseaseId;
	}

	public void setDiseaseId(int diseaseId) {
		this.diseaseId = diseaseId;
	}

}
