package mprofile.core.entity;
// Generated Sep 25, 2016 11:30:02 PM by Hibernate Tools 5.2.0.Beta1

/**
 * InteractionId generated by hbm2java
 */
public class InteractionId implements java.io.Serializable {

	private int interactionId;
	private int caseRecordId;

	public InteractionId() {
	}

	public InteractionId(int interactionId, int caseRecordId) {
		this.interactionId = interactionId;
		this.caseRecordId = caseRecordId;
	}

	public int getInteractionId() {
		return this.interactionId;
	}

	public void setInteractionId(int interactionId) {
		this.interactionId = interactionId;
	}

	public int getCaseRecordId() {
		return this.caseRecordId;
	}

	public void setCaseRecordId(int caseRecordId) {
		this.caseRecordId = caseRecordId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof InteractionId))
			return false;
		InteractionId castOther = (InteractionId) other;

		return (this.getInteractionId() == castOther.getInteractionId())
				&& (this.getCaseRecordId() == castOther.getCaseRecordId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getInteractionId();
		result = 37 * result + this.getCaseRecordId();
		return result;
	}

}
