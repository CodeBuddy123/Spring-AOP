package com.ashsoft.services;

import com.ashsoft.beans.Movie;

public class MovieServiceImpl implements MovieService {

	@Override
	public void displayMovie(Movie movie) throws Exception{
		System.out.println("Movie Details");
		System.out.println("--------------------------");
		System.out.println("Movie Name   :"+movie.getMovieName());
		System.out.println("Ticket Price :"+movie.getPrice());
		System.out.println("Show Time    :"+movie.getShowTime());
		
		throw new RuntimeException("Power Failure"); //When this exception is thrown out,Advice is executed

	}

}
