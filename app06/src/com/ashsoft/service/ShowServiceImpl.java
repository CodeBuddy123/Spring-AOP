package com.ashsoft.service;

import com.ashsoft.beans.Show;

public class ShowServiceImpl implements ShowService {

	@Override
	public String runShow(Show show) throws RuntimeException {
		System.out.println("*************************************");
		System.out.println("Show "+show.getName()+ " Started");
		System.out.println("Show Running Successfully");
		if(!show.getName().equalsIgnoreCase("mimicry"))
		{
			throw new RuntimeException("Show Interruption");
		}
		System.out.println("Show "+show.getName()+ " Ended");
		System.out.println("**************************************");
		return "Success";
	}

}
