package com.Question2;

public class Ticket {

	 private int ticketid; 
	 private int price;  
	 private int availableTickets;

 
	 public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ticket(int ticketid, int price) {
		super();
		this.ticketid = ticketid;
		this.price = price;
	}

	public int getTicketid() {
		return ticketid;
	}

	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	 
	public int getAvailableTickets() {
		return availableTickets;
	}	

	public void setAvailableTickets(int availableTickets) {
		if(availableTickets>0) {
			this.availableTickets = availableTickets;
		}
	}
	
	
	

	public int calculateTicketCost(int nooftickets){
		
		
		if(availableTickets > 0) {
			
			//int asach = this.availableTickets - nooftickets;
			setAvailableTickets(getAvailableTickets()-nooftickets);
			
			int total = nooftickets*price;
			
			
			return total;
		}
		
		else {
			return -1;
		}
	
	}
	
	
	
	
	
}
