package mprofile.core.entity;
// Generated Sep 23, 2016 5:09:00 PM by Hibernate Tools 5.2.0.Beta1

/**
 * Hospitaldepartmentrecord generated by hbm2java
 */
public class Hospitaldepartmentrecord implements java.io.Serializable {

	private HospitaldepartmentrecordId id;
	private Integer departmentId;

	public Hospitaldepartmentrecord() {
	}

	public Hospitaldepartmentrecord(HospitaldepartmentrecordId id) {
		this.id = id;
	}

	public Hospitaldepartmentrecord(HospitaldepartmentrecordId id, Integer departmentId) {
		this.id = id;
		this.departmentId = departmentId;
	}

	public HospitaldepartmentrecordId getId() {
		return this.id;
	}

	public void setId(HospitaldepartmentrecordId id) {
		this.id = id;
	}

	public Integer getDepartmentId() {
		return this.departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

}
