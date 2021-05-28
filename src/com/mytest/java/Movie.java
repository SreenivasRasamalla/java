package com.mytest.java;



class Movie {
	private String movieName;
	private int rating;
	
	
	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", rating=" + rating + "]";
	}


	public Movie(String movieName, int rating) {
		super();
		this.movieName = movieName;
		this.rating = rating;
	}


	public String getMovieName() {
		return movieName;
	}


	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}


	public int getRating() {
		return rating;
	}


	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
	
}