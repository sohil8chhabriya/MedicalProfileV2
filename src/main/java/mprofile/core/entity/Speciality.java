package mprofile.core.entity;
// Generated Sep 25, 2016 11:30:02 PM by Hibernate Tools 5.2.0.Beta1

/**
 * Speciality generated by hbm2java
 */
public class Speciality implements java.io.Serializable {

	private int specialityId;
	private String specialityInfo;

	public Speciality() {
	}

	public Speciality(int specialityId) {
		this.specialityId = specialityId;
	}

	public Speciality(int specialityId, String specialityInfo) {
		this.specialityId = specialityId;
		this.specialityInfo = specialityInfo;
	}

	public int getSpecialityId() {
		return this.specialityId;
	}

	public void setSpecialityId(int specialityId) {
		this.specialityId = specialityId;
	}

	public String getSpecialityInfo() {
		return this.specialityInfo;
	}

	public void setSpecialityInfo(String specialityInfo) {
		this.specialityInfo = specialityInfo;
	}

}
