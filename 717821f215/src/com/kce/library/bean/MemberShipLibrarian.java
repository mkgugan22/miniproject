package com.kce.library.bean;

public class MemberShipLibrarian {
 public String memberName;
 public int memberAge;
 public String memberShipId;
 public String email;
 public int annualSubcription;
public MemberShipLibrarian(String memberName, int memberAge, String memberShipId, String email, int annualSubcription) {
	super();
	this.memberName = memberName;
	this.memberAge = memberAge;
	this.memberShipId = memberShipId;
	this.email = email;
	this.annualSubcription = annualSubcription;
}
public String getMemberName() {
	return memberName;
}
public void setMemberName(String memberName) {
	this.memberName = memberName;
}
public int getMemberAge() {
	return memberAge;
}
public void setMemberAge(int memberAge) {
	this.memberAge = memberAge;
}
public String getMemberShipId() {
	return memberShipId;
}
public void setMemberShipId(String memberShipId) {
	this.memberShipId = memberShipId;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getAnnualSubcription() {
	return annualSubcription;
}
public void setAnnualSubcription(int annualSubcription) {
	this.annualSubcription = annualSubcription;
}
@Override
public String toString() {
	return "MemberShipLibrarian [memberName=" + memberName + ", memberAge=" + memberAge + ", memberShipId="
			+ memberShipId + ", email=" + email + ", annualSubcription=" + annualSubcription + "]";
}

}
