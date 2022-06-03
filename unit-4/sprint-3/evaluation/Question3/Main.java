package com.Question3;

import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		Song s1 = new Song();
		
		
		PlayList p1 = new PlayList();
		
		
		for (int i = 0; i < 4; i++) {

			System.out.println(i +"Enter song name ");
			String song = scn.next();
			s1.setSongName(song);

			System.out.println(i+"Enter movie name ");
			String movie = scn.next();
			s1.setMovieName(movie);

			p1.addSong(new Song());
			
			s1.play();

		}

		
		scn.close();
		
	}

}
