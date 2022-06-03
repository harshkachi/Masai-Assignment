package com.Question3;

public class Song {
	
	String movieName;
	String songName;

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}
	
	
	public void play() {
		
		System.out.println(songName + "of" + movieName+ "is playing...!");
	}
	

}
