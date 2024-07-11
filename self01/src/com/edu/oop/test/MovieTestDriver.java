package com.edu.oop.test;

import com.edu.oop.Movie;

public class MovieTestDriver {
	public static void main(String[] args) {
		Movie one = new Movie("a", "b", -2);
		Movie two = new Movie("a", "b", -2);
		Movie three = new Movie("a", "b", -2);
		
		System.out.println(one.getMovieInfo());
		System.out.println(two.getMovieInfo());
		System.out.println(three.getMovieInfo());
	}
}
