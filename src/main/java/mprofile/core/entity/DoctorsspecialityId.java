package mprofile.core.entity;
// Generated Sep 25, 2016 11:30:02 PM by Hibernate Tools 5.2.0.Beta1

/**
 * DoctorsspecialityId generated by hbm2java
 */
public class DoctorsspecialityId implements java.io.Serializable {

	private int doctorId;
	private int specialityId;
	private String yearsOfExperience;

	public DoctorsspecialityId() {
	}

	public DoctorsspecialityId(int doctorId, int specialityId, String yearsOfExperience) {
		this.doctorId = doctorId;
		this.specialityId = specialityId;
		this.yearsOfExperience = yearsOfExperience;
	}

	public int getDoctorId() {
		return this.doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public int getSpecialityId() {
		return this.specialityId;
	}

	public void setSpecialityId(int specialityId) {
		this.specialityId = specialityId;
	}

	public String getYearsOfExperience() {
		return this.yearsOfExperience;
	}

	public void setYearsOfExperience(String yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof DoctorsspecialityId))
			return false;
		DoctorsspecialityId castOther = (DoctorsspecialityId) other;

		return (this.getDoctorId() == castOther.getDoctorId())
				&& (this.getSpecialityId() == castOther.getSpecialityId())
				&& ((this.getYearsOfExperience() == castOther.getYearsOfExperience())
						|| (this.getYearsOfExperience() != null && castOther.getYearsOfExperience() != null
								&& this.getYearsOfExperience().equals(castOther.getYearsOfExperience())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getDoctorId();
		result = 37 * result + this.getSpecialityId();
		result = 37 * result + (getYearsOfExperience() == null ? 0 : this.getYearsOfExperience().hashCode());
		return result;
	}

}
