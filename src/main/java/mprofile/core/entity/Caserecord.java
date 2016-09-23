package mprofile.core.entity;
// Generated Sep 23, 2016 5:09:00 PM by Hibernate Tools 5.2.0.Beta1

/**
 * Caserecord generated by hbm2java
 */
public class Caserecord implements java.io.Serializable {

	private int id;
	private String description;
	private Integer emrId;
	private String startDate;
	private String endDate;
	private String caseSummary;
	private Boolean isReadOnly;

	public Caserecord() {
	}

	public Caserecord(int id) {
		this.id = id;
	}

	public Caserecord(int id, String description, Integer emrId, String startDate, String endDate, String caseSummary,
			Boolean isReadOnly) {
		this.id = id;
		this.description = description;
		this.emrId = emrId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.caseSummary = caseSummary;
		this.isReadOnly = isReadOnly;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getEmrId() {
		return this.emrId;
	}

	public void setEmrId(Integer emrId) {
		this.emrId = emrId;
	}

	public String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return this.endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getCaseSummary() {
		return this.caseSummary;
	}

	public void setCaseSummary(String caseSummary) {
		this.caseSummary = caseSummary;
	}

	public Boolean getIsReadOnly() {
		return this.isReadOnly;
	}

	public void setIsReadOnly(Boolean isReadOnly) {
		this.isReadOnly = isReadOnly;
	}

}