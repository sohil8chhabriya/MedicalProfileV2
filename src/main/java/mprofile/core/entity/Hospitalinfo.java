package mprofile.core.entity;
// Generated Sep 25, 2016 11:30:02 PM by Hibernate Tools 5.2.0.Beta1

/**
 * Hospitalinfo generated by hbm2java
 */
public class Hospitalinfo implements java.io.Serializable {

	private HospitalinfoId id;
	private String name;
	private String streetAddress;
	private Integer totalBeds;
	private String emailId;
	private Integer phoneNo;
	private String dateOfEstablishment;
	private String dateCreated;
	private String dateModified;

	public Hospitalinfo() {
	}

	public Hospitalinfo(HospitalinfoId id) {
		this.id = id;
	}

	public Hospitalinfo(HospitalinfoId id, String name, String streetAddress, Integer totalBeds, String emailId,
			Integer phoneNo, String dateOfEstablishment, String dateCreated, String dateModified) {
		this.id = id;
		this.name = name;
		this.streetAddress = streetAddress;
		this.totalBeds = totalBeds;
		this.emailId = emailId;
		this.phoneNo = phoneNo;
		this.dateOfEstablishment = dateOfEstablishment;
		this.dateCreated = dateCreated;
		this.dateModified = dateModified;
	}

	public HospitalinfoId getId() {
		return this.id;
	}

	public void setId(HospitalinfoId id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreetAddress() {
		return this.streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public Integer getTotalBeds() {
		return this.totalBeds;
	}

	public void setTotalBeds(Integer totalBeds) {
		this.totalBeds = totalBeds;
	}

	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Integer getPhoneNo() {
		return this.phoneNo;
	}

	public void setPhoneNo(Integer phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getDateOfEstablishment() {
		return this.dateOfEstablishment;
	}

	public void setDateOfEstablishment(String dateOfEstablishment) {
		this.dateOfEstablishment = dateOfEstablishment;
	}

	public String getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getDateModified() {
		return this.dateModified;
	}

	public void setDateModified(String dateModified) {
		this.dateModified = dateModified;
	}

}
