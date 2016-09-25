package mprofile.core.entity;
// Generated Sep 25, 2016 7:14:32 PM by Hibernate Tools 5.2.0.Beta1

/**
 * LogincredentailsId generated by hbm2java
 */
public class LogincredentailsId implements java.io.Serializable {

	private int id;
	private String password;
	private Integer statusId;
	private int userTypeId;
	private String acountCreateDate;

	public LogincredentailsId() {}

	public LogincredentailsId(int id, int userTypeId) {
		this.id = id;
		this.userTypeId = userTypeId;
	}

	public LogincredentailsId(int id, String password, Integer statusId, int userTypeId, String acountCreateDate) {
		this.id = id;
		this.password = password;
		this.statusId = statusId;
		this.userTypeId = userTypeId;
		this.acountCreateDate = acountCreateDate;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getStatusId() {
		return this.statusId;
	}

	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}

	public int getUserTypeId() {
		return this.userTypeId;
	}

	public void setUserTypeId(int userTypeId) {
		this.userTypeId = userTypeId;
	}

	public String getAcountCreateDate() {
		return this.acountCreateDate;
	}

	public void setAcountCreateDate(String acountCreateDate) {
		this.acountCreateDate = acountCreateDate;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof LogincredentailsId))
			return false;
		LogincredentailsId castOther = (LogincredentailsId) other;

		return (this.getId() == castOther.getId())
				&& ((this.getPassword() == castOther.getPassword()) || (this.getPassword() != null
						&& castOther.getPassword() != null && this.getPassword().equals(castOther.getPassword())))
				&& ((this.getStatusId() == castOther.getStatusId()) || (this.getStatusId() != null
						&& castOther.getStatusId() != null && this.getStatusId().equals(castOther.getStatusId())))
				&& (this.getUserTypeId() == castOther.getUserTypeId())
				&& ((this.getAcountCreateDate() == castOther.getAcountCreateDate())
						|| (this.getAcountCreateDate() != null && castOther.getAcountCreateDate() != null
								&& this.getAcountCreateDate().equals(castOther.getAcountCreateDate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getId();
		result = 37 * result + (getPassword() == null ? 0 : this.getPassword().hashCode());
		result = 37 * result + (getStatusId() == null ? 0 : this.getStatusId().hashCode());
		result = 37 * result + this.getUserTypeId();
		result = 37 * result + (getAcountCreateDate() == null ? 0 : this.getAcountCreateDate().hashCode());
		return result;
	}

}
