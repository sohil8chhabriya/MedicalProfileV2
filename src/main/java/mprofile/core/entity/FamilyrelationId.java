package mprofile.core.entity;
// Generated Sep 25, 2016 11:30:02 PM by Hibernate Tools 5.2.0.Beta1

/**
 * FamilyrelationId generated by hbm2java
 */
public class FamilyrelationId implements java.io.Serializable {

	private int user1;
	private int user2;
	private int relationshipTypeId;

	public FamilyrelationId() {
	}

	public FamilyrelationId(int user1, int user2, int relationshipTypeId) {
		this.user1 = user1;
		this.user2 = user2;
		this.relationshipTypeId = relationshipTypeId;
	}

	public int getUser1() {
		return this.user1;
	}

	public void setUser1(int user1) {
		this.user1 = user1;
	}

	public int getUser2() {
		return this.user2;
	}

	public void setUser2(int user2) {
		this.user2 = user2;
	}

	public int getRelationshipTypeId() {
		return this.relationshipTypeId;
	}

	public void setRelationshipTypeId(int relationshipTypeId) {
		this.relationshipTypeId = relationshipTypeId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof FamilyrelationId))
			return false;
		FamilyrelationId castOther = (FamilyrelationId) other;

		return (this.getUser1() == castOther.getUser1()) && (this.getUser2() == castOther.getUser2())
				&& (this.getRelationshipTypeId() == castOther.getRelationshipTypeId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getUser1();
		result = 37 * result + this.getUser2();
		result = 37 * result + this.getRelationshipTypeId();
		return result;
	}

}
