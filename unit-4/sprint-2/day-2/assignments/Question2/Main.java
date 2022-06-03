package com.Question2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		Ticket tik = new Ticket();

		System.out.println("Enter no of bookings");
		int book = scn.nextInt();
		
		System.out.println("Enter the available tickets");
		int noTicket = scn.nextInt();
		tik.setAvailableTickets(noTicket);
		
		System.out.println("----------------------------------------");
		
		
		for(int i=0; i<book; i++) {
			
			//1st 
			System.out.println(i+1+".Enter the ticketid");
			int id = scn.nextInt();
			tik.setTicketid(id);
		
			
			System.out.println(i+1+".Enter the Price");
			int price = scn.nextInt();
			tik.setPrice(price);
			
			
			System.out.println(i+1+".Enter the no of tickets");
			int noofTicket = scn.nextInt();
			//tik.setAvailableTickets(noofTicket);
			
			
			System.out.println("Total Amount :" + tik.calculateTicketCost(noofTicket));
			System.out.println("Available ticket after booking: "+ tik.getAvailableTickets());
			
			System.out.println("============================================");
		}
		scn.close();
	}
}
