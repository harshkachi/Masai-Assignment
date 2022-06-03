package com.Question2;

public class Hosteller extends Student {
	
	String hostelName;
	int roomNumber;
	
	
	public Hosteller() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Hosteller(String hostelName, int roomNumber) {
		super();
		this.hostelName = hostelName;
		this.roomNumber = roomNumber;
	}

	public String getHostelName() {
		return hostelName;
	}

	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	
	
	
	

}
