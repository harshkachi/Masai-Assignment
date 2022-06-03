package com.Question3;

import java.util.ArrayList;

public class PlayList {
	
	ArrayList<Song> lists = new ArrayList<Song>();
	
	public void addSong(Song song) {
		
		//ArrayList<Song> lists = new ArrayList<Song>();

		
		for (Song s : lists) {

			if (s.songName.equals(song.songName) && s.movieName.equals(song.movieName)) {
				System.out.println("Song is already added to the playlist");
				//return;
				
			}
			
			else {
				
				lists.add(song);
				System.out.println("Song added to the playlist successfully.");
			}
		}
			

	}
	
}
