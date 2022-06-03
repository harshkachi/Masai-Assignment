package com.Question2;

public class Members implements Comparable<Members> {
	
	int memberId;
	String memberName;
	int membershipNo;
	String membershipEnddate;
	
	public Members() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Members(int memberId, String memberName, int membershipNo, String membershipEnddate) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.membershipNo = membershipNo;
		this.membershipEnddate = membershipEnddate;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getMembershipNo() {
		return membershipNo;
	}

	public void setMembershipNo(int membershipNo) {
		this.membershipNo = membershipNo;
	}

	public String getMembershipEnddate() {
		return membershipEnddate;
	}

	public void setMembershipEnddate(String membershipEnddate) {
		this.membershipEnddate = membershipEnddate;
	}
	
	
	@Override
	public String toString() {
		
		return "Member Id :  "+getMemberId() + " Member Name : "+getMemberName()+
				" Membership No. : "+getMembershipNo() + " End date : "+getMembershipEnddate();
	}
	
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj == null)
			return false;
		
		if(this == obj) {
			return true;
		}
		
		if(this.getClass() != obj.getClass())
			return false;
		
		Members o = (Members) obj;
		
		return (this.getMemberId() == o.getMemberId() && this.getMembershipNo() == o.getMembershipNo());
	}
	
	
	@Override
	public int hashCode() {
		
		return getMemberId();
	}
	
	
	
	@Override
	public int compareTo(Members o) {
		
		
		return this.getMembershipEnddate().compareTo(o.getMembershipEnddate());
		
	}

}
