package mprofile.core.entity;
// Generated Sep 25, 2016 11:30:02 PM by Hibernate Tools 5.2.0.Beta1

/**
 * Logincredentails generated by hbm2java
 */
public class Logincredentails implements java.io.Serializable {

	private int id;
	private String password;
	private Integer statusId;
	private int userTypeId;
	private String acountCreateDate;

	public Logincredentails() {
	}

	public Logincredentails(int id, int userTypeId) {
		this.id = id;
		this.userTypeId = userTypeId;
	}

	public Logincredentails(int id, String password, Integer statusId, int userTypeId, String acountCreateDate) {
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

}
