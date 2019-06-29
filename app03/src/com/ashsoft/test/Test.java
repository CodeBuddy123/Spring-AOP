package com.ashsoft.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ashsoft.beans.Movie;
import com.ashsoft.services.MovieService;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("/com/ashsoft/resources/applicationContext.xml");
		Movie movie=(Movie) context.getBean("movieBean");
		MovieService movieService=(MovieService) context.getBean("proxy");
		try {
			movieService.displayMovie(movie);
		} catch (Exception e) {			
			//e.printStackTrace();
		}
	}
}
