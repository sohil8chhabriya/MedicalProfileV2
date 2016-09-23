package mprofile.core.entity;
// Generated Sep 23, 2016 5:09:00 PM by Hibernate Tools 5.2.0.Beta1

/**
 * DoctorsinhospitalId generated by hbm2java
 */
public class DoctorsinhospitalId implements java.io.Serializable {

	private int doctorId;
	private int hospitalId;
	private int jobRoleId;

	public DoctorsinhospitalId() {
	}

	public DoctorsinhospitalId(int doctorId, int hospitalId, int jobRoleId) {
		this.doctorId = doctorId;
		this.hospitalId = hospitalId;
		this.jobRoleId = jobRoleId;
	}

	public int getDoctorId() {
		return this.doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public int getHospitalId() {
		return this.hospitalId;
	}

	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}

	public int getJobRoleId() {
		return this.jobRoleId;
	}

	public void setJobRoleId(int jobRoleId) {
		this.jobRoleId = jobRoleId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof DoctorsinhospitalId))
			return false;
		DoctorsinhospitalId castOther = (DoctorsinhospitalId) other;

		return (this.getDoctorId() == castOther.getDoctorId()) && (this.getHospitalId() == castOther.getHospitalId())
				&& (this.getJobRoleId() == castOther.getJobRoleId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getDoctorId();
		result = 37 * result + this.getHospitalId();
		result = 37 * result + this.getJobRoleId();
		return result;
	}

}
