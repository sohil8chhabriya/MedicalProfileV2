package mprofile.core.entity;
// Generated Sep 25, 2016 11:30:02 PM by Hibernate Tools 5.2.0.Beta1

/**
 * Alergytest generated by hbm2java
 */
public class Alergytest implements java.io.Serializable {

	private int testId;
	private String testReport;
	private String date;
	private String time;
	private Integer labId;

	public Alergytest() {
	}

	public Alergytest(int testId) {
		this.testId = testId;
	}

	public Alergytest(int testId, String testReport, String date, String time, Integer labId) {
		this.testId = testId;
		this.testReport = testReport;
		this.date = date;
		this.time = time;
		this.labId = labId;
	}

	public int getTestId() {
		return this.testId;
	}

	public void setTestId(int testId) {
		this.testId = testId;
	}

	public String getTestReport() {
		return this.testReport;
	}

	public void setTestReport(String testReport) {
		this.testReport = testReport;
	}

	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Integer getLabId() {
		return this.labId;
	}

	public void setLabId(Integer labId) {
		this.labId = labId;
	}

}
