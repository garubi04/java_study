package com.edu.oop;

public class Movie {
	public String title;
	public String genre;
	public int rating;
	
	// 명시적 생성자가 하나라도 있으면 컴파일러가 기본 생성자를 대신 넣어주지 않는다
	//public Movie() {}
	
	//필드 주입의 통로1
	public Movie(String title, String genre, int rating) {
		this.title = title;
		this.genre = genre;
		this.rating = rating;
	}
	
	public void playit() {
		System.out.println("Playing the movie");
	}

		public void setMovie(String title, String genre, int rating) {
		this.title = title;
		this.genre = genre;
		this.rating = rating;
	}
		
	public String getMovieInfo() {
		return title+"."+genre+","+rating;
	}
}
