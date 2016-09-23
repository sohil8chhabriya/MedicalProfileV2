package mprofile.core.entity;
// Generated Sep 23, 2016 5:09:00 PM by Hibernate Tools 5.2.0.Beta1

/**
 * HospitalinfoId generated by hbm2java
 */
public class HospitalinfoId implements java.io.Serializable {

	private int hospitalId;
	private int branchOf;

	public HospitalinfoId() {
	}

	public HospitalinfoId(int hospitalId, int branchOf) {
		this.hospitalId = hospitalId;
		this.branchOf = branchOf;
	}

	public int getHospitalId() {
		return this.hospitalId;
	}

	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}

	public int getBranchOf() {
		return this.branchOf;
	}

	public void setBranchOf(int branchOf) {
		this.branchOf = branchOf;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof HospitalinfoId))
			return false;
		HospitalinfoId castOther = (HospitalinfoId) other;

		return (this.getHospitalId() == castOther.getHospitalId()) && (this.getBranchOf() == castOther.getBranchOf());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getHospitalId();
		result = 37 * result + this.getBranchOf();
		return result;
	}

}