package mprofile.core.entity;
// Generated Sep 23, 2016 5:09:00 PM by Hibernate Tools 5.2.0.Beta1

/**
 * Interaction generated by hbm2java
 */
public class Interaction implements java.io.Serializable {

	private InteractionId id;
	private Integer doctorId;
	private Integer hospitalId;
	private String date;
	private String time;
	private int interactionCount;
	private String precautions;
	private String illness;
	private String patientSymptoms;
	private Boolean closeCase;
	private String interactionSessionDuration;
	private String illnessDurationSession;

	public Interaction() {
	}

	public Interaction(InteractionId id, int interactionCount) {
		this.id = id;
		this.interactionCount = interactionCount;
	}

	public Interaction(InteractionId id, Integer doctorId, Integer hospitalId, String date, String time,
			int interactionCount, String precautions, String illness, String patientSymptoms, Boolean closeCase,
			String interactionSessionDuration, String illnessDurationSession) {
		this.id = id;
		this.doctorId = doctorId;
		this.hospitalId = hospitalId;
		this.date = date;
		this.time = time;
		this.interactionCount = interactionCount;
		this.precautions = precautions;
		this.illness = illness;
		this.patientSymptoms = patientSymptoms;
		this.closeCase = closeCase;
		this.interactionSessionDuration = interactionSessionDuration;
		this.illnessDurationSession = illnessDurationSession;
	}

	public InteractionId getId() {
		return this.id;
	}

	public void setId(InteractionId id) {
		this.id = id;
	}

	public Integer getDoctorId() {
		return this.doctorId;
	}

	public void setDoctorId(Integer doctorId) {
		this.doctorId = doctorId;
	}

	public Integer getHospitalId() {
		return this.hospitalId;
	}

	public void setHospitalId(Integer hospitalId) {
		this.hospitalId = hospitalId;
	}

	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getInteractionCount() {
		return this.interactionCount;
	}

	public void setInteractionCount(int interactionCount) {
		this.interactionCount = interactionCount;
	}

	public String getPrecautions() {
		return this.precautions;
	}

	public void setPrecautions(String precautions) {
		this.precautions = precautions;
	}

	public String getIllness() {
		return this.illness;
	}

	public void setIllness(String illness) {
		this.illness = illness;
	}

	public String getPatientSymptoms() {
		return this.patientSymptoms;
	}

	public void setPatientSymptoms(String patientSymptoms) {
		this.patientSymptoms = patientSymptoms;
	}

	public Boolean getCloseCase() {
		return this.closeCase;
	}

	public void setCloseCase(Boolean closeCase) {
		this.closeCase = closeCase;
	}

	public String getInteractionSessionDuration() {
		return this.interactionSessionDuration;
	}

	public void setInteractionSessionDuration(String interactionSessionDuration) {
		this.interactionSessionDuration = interactionSessionDuration;
	}

	public String getIllnessDurationSession() {
		return this.illnessDurationSession;
	}

	public void setIllnessDurationSession(String illnessDurationSession) {
		this.illnessDurationSession = illnessDurationSession;
	}

}