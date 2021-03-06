package mprofile.core.entity;
// Generated Sep 25, 2016 11:30:02 PM by Hibernate Tools 5.2.0.Beta1

/**
 * Medication generated by hbm2java
 */
public class Medication implements java.io.Serializable {

	private int medicationId;
	private Integer caseId;
	private Integer interactionId;
	private String medication;
	private String dosage;
	private Integer routineId;
	private Boolean isActive;

	public Medication() {
	}

	public Medication(int medicationId) {
		this.medicationId = medicationId;
	}

	public Medication(int medicationId, Integer caseId, Integer interactionId, String medication, String dosage,
			Integer routineId, Boolean isActive) {
		this.medicationId = medicationId;
		this.caseId = caseId;
		this.interactionId = interactionId;
		this.medication = medication;
		this.dosage = dosage;
		this.routineId = routineId;
		this.isActive = isActive;
	}

	public int getMedicationId() {
		return this.medicationId;
	}

	public void setMedicationId(int medicationId) {
		this.medicationId = medicationId;
	}

	public Integer getCaseId() {
		return this.caseId;
	}

	public void setCaseId(Integer caseId) {
		this.caseId = caseId;
	}

	public Integer getInteractionId() {
		return this.interactionId;
	}

	public void setInteractionId(Integer interactionId) {
		this.interactionId = interactionId;
	}

	public String getMedication() {
		return this.medication;
	}

	public void setMedication(String medication) {
		this.medication = medication;
	}

	public String getDosage() {
		return this.dosage;
	}

	public void setDosage(String dosage) {
		this.dosage = dosage;
	}

	public Integer getRoutineId() {
		return this.routineId;
	}

	public void setRoutineId(Integer routineId) {
		this.routineId = routineId;
	}

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

}
