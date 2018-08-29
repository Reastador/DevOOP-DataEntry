package com.sjd.newsessionconnection;

import java.util.ArrayList;

import java.util.List;

import com.sjd.newsession.NewSession;
import com.sjd.randomizer.Randomizer;

public class NewSessionConection {
 
	List <NewSession> list = new ArrayList<>();	
	
	public void listAdd() {
		NewSession newsession = new NewSession();
        newsession.setId(Randomizer.idCreation());
		
		newsession.setTime(Randomizer.dateCreation());
		
		newsession.setSession(Randomizer.sesionCreation());
		list.add(newsession);
	}
	public String showList() {
		String info ="";
		for(NewSession e : list) {
	    info += (String) e.getClass().getSimpleName() +" " +  e.getTime() + " " + e.getSession()+ " " + e.getId() + "\n";
		}
	return info;	
	}
}
