package mprofile.core.entity;
// Generated Sep 23, 2016 5:09:00 PM by Hibernate Tools 5.2.0.Beta1

/**
 * HealthmanagertopatientId generated by hbm2java
 */
public class HealthmanagertopatientId implements java.io.Serializable {

	private int healthManagerId;
	private int patientId;

	public HealthmanagertopatientId() {
	}

	public HealthmanagertopatientId(int healthManagerId, int patientId) {
		this.healthManagerId = healthManagerId;
		this.patientId = patientId;
	}

	public int getHealthManagerId() {
		return this.healthManagerId;
	}

	public void setHealthManagerId(int healthManagerId) {
		this.healthManagerId = healthManagerId;
	}

	public int getPatientId() {
		return this.patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof HealthmanagertopatientId))
			return false;
		HealthmanagertopatientId castOther = (HealthmanagertopatientId) other;

		return (this.getHealthManagerId() == castOther.getHealthManagerId())
				&& (this.getPatientId() == castOther.getPatientId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getHealthManagerId();
		result = 37 * result + this.getPatientId();
		return result;
	}

}